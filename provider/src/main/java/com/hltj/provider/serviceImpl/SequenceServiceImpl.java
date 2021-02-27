package com.hltj.provider.serviceImpl;

import com.hltj.api.dao.TSequenceMapper;
import com.hltj.api.domain.TSequence;
import com.hltj.api.domain.TSequenceExample;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.SequenceService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/27 12:40
 */
@Service("sequenceService")
public class SequenceServiceImpl implements SequenceService {
    private static final Logger logger = LoggerFactory.getLogger(SequenceService.class);
    private static final int GET_RETRY_TIMES = 10;

    @Resource
    private TSequenceMapper sequenceDao;
    @Override
    public int getSequenceValue(String sequenceName) {
        TSequence sequence= null;
        int update=0;
        for (int i = 0; i < GET_RETRY_TIMES; i++) {
            sequence = sequenceDao.selectByPrimaryKey(sequenceName);
            if (sequence==null){
                try {
                    TSequence entity = new TSequence();
                    entity.setSequenceName(sequenceName);
                    entity.setSequenceValue(1);
                    entity.setVersion(1);
                    sequenceDao.insertSelective(entity);
                }catch (Exception e){
                    if (e instanceof DuplicateKeyException){
                        logger.warn("编号已经存在！sequenceName:{},reason:{}",sequenceName,e.getMessage());
                    }else {
                        logger.warn("添加编号失败！sequenceName:{},reason:{}",sequenceName,e.getMessage());
                    }
                }
                continue;
            }
            int oldVersion = sequence.getVersion();
            update =  sequence.getSequenceValue()+1;
            sequence.setSequenceValue(update);
            sequence.setVersion(oldVersion+1);

            TSequenceExample sequenceExample = new TSequenceExample();
            sequenceExample.createCriteria().andSequenceNameEqualTo(sequenceName)
                    .andVersionEqualTo(oldVersion);

            int result = sequenceDao.updateByExample(sequence,sequenceExample);
            if (result == 1) {
                return update;
            }
        }
        return -1;
    }

    @Override
    public String getBussId(String sequenceName,String prefix){
        int sequenceValue = getSequenceValue(sequenceName);
        if (sequenceValue > -1) {
            String versionKey = prefix.concat(StringUtils.leftPad(String.valueOf(sequenceValue), 8, "0"));
            return versionKey;
        } else {
            throw new BussException("生成数据唯一性编号失败");
        }
    }
}
