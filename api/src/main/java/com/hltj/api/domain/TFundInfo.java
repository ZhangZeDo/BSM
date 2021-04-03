package com.hltj.api.domain;

import java.math.BigDecimal;
import java.util.Date;

public class TFundInfo extends BaseEntity {
    private Integer id;

    private String fundName;

    private String stockCode;

    private Date buyInoutDate;

    private Byte operateDirect;

    private BigDecimal stockNum;

    private BigDecimal stockRate;

    private BigDecimal buyInoutPrice;

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

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public Date getBuyInoutDate() {
        return buyInoutDate;
    }

    public void setBuyInoutDate(Date buyInoutDate) {
        this.buyInoutDate = buyInoutDate;
    }

    public Byte getOperateDirect() {
        return operateDirect;
    }

    public void setOperateDirect(Byte operateDirect) {
        this.operateDirect = operateDirect;
    }

    public BigDecimal getStockNum() {
        return stockNum;
    }

    public void setStockNum(BigDecimal stockNum) {
        this.stockNum = stockNum;
    }

    public BigDecimal getStockRate() {
        return stockRate;
    }

    public void setStockRate(BigDecimal stockRate) {
        this.stockRate = stockRate;
    }

    public BigDecimal getBuyInoutPrice() {
        return buyInoutPrice;
    }

    public void setBuyInoutPrice(BigDecimal buyInoutPrice) {
        this.buyInoutPrice = buyInoutPrice;
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