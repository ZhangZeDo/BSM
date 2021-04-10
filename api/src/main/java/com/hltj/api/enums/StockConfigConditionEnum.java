package com.hltj.api.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/10 10:14
 */
public enum StockConfigConditionEnum {
    listing_date("listing_date","上市年份"),
    industry("industry","行业"),
    market_value("market_value","发行市值"),
    heap_rate("heap_rate","一手中签率");

    private String code;
    private String desc;

    StockConfigConditionEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static List<String> getAllEnumDesc(){
        List<String> enumDescList = new ArrayList<>();
        for (StockConfigConditionEnum stockConfigConditionEnum: StockConfigConditionEnum.values()) {
            enumDescList.add(stockConfigConditionEnum.getDesc());
        }
        return enumDescList;
    }
}
