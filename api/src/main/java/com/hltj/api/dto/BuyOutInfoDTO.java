package com.hltj.api.dto;

import com.hltj.api.domain.Pager;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/28 11:02
 */
public class BuyOutInfoDTO extends Pager {
    private Integer id;

    private String customerId;

    private String customerName;

    private Date buyOutDate;

    private String stockCode;

    private String stockName;

    private Integer buyOutNumber;

    private BigDecimal buyOutPrice;

    private BigDecimal buyOutProfit;

    private Date createDatetime;

    private String createdBy;

    private Date updateDatetime;

    private String updatedBy;

    private String openId;

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
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
        this.updatedBy = updatedBy;
    }
}
