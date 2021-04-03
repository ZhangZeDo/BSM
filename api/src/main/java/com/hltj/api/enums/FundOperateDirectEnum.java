package com.hltj.api.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/3 10:02
 */
public enum FundOperateDirectEnum {
    BUY_OUT((byte)1,"卖出"),
    BUY_IN((byte)2,"买入");
    private Byte code;
    private String desc;

    FundOperateDirectEnum(Byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static Map<String,String> queryEnumMap(){
        Map<String,String> enumMap = new HashMap<>();
        for (FundOperateDirectEnum fundOperateDirectEnum: FundOperateDirectEnum.values()) {
            enumMap.put(String.valueOf(fundOperateDirectEnum.getCode()),fundOperateDirectEnum.getDesc());
        }
        return enumMap;
    }
}
