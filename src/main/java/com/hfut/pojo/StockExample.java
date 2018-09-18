package com.hfut.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public StockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
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
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
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

        public Criteria andStoreNumIsNull() {
            addCriterion("StoreNum is null");
            return (Criteria) this;
        }

        public Criteria andStoreNumIsNotNull() {
            addCriterion("StoreNum is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNumEqualTo(Integer value) {
            addCriterion("StoreNum =", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotEqualTo(Integer value) {
            addCriterion("StoreNum <>", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumGreaterThan(Integer value) {
            addCriterion("StoreNum >", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("StoreNum >=", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumLessThan(Integer value) {
            addCriterion("StoreNum <", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumLessThanOrEqualTo(Integer value) {
            addCriterion("StoreNum <=", value, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumIn(List<Integer> values) {
            addCriterion("StoreNum in", values, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotIn(List<Integer> values) {
            addCriterion("StoreNum not in", values, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumBetween(Integer value1, Integer value2) {
            addCriterion("StoreNum between", value1, value2, "storeNum");
            return (Criteria) this;
        }

        public Criteria andStoreNumNotBetween(Integer value1, Integer value2) {
            addCriterion("StoreNum not between", value1, value2, "storeNum");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Sat Sep 15 21:02:36 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
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