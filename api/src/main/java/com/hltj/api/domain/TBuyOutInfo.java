package com.hltj.api.domain;

import java.math.BigDecimal;
import java.util.Date;

public class TBuyOutInfo extends BaseEntity {
    private Integer id;

    private String customerId;

    private Date buyOutDate;

    private String stockCode;

    private Integer buyOutNumber;

    private BigDecimal buyOutPrice;

    private BigDecimal buyOutProfit;

    private Date createDatetime;

    private String createdBy;

    private Date updateDatetime;

    private String updatedBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Date getBuyOutDate() {
        return buyOutDate;
    }

    public void setBuyOutDate(Date buyOutDate) {
        this.buyOutDate = buyOutDate;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public Integer getBuyOutNumber() {
        return buyOutNumber;
    }

    public void setBuyOutNumber(Integer buyOutNumber) {
        this.buyOutNumber = buyOutNumber;
    }

    public BigDecimal getBuyOutPrice() {
        return buyOutPrice;
    }

    public void setBuyOutPrice(BigDecimal buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
    }

    public BigDecimal getBuyOutProfit() {
        return buyOutProfit;
    }

    public void setBuyOutProfit(BigDecimal buyOutProfit) {
        this.buyOutProfit = buyOutProfit;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}