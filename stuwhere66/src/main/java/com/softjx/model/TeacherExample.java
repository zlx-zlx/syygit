package com.softjx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Integer value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Integer value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Integer value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Integer value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Integer> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Integer> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaCodeIsNull() {
            addCriterion("tea_code is null");
            return (Criteria) this;
        }

        public Criteria andTeaCodeIsNotNull() {
            addCriterion("tea_code is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCodeEqualTo(String value) {
            addCriterion("tea_code =", value, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeNotEqualTo(String value) {
            addCriterion("tea_code <>", value, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeGreaterThan(String value) {
            addCriterion("tea_code >", value, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tea_code >=", value, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeLessThan(String value) {
            addCriterion("tea_code <", value, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeLessThanOrEqualTo(String value) {
            addCriterion("tea_code <=", value, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeLike(String value) {
            addCriterion("tea_code like", value, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeNotLike(String value) {
            addCriterion("tea_code not like", value, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeIn(List<String> values) {
            addCriterion("tea_code in", values, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeNotIn(List<String> values) {
            addCriterion("tea_code not in", values, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeBetween(String value1, String value2) {
            addCriterion("tea_code between", value1, value2, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaCodeNotBetween(String value1, String value2) {
            addCriterion("tea_code not between", value1, value2, "teaCode");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
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

        public Criteria andTeaPassIsNull() {
            addCriterion("tea_pass is null");
            return (Criteria) this;
        }

        public Criteria andTeaPassIsNotNull() {
            addCriterion("tea_pass is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPassEqualTo(String value) {
            addCriterion("tea_pass =", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassNotEqualTo(String value) {
            addCriterion("tea_pass <>", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassGreaterThan(String value) {
            addCriterion("tea_pass >", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassGreaterThanOrEqualTo(String value) {
            addCriterion("tea_pass >=", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassLessThan(String value) {
            addCriterion("tea_pass <", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassLessThanOrEqualTo(String value) {
            addCriterion("tea_pass <=", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassLike(String value) {
            addCriterion("tea_pass like", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassNotLike(String value) {
            addCriterion("tea_pass not like", value, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassIn(List<String> values) {
            addCriterion("tea_pass in", values, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassNotIn(List<String> values) {
            addCriterion("tea_pass not in", values, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassBetween(String value1, String value2) {
            addCriterion("tea_pass between", value1, value2, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaPassNotBetween(String value1, String value2) {
            addCriterion("tea_pass not between", value1, value2, "teaPass");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNull() {
            addCriterion("tea_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNotNull() {
            addCriterion("tea_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSexEqualTo(String value) {
            addCriterion("tea_sex =", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotEqualTo(String value) {
            addCriterion("tea_sex <>", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThan(String value) {
            addCriterion("tea_sex >", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThanOrEqualTo(String value) {
            addCriterion("tea_sex >=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThan(String value) {
            addCriterion("tea_sex <", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThanOrEqualTo(String value) {
            addCriterion("tea_sex <=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLike(String value) {
            addCriterion("tea_sex like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotLike(String value) {
            addCriterion("tea_sex not like", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexIn(List<String> values) {
            addCriterion("tea_sex in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotIn(List<String> values) {
            addCriterion("tea_sex not in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexBetween(String value1, String value2) {
            addCriterion("tea_sex between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotBetween(String value1, String value2) {
            addCriterion("tea_sex not between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIsNull() {
            addCriterion("tea_age is null");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIsNotNull() {
            addCriterion("tea_age is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAgeEqualTo(Integer value) {
            addCriterion("tea_age =", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotEqualTo(Integer value) {
            addCriterion("tea_age <>", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeGreaterThan(Integer value) {
            addCriterion("tea_age >", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_age >=", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeLessThan(Integer value) {
            addCriterion("tea_age <", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeLessThanOrEqualTo(Integer value) {
            addCriterion("tea_age <=", value, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeIn(List<Integer> values) {
            addCriterion("tea_age in", values, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotIn(List<Integer> values) {
            addCriterion("tea_age not in", values, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeBetween(Integer value1, Integer value2) {
            addCriterion("tea_age between", value1, value2, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_age not between", value1, value2, "teaAge");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeIsNull() {
            addCriterion("tea_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeIsNotNull() {
            addCriterion("tea_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeEqualTo(Date value) {
            addCriterion("tea_create_time =", value, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeNotEqualTo(Date value) {
            addCriterion("tea_create_time <>", value, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeGreaterThan(Date value) {
            addCriterion("tea_create_time >", value, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tea_create_time >=", value, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeLessThan(Date value) {
            addCriterion("tea_create_time <", value, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tea_create_time <=", value, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeIn(List<Date> values) {
            addCriterion("tea_create_time in", values, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeNotIn(List<Date> values) {
            addCriterion("tea_create_time not in", values, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeBetween(Date value1, Date value2) {
            addCriterion("tea_create_time between", value1, value2, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tea_create_time not between", value1, value2, "teaCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByIsNull() {
            addCriterion("tea_create_by is null");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByIsNotNull() {
            addCriterion("tea_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByEqualTo(String value) {
            addCriterion("tea_create_by =", value, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByNotEqualTo(String value) {
            addCriterion("tea_create_by <>", value, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByGreaterThan(String value) {
            addCriterion("tea_create_by >", value, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("tea_create_by >=", value, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByLessThan(String value) {
            addCriterion("tea_create_by <", value, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByLessThanOrEqualTo(String value) {
            addCriterion("tea_create_by <=", value, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByLike(String value) {
            addCriterion("tea_create_by like", value, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByNotLike(String value) {
            addCriterion("tea_create_by not like", value, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByIn(List<String> values) {
            addCriterion("tea_create_by in", values, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByNotIn(List<String> values) {
            addCriterion("tea_create_by not in", values, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByBetween(String value1, String value2) {
            addCriterion("tea_create_by between", value1, value2, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaCreateByNotBetween(String value1, String value2) {
            addCriterion("tea_create_by not between", value1, value2, "teaCreateBy");
            return (Criteria) this;
        }

        public Criteria andTeaFlagIsNull() {
            addCriterion("tea_flag is null");
            return (Criteria) this;
        }

        public Criteria andTeaFlagIsNotNull() {
            addCriterion("tea_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTeaFlagEqualTo(Boolean value) {
            addCriterion("tea_flag =", value, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagNotEqualTo(Boolean value) {
            addCriterion("tea_flag <>", value, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagGreaterThan(Boolean value) {
            addCriterion("tea_flag >", value, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tea_flag >=", value, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagLessThan(Boolean value) {
            addCriterion("tea_flag <", value, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("tea_flag <=", value, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagIn(List<Boolean> values) {
            addCriterion("tea_flag in", values, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagNotIn(List<Boolean> values) {
            addCriterion("tea_flag not in", values, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("tea_flag between", value1, value2, "teaFlag");
            return (Criteria) this;
        }

        public Criteria andTeaFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tea_flag not between", value1, value2, "teaFlag");
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