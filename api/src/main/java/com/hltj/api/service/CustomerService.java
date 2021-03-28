package com.hltj.api.service;

import com.hltj.api.domain.TCustomer;
import com.hltj.api.dto.CustomerDTO;
import com.hltj.api.dto.PageResponseResult;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/28 10:24
 */
public interface CustomerService {
    PageResponseResult queryCustomerList(CustomerDTO customerDTO);

    void insertCustomerInfo(TCustomer customer,String operator);

    TCustomer queryCustomerByOpenID(String openId);
}
