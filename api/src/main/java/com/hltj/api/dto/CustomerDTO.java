package com.hltj.api.dto;

import com.hltj.api.domain.Pager;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/28 10:25
 */
public class CustomerDTO extends Pager {
    private String customerPhone;
    private String customerId;

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
