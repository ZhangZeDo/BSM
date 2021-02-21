package com.hltj.provider.serviceImpl;

import com.hltj.api.dao.TUserMapper;
import com.hltj.api.domain.TUser;
import com.hltj.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private TUserMapper userDao;

    @Override
    public TUser queryById() {
        return null;
    }
}
