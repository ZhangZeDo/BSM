package com.hltj.api.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBuyOutInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBuyOutInfoExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateIsNull() {
            addCriterion("buy_out_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateIsNotNull() {
            addCriterion("buy_out_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateEqualTo(Date value) {
            addCriterion("buy_out_date =", value, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateNotEqualTo(Date value) {
            addCriterion("buy_out_date <>", value, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateGreaterThan(Date value) {
            addCriterion("buy_out_date >", value, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_out_date >=", value, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateLessThan(Date value) {
            addCriterion("buy_out_date <", value, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateLessThanOrEqualTo(Date value) {
            addCriterion("buy_out_date <=", value, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateIn(List<Date> values) {
            addCriterion("buy_out_date in", values, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateNotIn(List<Date> values) {
            addCriterion("buy_out_date not in", values, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateBetween(Date value1, Date value2) {
            addCriterion("buy_out_date between", value1, value2, "buyOutDate");
            return (Criteria) this;
        }

        public Criteria andBuyOutDateNotBetween(Date value1, Date value2) {
            addCriterion("buy_out_date not between", value1, value2, "buyOutDate");
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

        public Criteria andBuyOutNumberIsNull() {
            addCriterion("buy_out_number is null");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberIsNotNull() {
            addCriterion("buy_out_number is not null");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberEqualTo(Integer value) {
            addCriterion("buy_out_number =", value, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberNotEqualTo(Integer value) {
            addCriterion("buy_out_number <>", value, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberGreaterThan(Integer value) {
            addCriterion("buy_out_number >", value, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_out_number >=", value, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberLessThan(Integer value) {
            addCriterion("buy_out_number <", value, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberLessThanOrEqualTo(Integer value) {
            addCriterion("buy_out_number <=", value, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberIn(List<Integer> values) {
            addCriterion("buy_out_number in", values, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberNotIn(List<Integer> values) {
            addCriterion("buy_out_number not in", values, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberBetween(Integer value1, Integer value2) {
            addCriterion("buy_out_number between", value1, value2, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_out_number not between", value1, value2, "buyOutNumber");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceIsNull() {
            addCriterion("buy_out_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceIsNotNull() {
            addCriterion("buy_out_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceEqualTo(BigDecimal value) {
            addCriterion("buy_out_price =", value, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceNotEqualTo(BigDecimal value) {
            addCriterion("buy_out_price <>", value, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceGreaterThan(BigDecimal value) {
            addCriterion("buy_out_price >", value, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_out_price >=", value, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceLessThan(BigDecimal value) {
            addCriterion("buy_out_price <", value, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_out_price <=", value, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceIn(List<BigDecimal> values) {
            addCriterion("buy_out_price in", values, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceNotIn(List<BigDecimal> values) {
            addCriterion("buy_out_price not in", values, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_out_price between", value1, value2, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_out_price not between", value1, value2, "buyOutPrice");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitIsNull() {
            addCriterion("buy_out_profit is null");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitIsNotNull() {
            addCriterion("buy_out_profit is not null");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitEqualTo(BigDecimal value) {
            addCriterion("buy_out_profit =", value, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitNotEqualTo(BigDecimal value) {
            addCriterion("buy_out_profit <>", value, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitGreaterThan(BigDecimal value) {
            addCriterion("buy_out_profit >", value, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_out_profit >=", value, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitLessThan(BigDecimal value) {
            addCriterion("buy_out_profit <", value, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_out_profit <=", value, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitIn(List<BigDecimal> values) {
            addCriterion("buy_out_profit in", values, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitNotIn(List<BigDecimal> values) {
            addCriterion("buy_out_profit not in", values, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_out_profit between", value1, value2, "buyOutProfit");
            return (Criteria) this;
        }

        public Criteria andBuyOutProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_out_profit not between", value1, value2, "buyOutProfit");
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