package com.hltj.api.service;

import com.hltj.api.domain.TUser;

/**
 * @author
 * @date
 * @describe
 */
public interface LoginService {
    void createLoginInfo(TUser user);

    TUser getLoginInfo();

    void loginOut();
}
