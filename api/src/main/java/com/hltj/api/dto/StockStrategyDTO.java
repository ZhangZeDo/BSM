package com.hltj.api.dto;

import com.hltj.api.domain.Pager;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/14 11:13
 */
public class StockStrategyDTO extends Pager {
    private String stockCode;
    private String stockName;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
