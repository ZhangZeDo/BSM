package com.hltj.api.service;

import com.hltj.api.domain.TUser;

/**
 * @author
 * @date
 * @describe 后台登录用户操作服务类
 */
public interface UserService {
    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    TUser queryUserByName(String userName);

    void insertUser(TUser user,String operator);


}
