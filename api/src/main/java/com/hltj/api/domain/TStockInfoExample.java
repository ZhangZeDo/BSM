package com.hltj.api.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStockInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStockInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andListingDateIsNull() {
            addCriterion("listing_date is null");
            return (Criteria) this;
        }

        public Criteria andListingDateIsNotNull() {
            addCriterion("listing_date is not null");
            return (Criteria) this;
        }

        public Criteria andListingDateEqualTo(Date value) {
            addCriterion("listing_date =", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateNotEqualTo(Date value) {
            addCriterion("listing_date <>", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateGreaterThan(Date value) {
            addCriterion("listing_date >", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("listing_date >=", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateLessThan(Date value) {
            addCriterion("listing_date <", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateLessThanOrEqualTo(Date value) {
            addCriterion("listing_date <=", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateIn(List<Date> values) {
            addCriterion("listing_date in", values, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateNotIn(List<Date> values) {
            addCriterion("listing_date not in", values, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateBetween(Date value1, Date value2) {
            addCriterion("listing_date between", value1, value2, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateNotBetween(Date value1, Date value2) {
            addCriterion("listing_date not between", value1, value2, "listingDate");
            return (Criteria) this;
        }

        public Criteria andMarketValueIsNull() {
            addCriterion("market_value is null");
            return (Criteria) this;
        }

        public Criteria andMarketValueIsNotNull() {
            addCriterion("market_value is not null");
            return (Criteria) this;
        }

        public Criteria andMarketValueEqualTo(BigDecimal value) {
            addCriterion("market_value =", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotEqualTo(BigDecimal value) {
            addCriterion("market_value <>", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueGreaterThan(BigDecimal value) {
            addCriterion("market_value >", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_value >=", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLessThan(BigDecimal value) {
            addCriterion("market_value <", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_value <=", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueIn(List<BigDecimal> values) {
            addCriterion("market_value in", values, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotIn(List<BigDecimal> values) {
            addCriterion("market_value not in", values, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_value between", value1, value2, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_value not between", value1, value2, "marketValue");
            return (Criteria) this;
        }

        public Criteria andFundRaiseIsNull() {
            addCriterion("fund_raise is null");
            return (Criteria) this;
        }

        public Criteria andFundRaiseIsNotNull() {
            addCriterion("fund_raise is not null");
            return (Criteria) this;
        }

        public Criteria andFundRaiseEqualTo(BigDecimal value) {
            addCriterion("fund_raise =", value, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseNotEqualTo(BigDecimal value) {
            addCriterion("fund_raise <>", value, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseGreaterThan(BigDecimal value) {
            addCriterion("fund_raise >", value, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fund_raise >=", value, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseLessThan(BigDecimal value) {
            addCriterion("fund_raise <", value, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fund_raise <=", value, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseIn(List<BigDecimal> values) {
            addCriterion("fund_raise in", values, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseNotIn(List<BigDecimal> values) {
            addCriterion("fund_raise not in", values, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fund_raise between", value1, value2, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andFundRaiseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fund_raise not between", value1, value2, "fundRaise");
            return (Criteria) this;
        }

        public Criteria andStockTotalIsNull() {
            addCriterion("stock_total is null");
            return (Criteria) this;
        }

        public Criteria andStockTotalIsNotNull() {
            addCriterion("stock_total is not null");
            return (Criteria) this;
        }

        public Criteria andStockTotalEqualTo(BigDecimal value) {
            addCriterion("stock_total =", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalNotEqualTo(BigDecimal value) {
            addCriterion("stock_total <>", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalGreaterThan(BigDecimal value) {
            addCriterion("stock_total >", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_total >=", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalLessThan(BigDecimal value) {
            addCriterion("stock_total <", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_total <=", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalIn(List<BigDecimal> values) {
            addCriterion("stock_total in", values, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalNotIn(List<BigDecimal> values) {
            addCriterion("stock_total not in", values, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_total between", value1, value2, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_total not between", value1, value2, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andIssueRateIsNull() {
            addCriterion("issue_rate is null");
            return (Criteria) this;
        }

        public Criteria andIssueRateIsNotNull() {
            addCriterion("issue_rate is not null");
            return (Criteria) this;
        }

        public Criteria andIssueRateEqualTo(BigDecimal value) {
            addCriterion("issue_rate =", value, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateNotEqualTo(BigDecimal value) {
            addCriterion("issue_rate <>", value, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateGreaterThan(BigDecimal value) {
            addCriterion("issue_rate >", value, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_rate >=", value, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateLessThan(BigDecimal value) {
            addCriterion("issue_rate <", value, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_rate <=", value, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateIn(List<BigDecimal> values) {
            addCriterion("issue_rate in", values, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateNotIn(List<BigDecimal> values) {
            addCriterion("issue_rate not in", values, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_rate between", value1, value2, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_rate not between", value1, value2, "issueRate");
            return (Criteria) this;
        }

        public Criteria andIssueNumIsNull() {
            addCriterion("issue_num is null");
            return (Criteria) this;
        }

        public Criteria andIssueNumIsNotNull() {
            addCriterion("issue_num is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNumEqualTo(BigDecimal value) {
            addCriterion("issue_num =", value, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumNotEqualTo(BigDecimal value) {
            addCriterion("issue_num <>", value, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumGreaterThan(BigDecimal value) {
            addCriterion("issue_num >", value, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_num >=", value, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumLessThan(BigDecimal value) {
            addCriterion("issue_num <", value, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_num <=", value, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumIn(List<BigDecimal> values) {
            addCriterion("issue_num in", values, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumNotIn(List<BigDecimal> values) {
            addCriterion("issue_num not in", values, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_num between", value1, value2, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssueNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_num not between", value1, value2, "issueNum");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIsNull() {
            addCriterion("issue_price is null");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIsNotNull() {
            addCriterion("issue_price is not null");
            return (Criteria) this;
        }

        public Criteria andIssuePriceEqualTo(BigDecimal value) {
            addCriterion("issue_price =", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotEqualTo(BigDecimal value) {
            addCriterion("issue_price <>", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceGreaterThan(BigDecimal value) {
            addCriterion("issue_price >", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_price >=", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceLessThan(BigDecimal value) {
            addCriterion("issue_price <", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_price <=", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIn(List<BigDecimal> values) {
            addCriterion("issue_price in", values, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotIn(List<BigDecimal> values) {
            addCriterion("issue_price not in", values, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_price between", value1, value2, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_price not between", value1, value2, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andHeapIsNull() {
            addCriterion("heap is null");
            return (Criteria) this;
        }

        public Criteria andHeapIsNotNull() {
            addCriterion("heap is not null");
            return (Criteria) this;
        }

        public Criteria andHeapEqualTo(BigDecimal value) {
            addCriterion("heap =", value, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapNotEqualTo(BigDecimal value) {
            addCriterion("heap <>", value, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapGreaterThan(BigDecimal value) {
            addCriterion("heap >", value, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("heap >=", value, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapLessThan(BigDecimal value) {
            addCriterion("heap <", value, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("heap <=", value, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapIn(List<BigDecimal> values) {
            addCriterion("heap in", values, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapNotIn(List<BigDecimal> values) {
            addCriterion("heap not in", values, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("heap between", value1, value2, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("heap not between", value1, value2, "heap");
            return (Criteria) this;
        }

        public Criteria andHeapPriceIsNull() {
            addCriterion("heap_price is null");
            return (Criteria) this;
        }

        public Criteria andHeapPriceIsNotNull() {
            addCriterion("heap_price is not null");
            return (Criteria) this;
        }

        public Criteria andHeapPriceEqualTo(BigDecimal value) {
            addCriterion("heap_price =", value, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceNotEqualTo(BigDecimal value) {
            addCriterion("heap_price <>", value, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceGreaterThan(BigDecimal value) {
            addCriterion("heap_price >", value, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("heap_price >=", value, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceLessThan(BigDecimal value) {
            addCriterion("heap_price <", value, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("heap_price <=", value, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceIn(List<BigDecimal> values) {
            addCriterion("heap_price in", values, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceNotIn(List<BigDecimal> values) {
            addCriterion("heap_price not in", values, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("heap_price between", value1, value2, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("heap_price not between", value1, value2, "heapPrice");
            return (Criteria) this;
        }

        public Criteria andHeapTotalIsNull() {
            addCriterion("heap_total is null");
            return (Criteria) this;
        }

        public Criteria andHeapTotalIsNotNull() {
            addCriterion("heap_total is not null");
            return (Criteria) this;
        }

        public Criteria andHeapTotalEqualTo(BigDecimal value) {
            addCriterion("heap_total =", value, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalNotEqualTo(BigDecimal value) {
            addCriterion("heap_total <>", value, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalGreaterThan(BigDecimal value) {
            addCriterion("heap_total >", value, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("heap_total >=", value, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalLessThan(BigDecimal value) {
            addCriterion("heap_total <", value, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("heap_total <=", value, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalIn(List<BigDecimal> values) {
            addCriterion("heap_total in", values, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalNotIn(List<BigDecimal> values) {
            addCriterion("heap_total not in", values, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("heap_total between", value1, value2, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("heap_total not between", value1, value2, "heapTotal");
            return (Criteria) this;
        }

        public Criteria andHeapRateIsNull() {
            addCriterion("heap_rate is null");
            return (Criteria) this;
        }

        public Criteria andHeapRateIsNotNull() {
            addCriterion("heap_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHeapRateEqualTo(BigDecimal value) {
            addCriterion("heap_rate =", value, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateNotEqualTo(BigDecimal value) {
            addCriterion("heap_rate <>", value, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateGreaterThan(BigDecimal value) {
            addCriterion("heap_rate >", value, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("heap_rate >=", value, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateLessThan(BigDecimal value) {
            addCriterion("heap_rate <", value, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("heap_rate <=", value, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateIn(List<BigDecimal> values) {
            addCriterion("heap_rate in", values, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateNotIn(List<BigDecimal> values) {
            addCriterion("heap_rate not in", values, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("heap_rate between", value1, value2, "heapRate");
            return (Criteria) this;
        }

        public Criteria andHeapRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("heap_rate not between", value1, value2, "heapRate");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andStockMarketIsNull() {
            addCriterion("stock_market is null");
            return (Criteria) this;
        }

        public Criteria andStockMarketIsNotNull() {
            addCriterion("stock_market is not null");
            return (Criteria) this;
        }

        public Criteria andStockMarketEqualTo(String value) {
            addCriterion("stock_market =", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotEqualTo(String value) {
            addCriterion("stock_market <>", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketGreaterThan(String value) {
            addCriterion("stock_market >", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketGreaterThanOrEqualTo(String value) {
            addCriterion("stock_market >=", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketLessThan(String value) {
            addCriterion("stock_market <", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketLessThanOrEqualTo(String value) {
            addCriterion("stock_market <=", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketLike(String value) {
            addCriterion("stock_market like", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotLike(String value) {
            addCriterion("stock_market not like", value, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketIn(List<String> values) {
            addCriterion("stock_market in", values, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotIn(List<String> values) {
            addCriterion("stock_market not in", values, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketBetween(String value1, String value2) {
            addCriterion("stock_market between", value1, value2, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andStockMarketNotBetween(String value1, String value2) {
            addCriterion("stock_market not between", value1, value2, "stockMarket");
            return (Criteria) this;
        }

        public Criteria andGreenShoesIsNull() {
            addCriterion("green_shoes is null");
            return (Criteria) this;
        }

        public Criteria andGreenShoesIsNotNull() {
            addCriterion("green_shoes is not null");
            return (Criteria) this;
        }

        public Criteria andGreenShoesEqualTo(String value) {
            addCriterion("green_shoes =", value, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesNotEqualTo(String value) {
            addCriterion("green_shoes <>", value, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesGreaterThan(String value) {
            addCriterion("green_shoes >", value, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesGreaterThanOrEqualTo(String value) {
            addCriterion("green_shoes >=", value, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesLessThan(String value) {
            addCriterion("green_shoes <", value, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesLessThanOrEqualTo(String value) {
            addCriterion("green_shoes <=", value, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesLike(String value) {
            addCriterion("green_shoes like", value, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesNotLike(String value) {
            addCriterion("green_shoes not like", value, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesIn(List<String> values) {
            addCriterion("green_shoes in", values, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesNotIn(List<String> values) {
            addCriterion("green_shoes not in", values, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesBetween(String value1, String value2) {
            addCriterion("green_shoes between", value1, value2, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andGreenShoesNotBetween(String value1, String value2) {
            addCriterion("green_shoes not between", value1, value2, "greenShoes");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNull() {
            addCriterion("sponsor is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNotNull() {
            addCriterion("sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorEqualTo(String value) {
            addCriterion("sponsor =", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotEqualTo(String value) {
            addCriterion("sponsor <>", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThan(String value) {
            addCriterion("sponsor >", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor >=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThan(String value) {
            addCriterion("sponsor <", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThanOrEqualTo(String value) {
            addCriterion("sponsor <=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLike(String value) {
            addCriterion("sponsor like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotLike(String value) {
            addCriterion("sponsor not like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorIn(List<String> values) {
            addCriterion("sponsor in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotIn(List<String> values) {
            addCriterion("sponsor not in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorBetween(String value1, String value2) {
            addCriterion("sponsor between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotBetween(String value1, String value2) {
            addCriterion("sponsor not between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNull() {
            addCriterion("investor is null");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNotNull() {
            addCriterion("investor is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorEqualTo(String value) {
            addCriterion("investor =", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotEqualTo(String value) {
            addCriterion("investor <>", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThan(String value) {
            addCriterion("investor >", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThanOrEqualTo(String value) {
            addCriterion("investor >=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThan(String value) {
            addCriterion("investor <", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThanOrEqualTo(String value) {
            addCriterion("investor <=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLike(String value) {
            addCriterion("investor like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotLike(String value) {
            addCriterion("investor not like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorIn(List<String> values) {
            addCriterion("investor in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotIn(List<String> values) {
            addCriterion("investor not in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorBetween(String value1, String value2) {
            addCriterion("investor between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotBetween(String value1, String value2) {
            addCriterion("investor not between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateIsNull() {
            addCriterion("subscribe_rate is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateIsNotNull() {
            addCriterion("subscribe_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateEqualTo(BigDecimal value) {
            addCriterion("subscribe_rate =", value, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateNotEqualTo(BigDecimal value) {
            addCriterion("subscribe_rate <>", value, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateGreaterThan(BigDecimal value) {
            addCriterion("subscribe_rate >", value, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subscribe_rate >=", value, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateLessThan(BigDecimal value) {
            addCriterion("subscribe_rate <", value, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subscribe_rate <=", value, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateIn(List<BigDecimal> values) {
            addCriterion("subscribe_rate in", values, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateNotIn(List<BigDecimal> values) {
            addCriterion("subscribe_rate not in", values, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subscribe_rate between", value1, value2, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andSubscribeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subscribe_rate not between", value1, value2, "subscribeRate");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleIsNull() {
            addCriterion("finance_multiple is null");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleIsNotNull() {
            addCriterion("finance_multiple is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleEqualTo(BigDecimal value) {
            addCriterion("finance_multiple =", value, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleNotEqualTo(BigDecimal value) {
            addCriterion("finance_multiple <>", value, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleGreaterThan(BigDecimal value) {
            addCriterion("finance_multiple >", value, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_multiple >=", value, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleLessThan(BigDecimal value) {
            addCriterion("finance_multiple <", value, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finance_multiple <=", value, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleIn(List<BigDecimal> values) {
            addCriterion("finance_multiple in", values, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleNotIn(List<BigDecimal> values) {
            addCriterion("finance_multiple not in", values, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_multiple between", value1, value2, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andFinanceMultipleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finance_multiple not between", value1, value2, "financeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleIsNull() {
            addCriterion("subscribe_multiple is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleIsNotNull() {
            addCriterion("subscribe_multiple is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleEqualTo(BigDecimal value) {
            addCriterion("subscribe_multiple =", value, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleNotEqualTo(BigDecimal value) {
            addCriterion("subscribe_multiple <>", value, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleGreaterThan(BigDecimal value) {
            addCriterion("subscribe_multiple >", value, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subscribe_multiple >=", value, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleLessThan(BigDecimal value) {
            addCriterion("subscribe_multiple <", value, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subscribe_multiple <=", value, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleIn(List<BigDecimal> values) {
            addCriterion("subscribe_multiple in", values, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleNotIn(List<BigDecimal> values) {
            addCriterion("subscribe_multiple not in", values, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subscribe_multiple between", value1, value2, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andSubscribeMultipleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subscribe_multiple not between", value1, value2, "subscribeMultiple");
            return (Criteria) this;
        }

        public Criteria andDarkRiseIsNull() {
            addCriterion("dark_rise is null");
            return (Criteria) this;
        }

        public Criteria andDarkRiseIsNotNull() {
            addCriterion("dark_rise is not null");
            return (Criteria) this;
        }

        public Criteria andDarkRiseEqualTo(BigDecimal value) {
            addCriterion("dark_rise =", value, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseNotEqualTo(BigDecimal value) {
            addCriterion("dark_rise <>", value, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseGreaterThan(BigDecimal value) {
            addCriterion("dark_rise >", value, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dark_rise >=", value, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseLessThan(BigDecimal value) {
            addCriterion("dark_rise <", value, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dark_rise <=", value, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseIn(List<BigDecimal> values) {
            addCriterion("dark_rise in", values, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseNotIn(List<BigDecimal> values) {
            addCriterion("dark_rise not in", values, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dark_rise between", value1, value2, "darkRise");
            return (Criteria) this;
        }

        public Criteria andDarkRiseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dark_rise not between", value1, value2, "darkRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseIsNull() {
            addCriterion("first_rise is null");
            return (Criteria) this;
        }

        public Criteria andFirstRiseIsNotNull() {
            addCriterion("first_rise is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRiseEqualTo(BigDecimal value) {
            addCriterion("first_rise =", value, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseNotEqualTo(BigDecimal value) {
            addCriterion("first_rise <>", value, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseGreaterThan(BigDecimal value) {
            addCriterion("first_rise >", value, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_rise >=", value, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseLessThan(BigDecimal value) {
            addCriterion("first_rise <", value, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_rise <=", value, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseIn(List<BigDecimal> values) {
            addCriterion("first_rise in", values, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseNotIn(List<BigDecimal> values) {
            addCriterion("first_rise not in", values, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_rise between", value1, value2, "firstRise");
            return (Criteria) this;
        }

        public Criteria andFirstRiseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_rise not between", value1, value2, "firstRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseIsNull() {
            addCriterion("hold_rise is null");
            return (Criteria) this;
        }

        public Criteria andHoldRiseIsNotNull() {
            addCriterion("hold_rise is not null");
            return (Criteria) this;
        }

        public Criteria andHoldRiseEqualTo(BigDecimal value) {
            addCriterion("hold_rise =", value, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseNotEqualTo(BigDecimal value) {
            addCriterion("hold_rise <>", value, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseGreaterThan(BigDecimal value) {
            addCriterion("hold_rise >", value, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_rise >=", value, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseLessThan(BigDecimal value) {
            addCriterion("hold_rise <", value, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_rise <=", value, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseIn(List<BigDecimal> values) {
            addCriterion("hold_rise in", values, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseNotIn(List<BigDecimal> values) {
            addCriterion("hold_rise not in", values, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_rise between", value1, value2, "holdRise");
            return (Criteria) this;
        }

        public Criteria andHoldRiseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_rise not between", value1, value2, "holdRise");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(BigDecimal value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(BigDecimal value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(BigDecimal value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(BigDecimal value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<BigDecimal> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<BigDecimal> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andGroupATopIsNull() {
            addCriterion("group_a_top is null");
            return (Criteria) this;
        }

        public Criteria andGroupATopIsNotNull() {
            addCriterion("group_a_top is not null");
            return (Criteria) this;
        }

        public Criteria andGroupATopEqualTo(BigDecimal value) {
            addCriterion("group_a_top =", value, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopNotEqualTo(BigDecimal value) {
            addCriterion("group_a_top <>", value, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopGreaterThan(BigDecimal value) {
            addCriterion("group_a_top >", value, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_top >=", value, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopLessThan(BigDecimal value) {
            addCriterion("group_a_top <", value, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_top <=", value, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopIn(List<BigDecimal> values) {
            addCriterion("group_a_top in", values, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopNotIn(List<BigDecimal> values) {
            addCriterion("group_a_top not in", values, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_top between", value1, value2, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupATopNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_top not between", value1, value2, "groupATop");
            return (Criteria) this;
        }

        public Criteria andGroupAEndIsNull() {
            addCriterion("group_a_end is null");
            return (Criteria) this;
        }

        public Criteria andGroupAEndIsNotNull() {
            addCriterion("group_a_end is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAEndEqualTo(BigDecimal value) {
            addCriterion("group_a_end =", value, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndNotEqualTo(BigDecimal value) {
            addCriterion("group_a_end <>", value, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndGreaterThan(BigDecimal value) {
            addCriterion("group_a_end >", value, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_end >=", value, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndLessThan(BigDecimal value) {
            addCriterion("group_a_end <", value, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_end <=", value, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndIn(List<BigDecimal> values) {
            addCriterion("group_a_end in", values, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndNotIn(List<BigDecimal> values) {
            addCriterion("group_a_end not in", values, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_end between", value1, value2, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupAEndNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_end not between", value1, value2, "groupAEnd");
            return (Criteria) this;
        }

        public Criteria andGroupARateIsNull() {
            addCriterion("group_a_rate is null");
            return (Criteria) this;
        }

        public Criteria andGroupARateIsNotNull() {
            addCriterion("group_a_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGroupARateEqualTo(BigDecimal value) {
            addCriterion("group_a_rate =", value, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateNotEqualTo(BigDecimal value) {
            addCriterion("group_a_rate <>", value, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateGreaterThan(BigDecimal value) {
            addCriterion("group_a_rate >", value, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_rate >=", value, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateLessThan(BigDecimal value) {
            addCriterion("group_a_rate <", value, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_rate <=", value, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateIn(List<BigDecimal> values) {
            addCriterion("group_a_rate in", values, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateNotIn(List<BigDecimal> values) {
            addCriterion("group_a_rate not in", values, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_rate between", value1, value2, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupARateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_rate not between", value1, value2, "groupARate");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketIsNull() {
            addCriterion("group_a_market is null");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketIsNotNull() {
            addCriterion("group_a_market is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketEqualTo(BigDecimal value) {
            addCriterion("group_a_market =", value, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketNotEqualTo(BigDecimal value) {
            addCriterion("group_a_market <>", value, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketGreaterThan(BigDecimal value) {
            addCriterion("group_a_market >", value, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_market >=", value, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketLessThan(BigDecimal value) {
            addCriterion("group_a_market <", value, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_market <=", value, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketIn(List<BigDecimal> values) {
            addCriterion("group_a_market in", values, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketNotIn(List<BigDecimal> values) {
            addCriterion("group_a_market not in", values, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_market between", value1, value2, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAMarketNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_market not between", value1, value2, "groupAMarket");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitIsNull() {
            addCriterion("group_a_profit is null");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitIsNotNull() {
            addCriterion("group_a_profit is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitEqualTo(BigDecimal value) {
            addCriterion("group_a_profit =", value, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitNotEqualTo(BigDecimal value) {
            addCriterion("group_a_profit <>", value, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitGreaterThan(BigDecimal value) {
            addCriterion("group_a_profit >", value, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_profit >=", value, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitLessThan(BigDecimal value) {
            addCriterion("group_a_profit <", value, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_a_profit <=", value, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitIn(List<BigDecimal> values) {
            addCriterion("group_a_profit in", values, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitNotIn(List<BigDecimal> values) {
            addCriterion("group_a_profit not in", values, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_profit between", value1, value2, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupAProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_a_profit not between", value1, value2, "groupAProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBNumIsNull() {
            addCriterion("group_b_num is null");
            return (Criteria) this;
        }

        public Criteria andGroupBNumIsNotNull() {
            addCriterion("group_b_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBNumEqualTo(Integer value) {
            addCriterion("group_b_num =", value, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumNotEqualTo(Integer value) {
            addCriterion("group_b_num <>", value, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumGreaterThan(Integer value) {
            addCriterion("group_b_num >", value, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_b_num >=", value, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumLessThan(Integer value) {
            addCriterion("group_b_num <", value, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumLessThanOrEqualTo(Integer value) {
            addCriterion("group_b_num <=", value, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumIn(List<Integer> values) {
            addCriterion("group_b_num in", values, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumNotIn(List<Integer> values) {
            addCriterion("group_b_num not in", values, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumBetween(Integer value1, Integer value2) {
            addCriterion("group_b_num between", value1, value2, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBNumNotBetween(Integer value1, Integer value2) {
            addCriterion("group_b_num not between", value1, value2, "groupBNum");
            return (Criteria) this;
        }

        public Criteria andGroupBTopIsNull() {
            addCriterion("group_b_top is null");
            return (Criteria) this;
        }

        public Criteria andGroupBTopIsNotNull() {
            addCriterion("group_b_top is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBTopEqualTo(BigDecimal value) {
            addCriterion("group_b_top =", value, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopNotEqualTo(BigDecimal value) {
            addCriterion("group_b_top <>", value, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopGreaterThan(BigDecimal value) {
            addCriterion("group_b_top >", value, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_b_top >=", value, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopLessThan(BigDecimal value) {
            addCriterion("group_b_top <", value, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_b_top <=", value, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopIn(List<BigDecimal> values) {
            addCriterion("group_b_top in", values, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopNotIn(List<BigDecimal> values) {
            addCriterion("group_b_top not in", values, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_b_top between", value1, value2, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBTopNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_b_top not between", value1, value2, "groupBTop");
            return (Criteria) this;
        }

        public Criteria andGroupBRateIsNull() {
            addCriterion("group_b_rate is null");
            return (Criteria) this;
        }

        public Criteria andGroupBRateIsNotNull() {
            addCriterion("group_b_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBRateEqualTo(BigDecimal value) {
            addCriterion("group_b_rate =", value, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateNotEqualTo(BigDecimal value) {
            addCriterion("group_b_rate <>", value, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateGreaterThan(BigDecimal value) {
            addCriterion("group_b_rate >", value, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_b_rate >=", value, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateLessThan(BigDecimal value) {
            addCriterion("group_b_rate <", value, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_b_rate <=", value, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateIn(List<BigDecimal> values) {
            addCriterion("group_b_rate in", values, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateNotIn(List<BigDecimal> values) {
            addCriterion("group_b_rate not in", values, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_b_rate between", value1, value2, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andGroupBRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_b_rate not between", value1, value2, "groupBRate");
            return (Criteria) this;
        }

        public Criteria andPlugHammerIsNull() {
            addCriterion("plug_hammer is null");
            return (Criteria) this;
        }

        public Criteria andPlugHammerIsNotNull() {
            addCriterion("plug_hammer is not null");
            return (Criteria) this;
        }

        public Criteria andPlugHammerEqualTo(Integer value) {
            addCriterion("plug_hammer =", value, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerNotEqualTo(Integer value) {
            addCriterion("plug_hammer <>", value, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerGreaterThan(Integer value) {
            addCriterion("plug_hammer >", value, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerGreaterThanOrEqualTo(Integer value) {
            addCriterion("plug_hammer >=", value, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerLessThan(Integer value) {
            addCriterion("plug_hammer <", value, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerLessThanOrEqualTo(Integer value) {
            addCriterion("plug_hammer <=", value, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerIn(List<Integer> values) {
            addCriterion("plug_hammer in", values, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerNotIn(List<Integer> values) {
            addCriterion("plug_hammer not in", values, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerBetween(Integer value1, Integer value2) {
            addCriterion("plug_hammer between", value1, value2, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andPlugHammerNotBetween(Integer value1, Integer value2) {
            addCriterion("plug_hammer not between", value1, value2, "plugHammer");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketIsNull() {
            addCriterion("group_b_market is null");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketIsNotNull() {
            addCriterion("group_b_market is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketEqualTo(BigDecimal value) {
            addCriterion("group_b_market =", value, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketNotEqualTo(BigDecimal value) {
            addCriterion("group_b_market <>", value, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketGreaterThan(BigDecimal value) {
            addCriterion("group_b_market >", value, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_b_market >=", value, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketLessThan(BigDecimal value) {
            addCriterion("group_b_market <", value, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_b_market <=", value, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketIn(List<BigDecimal> values) {
            addCriterion("group_b_market in", values, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketNotIn(List<BigDecimal> values) {
            addCriterion("group_b_market not in", values, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_b_market between", value1, value2, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBMarketNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_b_market not between", value1, value2, "groupBMarket");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitIsNull() {
            addCriterion("group_b_profit is null");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitIsNotNull() {
            addCriterion("group_b_profit is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitEqualTo(BigDecimal value) {
            addCriterion("group_b_profit =", value, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitNotEqualTo(BigDecimal value) {
            addCriterion("group_b_profit <>", value, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitGreaterThan(BigDecimal value) {
            addCriterion("group_b_profit >", value, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("group_b_profit >=", value, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitLessThan(BigDecimal value) {
            addCriterion("group_b_profit <", value, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("group_b_profit <=", value, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitIn(List<BigDecimal> values) {
            addCriterion("group_b_profit in", values, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitNotIn(List<BigDecimal> values) {
            addCriterion("group_b_profit not in", values, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_b_profit between", value1, value2, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andGroupBProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("group_b_profit not between", value1, value2, "groupBProfit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("create_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("create_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("create_datetime =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("create_datetime <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("create_datetime >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_datetime >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("create_datetime <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("create_datetime <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("create_datetime in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("create_datetime not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("create_datetime between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("create_datetime not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("update_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("update_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("update_datetime =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("update_datetime <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("update_datetime >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_datetime >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("update_datetime <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("update_datetime <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("update_datetime in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("update_datetime not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("update_datetime between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("update_datetime not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}