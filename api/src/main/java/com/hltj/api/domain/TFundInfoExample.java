package com.hltj.api.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TFundInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFundInfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNull() {
            addCriterion("fund_name is null");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNotNull() {
            addCriterion("fund_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEqualTo(String value) {
            addCriterion("fund_name =", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotEqualTo(String value) {
            addCriterion("fund_name <>", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThan(String value) {
            addCriterion("fund_name >", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_name >=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThan(String value) {
            addCriterion("fund_name <", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThanOrEqualTo(String value) {
            addCriterion("fund_name <=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLike(String value) {
            addCriterion("fund_name like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotLike(String value) {
            addCriterion("fund_name not like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameIn(List<String> values) {
            addCriterion("fund_name in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotIn(List<String> values) {
            addCriterion("fund_name not in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameBetween(String value1, String value2) {
            addCriterion("fund_name between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotBetween(String value1, String value2) {
            addCriterion("fund_name not between", value1, value2, "fundName");
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

        public Criteria andBuyInoutDateIsNull() {
            addCriterion("buy_inout_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateIsNotNull() {
            addCriterion("buy_inout_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateEqualTo(Date value) {
            addCriterion("buy_inout_date =", value, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateNotEqualTo(Date value) {
            addCriterion("buy_inout_date <>", value, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateGreaterThan(Date value) {
            addCriterion("buy_inout_date >", value, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_inout_date >=", value, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateLessThan(Date value) {
            addCriterion("buy_inout_date <", value, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateLessThanOrEqualTo(Date value) {
            addCriterion("buy_inout_date <=", value, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateIn(List<Date> values) {
            addCriterion("buy_inout_date in", values, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateNotIn(List<Date> values) {
            addCriterion("buy_inout_date not in", values, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateBetween(Date value1, Date value2) {
            addCriterion("buy_inout_date between", value1, value2, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutDateNotBetween(Date value1, Date value2) {
            addCriterion("buy_inout_date not between", value1, value2, "buyInoutDate");
            return (Criteria) this;
        }

        public Criteria andOperateDirectIsNull() {
            addCriterion("operate_direct is null");
            return (Criteria) this;
        }

        public Criteria andOperateDirectIsNotNull() {
            addCriterion("operate_direct is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDirectEqualTo(Byte value) {
            addCriterion("operate_direct =", value, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectNotEqualTo(Byte value) {
            addCriterion("operate_direct <>", value, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectGreaterThan(Byte value) {
            addCriterion("operate_direct >", value, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectGreaterThanOrEqualTo(Byte value) {
            addCriterion("operate_direct >=", value, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectLessThan(Byte value) {
            addCriterion("operate_direct <", value, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectLessThanOrEqualTo(Byte value) {
            addCriterion("operate_direct <=", value, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectIn(List<Byte> values) {
            addCriterion("operate_direct in", values, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectNotIn(List<Byte> values) {
            addCriterion("operate_direct not in", values, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectBetween(Byte value1, Byte value2) {
            addCriterion("operate_direct between", value1, value2, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andOperateDirectNotBetween(Byte value1, Byte value2) {
            addCriterion("operate_direct not between", value1, value2, "operateDirect");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNull() {
            addCriterion("stock_num is null");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNotNull() {
            addCriterion("stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumEqualTo(BigDecimal value) {
            addCriterion("stock_num =", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotEqualTo(BigDecimal value) {
            addCriterion("stock_num <>", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThan(BigDecimal value) {
            addCriterion("stock_num >", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_num >=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThan(BigDecimal value) {
            addCriterion("stock_num <", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_num <=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumIn(List<BigDecimal> values) {
            addCriterion("stock_num in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotIn(List<BigDecimal> values) {
            addCriterion("stock_num not in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_num between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_num not between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockRateIsNull() {
            addCriterion("stock_rate is null");
            return (Criteria) this;
        }

        public Criteria andStockRateIsNotNull() {
            addCriterion("stock_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStockRateEqualTo(BigDecimal value) {
            addCriterion("stock_rate =", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateNotEqualTo(BigDecimal value) {
            addCriterion("stock_rate <>", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateGreaterThan(BigDecimal value) {
            addCriterion("stock_rate >", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_rate >=", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateLessThan(BigDecimal value) {
            addCriterion("stock_rate <", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_rate <=", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateIn(List<BigDecimal> values) {
            addCriterion("stock_rate in", values, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateNotIn(List<BigDecimal> values) {
            addCriterion("stock_rate not in", values, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_rate between", value1, value2, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_rate not between", value1, value2, "stockRate");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceIsNull() {
            addCriterion("buy_inout_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceIsNotNull() {
            addCriterion("buy_inout_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceEqualTo(BigDecimal value) {
            addCriterion("buy_inout_price =", value, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceNotEqualTo(BigDecimal value) {
            addCriterion("buy_inout_price <>", value, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceGreaterThan(BigDecimal value) {
            addCriterion("buy_inout_price >", value, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_inout_price >=", value, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceLessThan(BigDecimal value) {
            addCriterion("buy_inout_price <", value, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_inout_price <=", value, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceIn(List<BigDecimal> values) {
            addCriterion("buy_inout_price in", values, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceNotIn(List<BigDecimal> values) {
            addCriterion("buy_inout_price not in", values, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_inout_price between", value1, value2, "buyInoutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyInoutPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_inout_price not between", value1, value2, "buyInoutPrice");
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