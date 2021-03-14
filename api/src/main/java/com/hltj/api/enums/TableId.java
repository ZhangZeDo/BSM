package com.hltj.api.enums;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/27 12:05
 */
public enum TableId {
    ID_T_USER("01","SEQ_T_USERG"),
    ID_T_CUSTOMER("02","SEQ_T_CUSTOMER"),
    ID_T_STOCK_INFO("03","SEQ_T_STOCK_INFO");


    private String code;
    private String sequenceName;

    TableId(String code, String sequenceName) {
        this.code = code;
        this.sequenceName = sequenceName;
    }

    public String getCode() {
        return code;
    }

    public String getSequenceName() {
        return sequenceName;
    }
}