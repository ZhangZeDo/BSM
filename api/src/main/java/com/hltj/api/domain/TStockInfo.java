package com.hltj.api.domain;

import java.math.BigDecimal;
import java.util.Date;

public class TStockInfo extends BaseEntity {
    private String id;

    private String stockCode;

    private String stockName;

    private Date listingDate;

    private BigDecimal marketValue;

    private BigDecimal fundRaise;

    private BigDecimal stockTotal;

    private BigDecimal issueRate;

    private BigDecimal issueNum;

    private BigDecimal issuePrice;

    private BigDecimal heap;

    private BigDecimal heapPrice;

    private BigDecimal heapTotal;

    private BigDecimal heapRate;

    private String address;

    private String industry;

    private String stockMarket;

    private String greenShoes;

    private String sponsor;

    private String investor;

    private BigDecimal subscribeRate;

    private BigDecimal financeMultiple;

    private BigDecimal subscribeMultiple;

    private BigDecimal darkRise;

    private BigDecimal firstRise;

    private BigDecimal holdRise;

    private BigDecimal open;

    private BigDecimal groupATop;

    private BigDecimal groupAEnd;

    private BigDecimal groupARate;

    private BigDecimal groupAMarket;

    private BigDecimal groupAProfit;

    private Integer groupBNum;

    private BigDecimal groupBTop;

    private BigDecimal groupBRate;

    private Integer plugHammer;

    private BigDecimal groupBMarket;

    private BigDecimal groupBProfit;

    private Byte status;

    private Date createDatetime;

    private String createdBy;

    private Date updateDatetime;

    private String updatedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public Date getListingDate() {
        return listingDate;
    }

    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }

    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }

    public BigDecimal getFundRaise() {
        return fundRaise;
    }

    public void setFundRaise(BigDecimal fundRaise) {
        this.fundRaise = fundRaise;
    }

    public BigDecimal getStockTotal() {
        return stockTotal;
    }

    public void setStockTotal(BigDecimal stockTotal) {
        this.stockTotal = stockTotal;
    }

    public BigDecimal getIssueRate() {
        return issueRate;
    }

    public void setIssueRate(BigDecimal issueRate) {
        this.issueRate = issueRate;
    }

    public BigDecimal getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(BigDecimal issueNum) {
        this.issueNum = issueNum;
    }

    public BigDecimal getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(BigDecimal issuePrice) {
        this.issuePrice = issuePrice;
    }

    public BigDecimal getHeap() {
        return heap;
    }

    public void setHeap(BigDecimal heap) {
        this.heap = heap;
    }

    public BigDecimal getHeapPrice() {
        return heapPrice;
    }

    public void setHeapPrice(BigDecimal heapPrice) {
        this.heapPrice = heapPrice;
    }

    public BigDecimal getHeapTotal() {
        return heapTotal;
    }

    public void setHeapTotal(BigDecimal heapTotal) {
        this.heapTotal = heapTotal;
    }

    public BigDecimal getHeapRate() {
        return heapRate;
    }

    public void setHeapRate(BigDecimal heapRate) {
        this.heapRate = heapRate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getStockMarket() {
        return stockMarket;
    }

    public void setStockMarket(String stockMarket) {
        this.stockMarket = stockMarket == null ? null : stockMarket.trim();
    }

    public String getGreenShoes() {
        return greenShoes;
    }

    public void setGreenShoes(String greenShoes) {
        this.greenShoes = greenShoes == null ? null : greenShoes.trim();
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor == null ? null : sponsor.trim();
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor == null ? null : investor.trim();
    }

    public BigDecimal getSubscribeRate() {
        return subscribeRate;
    }

    public void setSubscribeRate(BigDecimal subscribeRate) {
        this.subscribeRate = subscribeRate;
    }

    public BigDecimal getFinanceMultiple() {
        return financeMultiple;
    }

    public void setFinanceMultiple(BigDecimal financeMultiple) {
        this.financeMultiple = financeMultiple;
    }

    public BigDecimal getSubscribeMultiple() {
        return subscribeMultiple;
    }

    public void setSubscribeMultiple(BigDecimal subscribeMultiple) {
        this.subscribeMultiple = subscribeMultiple;
    }

    public BigDecimal getDarkRise() {
        return darkRise;
    }

    public void setDarkRise(BigDecimal darkRise) {
        this.darkRise = darkRise;
    }

    public BigDecimal getFirstRise() {
        return firstRise;
    }

    public void setFirstRise(BigDecimal firstRise) {
        this.firstRise = firstRise;
    }

    public BigDecimal getHoldRise() {
        return holdRise;
    }

    public void setHoldRise(BigDecimal holdRise) {
        this.holdRise = holdRise;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getGroupATop() {
        return groupATop;
    }

    public void setGroupATop(BigDecimal groupATop) {
        this.groupATop = groupATop;
    }

    public BigDecimal getGroupAEnd() {
        return groupAEnd;
    }

    public void setGroupAEnd(BigDecimal groupAEnd) {
        this.groupAEnd = groupAEnd;
    }

    public BigDecimal getGroupARate() {
        return groupARate;
    }

    public void setGroupARate(BigDecimal groupARate) {
        this.groupARate = groupARate;
    }

    public BigDecimal getGroupAMarket() {
        return groupAMarket;
    }

    public void setGroupAMarket(BigDecimal groupAMarket) {
        this.groupAMarket = groupAMarket;
    }

    public BigDecimal getGroupAProfit() {
        return groupAProfit;
    }

    public void setGroupAProfit(BigDecimal groupAProfit) {
        this.groupAProfit = groupAProfit;
    }

    public Integer getGroupBNum() {
        return groupBNum;
    }

    public void setGroupBNum(Integer groupBNum) {
        this.groupBNum = groupBNum;
    }

    public BigDecimal getGroupBTop() {
        return groupBTop;
    }

    public void setGroupBTop(BigDecimal groupBTop) {
        this.groupBTop = groupBTop;
    }

    public BigDecimal getGroupBRate() {
        return groupBRate;
    }

    public void setGroupBRate(BigDecimal groupBRate) {
        this.groupBRate = groupBRate;
    }

    public Integer getPlugHammer() {
        return plugHammer;
    }

    public void setPlugHammer(Integer plugHammer) {
        this.plugHammer = plugHammer;
    }

    public BigDecimal getGroupBMarket() {
        return groupBMarket;
    }

    public void setGroupBMarket(BigDecimal groupBMarket) {
        this.groupBMarket = groupBMarket;
    }

    public BigDecimal getGroupBProfit() {
        return groupBProfit;
    }

    public void setGroupBProfit(BigDecimal groupBProfit) {
        this.groupBProfit = groupBProfit;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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