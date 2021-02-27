package com.hltj.provider.serviceImpl;

import cn.hutool.core.collection.CollectionUtil;
import com.hltj.api.dao.TUserMapper;
import com.hltj.api.domain.TUser;
import com.hltj.api.domain.TUserExample;
import com.hltj.api.enums.TableId;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.SequenceService;
import com.hltj.api.service.UserService;
import com.hltj.provider.utils.UniqIdUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final static String USER_PREFIX = "U";
    @Resource
    private TUserMapper userDao;
    @Resource
    private SequenceService sequenceService;


    @Override
    public TUser queryUserByName(String userName) {
        if (StringUtils.isBlank(userName)){
            logger.error("查询用户信息失败，原因：用户名不能为空");
            throw new BussException("用户名不能为空");
        }
        TUserExample userExample = new TUserExample();
        userExample.createCriteria().andUserNameEqualTo(userName);
        List<TUser> userList = userDao.selectByExample(userExample);
        if (CollectionUtil.isEmpty(userList)){
            return null;
        }
        return userList.get(0);
    }

    @Override
    public void insertUser(TUser user, String operator) {
        TUser userFromDb = queryUserByName(user.getUserName());
        if (userFromDb!=null){
            logger.error("当前用户名已存在，请修改后重试");
            throw new BussException("当前用户名已存在，请修改后重试");
        }
        user.setId(UniqIdUtil.getUniqId());
        user.setUserId(sequenceService.getBussId(TableId.ID_T_USER.getSequenceName(),USER_PREFIX));
        resetUser(user,operator);
        userDao.insertSelective(user);
    }

    private void resetUser(TUser user,String operator){
        Date date = new Date();
        if (StringUtils.isBlank(user.getCreatedBy())){
            user.setCreateDatetime(date);
            user.setCreatedBy(operator);
        }
        user.setUpdateBy(operator);
        user.setUpdateDatetime(date);
    }
}
