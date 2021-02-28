package com.hltj.api.enums;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/27 12:05
 */
public enum TableId {
    ID_T_USER("01","SEQ_T_USERG"),
    ID_T_CUSTOMER("02","SEQ_T_CUSTOMER");


    private String code;
    private String sequenceName;

    TableId(String code, String sequenceName) {
        this.code = code;
        this.sequenceName = sequenceName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }
}