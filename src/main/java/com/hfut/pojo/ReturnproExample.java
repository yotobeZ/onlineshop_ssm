package com.hfut.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReturnproExample {
    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public ReturnproExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
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

        public Criteria andReturnIdIsNull() {
            addCriterion("ReturnId is null");
            return (Criteria) this;
        }

        public Criteria andReturnIdIsNotNull() {
            addCriterion("ReturnId is not null");
            return (Criteria) this;
        }

        public Criteria andReturnIdEqualTo(Integer value) {
            addCriterion("ReturnId =", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotEqualTo(Integer value) {
            addCriterion("ReturnId <>", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdGreaterThan(Integer value) {
            addCriterion("ReturnId >", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReturnId >=", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLessThan(Integer value) {
            addCriterion("ReturnId <", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdLessThanOrEqualTo(Integer value) {
            addCriterion("ReturnId <=", value, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdIn(List<Integer> values) {
            addCriterion("ReturnId in", values, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotIn(List<Integer> values) {
            addCriterion("ReturnId not in", values, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdBetween(Integer value1, Integer value2) {
            addCriterion("ReturnId between", value1, value2, "returnId");
            return (Criteria) this;
        }

        public Criteria andReturnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ReturnId not between", value1, value2, "returnId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNull() {
            addCriterion("SaleId is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("SaleId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Integer value) {
            addCriterion("SaleId =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Integer value) {
            addCriterion("SaleId <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Integer value) {
            addCriterion("SaleId >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleId >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Integer value) {
            addCriterion("SaleId <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("SaleId <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Integer> values) {
            addCriterion("SaleId in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Integer> values) {
            addCriterion("SaleId not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("SaleId between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleId not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("ProId is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("ProId is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("ProId =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("ProId <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("ProId >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProId >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("ProId <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("ProId <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("ProId in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("ProId not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("ProId between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ProId not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andReturnNumIsNull() {
            addCriterion("ReturnNum is null");
            return (Criteria) this;
        }

        public Criteria andReturnNumIsNotNull() {
            addCriterion("ReturnNum is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNumEqualTo(Integer value) {
            addCriterion("ReturnNum =", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotEqualTo(Integer value) {
            addCriterion("ReturnNum <>", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumGreaterThan(Integer value) {
            addCriterion("ReturnNum >", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReturnNum >=", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumLessThan(Integer value) {
            addCriterion("ReturnNum <", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumLessThanOrEqualTo(Integer value) {
            addCriterion("ReturnNum <=", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumIn(List<Integer> values) {
            addCriterion("ReturnNum in", values, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotIn(List<Integer> values) {
            addCriterion("ReturnNum not in", values, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumBetween(Integer value1, Integer value2) {
            addCriterion("ReturnNum between", value1, value2, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ReturnNum not between", value1, value2, "returnNum");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Sat Sep 15 21:02:30 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
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