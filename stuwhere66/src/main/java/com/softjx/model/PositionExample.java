package com.softjx.model;

import java.util.ArrayList;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionExample() {
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

        public Criteria andPoIdIsNull() {
            addCriterion("po_id is null");
            return (Criteria) this;
        }

        public Criteria andPoIdIsNotNull() {
            addCriterion("po_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoIdEqualTo(Integer value) {
            addCriterion("po_id =", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotEqualTo(Integer value) {
            addCriterion("po_id <>", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThan(Integer value) {
            addCriterion("po_id >", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_id >=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThan(Integer value) {
            addCriterion("po_id <", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThanOrEqualTo(Integer value) {
            addCriterion("po_id <=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdIn(List<Integer> values) {
            addCriterion("po_id in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotIn(List<Integer> values) {
            addCriterion("po_id not in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdBetween(Integer value1, Integer value2) {
            addCriterion("po_id between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("po_id not between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoCodeIsNull() {
            addCriterion("po_code is null");
            return (Criteria) this;
        }

        public Criteria andPoCodeIsNotNull() {
            addCriterion("po_code is not null");
            return (Criteria) this;
        }

        public Criteria andPoCodeEqualTo(String value) {
            addCriterion("po_code =", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotEqualTo(String value) {
            addCriterion("po_code <>", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeGreaterThan(String value) {
            addCriterion("po_code >", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("po_code >=", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLessThan(String value) {
            addCriterion("po_code <", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLessThanOrEqualTo(String value) {
            addCriterion("po_code <=", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLike(String value) {
            addCriterion("po_code like", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotLike(String value) {
            addCriterion("po_code not like", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeIn(List<String> values) {
            addCriterion("po_code in", values, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotIn(List<String> values) {
            addCriterion("po_code not in", values, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeBetween(String value1, String value2) {
            addCriterion("po_code between", value1, value2, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotBetween(String value1, String value2) {
            addCriterion("po_code not between", value1, value2, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoNameIsNull() {
            addCriterion("po_name is null");
            return (Criteria) this;
        }

        public Criteria andPoNameIsNotNull() {
            addCriterion("po_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoNameEqualTo(String value) {
            addCriterion("po_name =", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameNotEqualTo(String value) {
            addCriterion("po_name <>", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameGreaterThan(String value) {
            addCriterion("po_name >", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameGreaterThanOrEqualTo(String value) {
            addCriterion("po_name >=", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameLessThan(String value) {
            addCriterion("po_name <", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameLessThanOrEqualTo(String value) {
            addCriterion("po_name <=", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameLike(String value) {
            addCriterion("po_name like", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameNotLike(String value) {
            addCriterion("po_name not like", value, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameIn(List<String> values) {
            addCriterion("po_name in", values, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameNotIn(List<String> values) {
            addCriterion("po_name not in", values, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameBetween(String value1, String value2) {
            addCriterion("po_name between", value1, value2, "poName");
            return (Criteria) this;
        }

        public Criteria andPoNameNotBetween(String value1, String value2) {
            addCriterion("po_name not between", value1, value2, "poName");
            return (Criteria) this;
        }

        public Criteria andPoFlagIsNull() {
            addCriterion("po_flag is null");
            return (Criteria) this;
        }

        public Criteria andPoFlagIsNotNull() {
            addCriterion("po_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPoFlagEqualTo(Boolean value) {
            addCriterion("po_flag =", value, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagNotEqualTo(Boolean value) {
            addCriterion("po_flag <>", value, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagGreaterThan(Boolean value) {
            addCriterion("po_flag >", value, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("po_flag >=", value, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagLessThan(Boolean value) {
            addCriterion("po_flag <", value, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("po_flag <=", value, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagIn(List<Boolean> values) {
            addCriterion("po_flag in", values, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagNotIn(List<Boolean> values) {
            addCriterion("po_flag not in", values, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("po_flag between", value1, value2, "poFlag");
            return (Criteria) this;
        }

        public Criteria andPoFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("po_flag not between", value1, value2, "poFlag");
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