package com.hltj.api.enums;

public enum EntityStatus {
    Valid((byte)1,"有效"),
    InValid((byte)0,"无效"),
    All((byte)2,"所有");


    private byte code;
    private String msg;

    EntityStatus(byte code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public byte getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
