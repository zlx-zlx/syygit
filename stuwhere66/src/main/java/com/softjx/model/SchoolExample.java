package com.softjx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andSchIdIsNull() {
            addCriterion("sch_id is null");
            return (Criteria) this;
        }

        public Criteria andSchIdIsNotNull() {
            addCriterion("sch_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchIdEqualTo(Integer value) {
            addCriterion("sch_id =", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotEqualTo(Integer value) {
            addCriterion("sch_id <>", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThan(Integer value) {
            addCriterion("sch_id >", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sch_id >=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThan(Integer value) {
            addCriterion("sch_id <", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThanOrEqualTo(Integer value) {
            addCriterion("sch_id <=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdIn(List<Integer> values) {
            addCriterion("sch_id in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotIn(List<Integer> values) {
            addCriterion("sch_id not in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdBetween(Integer value1, Integer value2) {
            addCriterion("sch_id between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sch_id not between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andSchCodeIsNull() {
            addCriterion("sch_code is null");
            return (Criteria) this;
        }

        public Criteria andSchCodeIsNotNull() {
            addCriterion("sch_code is not null");
            return (Criteria) this;
        }

        public Criteria andSchCodeEqualTo(String value) {
            addCriterion("sch_code =", value, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeNotEqualTo(String value) {
            addCriterion("sch_code <>", value, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeGreaterThan(String value) {
            addCriterion("sch_code >", value, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sch_code >=", value, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeLessThan(String value) {
            addCriterion("sch_code <", value, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeLessThanOrEqualTo(String value) {
            addCriterion("sch_code <=", value, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeLike(String value) {
            addCriterion("sch_code like", value, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeNotLike(String value) {
            addCriterion("sch_code not like", value, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeIn(List<String> values) {
            addCriterion("sch_code in", values, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeNotIn(List<String> values) {
            addCriterion("sch_code not in", values, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeBetween(String value1, String value2) {
            addCriterion("sch_code between", value1, value2, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchCodeNotBetween(String value1, String value2) {
            addCriterion("sch_code not between", value1, value2, "schCode");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNull() {
            addCriterion("sch_name is null");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNotNull() {
            addCriterion("sch_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchNameEqualTo(String value) {
            addCriterion("sch_name =", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotEqualTo(String value) {
            addCriterion("sch_name <>", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThan(String value) {
            addCriterion("sch_name >", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThanOrEqualTo(String value) {
            addCriterion("sch_name >=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThan(String value) {
            addCriterion("sch_name <", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThanOrEqualTo(String value) {
            addCriterion("sch_name <=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLike(String value) {
            addCriterion("sch_name like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotLike(String value) {
            addCriterion("sch_name not like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameIn(List<String> values) {
            addCriterion("sch_name in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotIn(List<String> values) {
            addCriterion("sch_name not in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameBetween(String value1, String value2) {
            addCriterion("sch_name between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotBetween(String value1, String value2) {
            addCriterion("sch_name not between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchPassIsNull() {
            addCriterion("sch_pass is null");
            return (Criteria) this;
        }

        public Criteria andSchPassIsNotNull() {
            addCriterion("sch_pass is not null");
            return (Criteria) this;
        }

        public Criteria andSchPassEqualTo(String value) {
            addCriterion("sch_pass =", value, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassNotEqualTo(String value) {
            addCriterion("sch_pass <>", value, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassGreaterThan(String value) {
            addCriterion("sch_pass >", value, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassGreaterThanOrEqualTo(String value) {
            addCriterion("sch_pass >=", value, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassLessThan(String value) {
            addCriterion("sch_pass <", value, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassLessThanOrEqualTo(String value) {
            addCriterion("sch_pass <=", value, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassLike(String value) {
            addCriterion("sch_pass like", value, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassNotLike(String value) {
            addCriterion("sch_pass not like", value, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassIn(List<String> values) {
            addCriterion("sch_pass in", values, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassNotIn(List<String> values) {
            addCriterion("sch_pass not in", values, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassBetween(String value1, String value2) {
            addCriterion("sch_pass between", value1, value2, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchPassNotBetween(String value1, String value2) {
            addCriterion("sch_pass not between", value1, value2, "schPass");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeIsNull() {
            addCriterion("sch_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeIsNotNull() {
            addCriterion("sch_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeEqualTo(Date value) {
            addCriterion("sch_create_time =", value, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeNotEqualTo(Date value) {
            addCriterion("sch_create_time <>", value, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeGreaterThan(Date value) {
            addCriterion("sch_create_time >", value, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sch_create_time >=", value, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeLessThan(Date value) {
            addCriterion("sch_create_time <", value, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sch_create_time <=", value, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeIn(List<Date> values) {
            addCriterion("sch_create_time in", values, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeNotIn(List<Date> values) {
            addCriterion("sch_create_time not in", values, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeBetween(Date value1, Date value2) {
            addCriterion("sch_create_time between", value1, value2, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sch_create_time not between", value1, value2, "schCreateTime");
            return (Criteria) this;
        }

        public Criteria andSchCreateByIsNull() {
            addCriterion("sch_create_by is null");
            return (Criteria) this;
        }

        public Criteria andSchCreateByIsNotNull() {
            addCriterion("sch_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andSchCreateByEqualTo(String value) {
            addCriterion("sch_create_by =", value, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByNotEqualTo(String value) {
            addCriterion("sch_create_by <>", value, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByGreaterThan(String value) {
            addCriterion("sch_create_by >", value, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("sch_create_by >=", value, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByLessThan(String value) {
            addCriterion("sch_create_by <", value, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByLessThanOrEqualTo(String value) {
            addCriterion("sch_create_by <=", value, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByLike(String value) {
            addCriterion("sch_create_by like", value, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByNotLike(String value) {
            addCriterion("sch_create_by not like", value, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByIn(List<String> values) {
            addCriterion("sch_create_by in", values, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByNotIn(List<String> values) {
            addCriterion("sch_create_by not in", values, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByBetween(String value1, String value2) {
            addCriterion("sch_create_by between", value1, value2, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchCreateByNotBetween(String value1, String value2) {
            addCriterion("sch_create_by not between", value1, value2, "schCreateBy");
            return (Criteria) this;
        }

        public Criteria andSchFlagIsNull() {
            addCriterion("sch_flag is null");
            return (Criteria) this;
        }

        public Criteria andSchFlagIsNotNull() {
            addCriterion("sch_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSchFlagEqualTo(Boolean value) {
            addCriterion("sch_flag =", value, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagNotEqualTo(Boolean value) {
            addCriterion("sch_flag <>", value, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagGreaterThan(Boolean value) {
            addCriterion("sch_flag >", value, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sch_flag >=", value, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagLessThan(Boolean value) {
            addCriterion("sch_flag <", value, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("sch_flag <=", value, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagIn(List<Boolean> values) {
            addCriterion("sch_flag in", values, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagNotIn(List<Boolean> values) {
            addCriterion("sch_flag not in", values, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("sch_flag between", value1, value2, "schFlag");
            return (Criteria) this;
        }

        public Criteria andSchFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sch_flag not between", value1, value2, "schFlag");
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