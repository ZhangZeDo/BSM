package com.hltj.api.dto;

import com.hltj.api.domain.Pager;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/7 9:13
 */
public class StockInfoDTO extends Pager {
    private String stockCode;
    private String stockMarket;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockMarket() {
        return stockMarket;
    }

    public void setStockMarket(String stockMarket) {
        this.stockMarket = stockMarket;
    }
}
