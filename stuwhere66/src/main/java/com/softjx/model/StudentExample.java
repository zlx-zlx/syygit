package com.softjx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNull() {
            addCriterion("stu_no is null");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNotNull() {
            addCriterion("stu_no is not null");
            return (Criteria) this;
        }

        public Criteria andStuNoEqualTo(String value) {
            addCriterion("stu_no =", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotEqualTo(String value) {
            addCriterion("stu_no <>", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThan(String value) {
            addCriterion("stu_no >", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThanOrEqualTo(String value) {
            addCriterion("stu_no >=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThan(String value) {
            addCriterion("stu_no <", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThanOrEqualTo(String value) {
            addCriterion("stu_no <=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLike(String value) {
            addCriterion("stu_no like", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotLike(String value) {
            addCriterion("stu_no not like", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoIn(List<String> values) {
            addCriterion("stu_no in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotIn(List<String> values) {
            addCriterion("stu_no not in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoBetween(String value1, String value2) {
            addCriterion("stu_no between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotBetween(String value1, String value2) {
            addCriterion("stu_no not between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuPassIsNull() {
            addCriterion("stu_pass is null");
            return (Criteria) this;
        }

        public Criteria andStuPassIsNotNull() {
            addCriterion("stu_pass is not null");
            return (Criteria) this;
        }

        public Criteria andStuPassEqualTo(String value) {
            addCriterion("stu_pass =", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassNotEqualTo(String value) {
            addCriterion("stu_pass <>", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassGreaterThan(String value) {
            addCriterion("stu_pass >", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pass >=", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassLessThan(String value) {
            addCriterion("stu_pass <", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassLessThanOrEqualTo(String value) {
            addCriterion("stu_pass <=", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassLike(String value) {
            addCriterion("stu_pass like", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassNotLike(String value) {
            addCriterion("stu_pass not like", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassIn(List<String> values) {
            addCriterion("stu_pass in", values, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassNotIn(List<String> values) {
            addCriterion("stu_pass not in", values, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassBetween(String value1, String value2) {
            addCriterion("stu_pass between", value1, value2, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassNotBetween(String value1, String value2) {
            addCriterion("stu_pass not between", value1, value2, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
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

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuBirthIsNull() {
            addCriterion("stu_birth is null");
            return (Criteria) this;
        }

        public Criteria andStuBirthIsNotNull() {
            addCriterion("stu_birth is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirthEqualTo(String value) {
            addCriterion("stu_birth =", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotEqualTo(String value) {
            addCriterion("stu_birth <>", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthGreaterThan(String value) {
            addCriterion("stu_birth >", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthGreaterThanOrEqualTo(String value) {
            addCriterion("stu_birth >=", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthLessThan(String value) {
            addCriterion("stu_birth <", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthLessThanOrEqualTo(String value) {
            addCriterion("stu_birth <=", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthLike(String value) {
            addCriterion("stu_birth like", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotLike(String value) {
            addCriterion("stu_birth not like", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthIn(List<String> values) {
            addCriterion("stu_birth in", values, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotIn(List<String> values) {
            addCriterion("stu_birth not in", values, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthBetween(String value1, String value2) {
            addCriterion("stu_birth between", value1, value2, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotBetween(String value1, String value2) {
            addCriterion("stu_birth not between", value1, value2, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("stu_phone is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("stu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(String value) {
            addCriterion("stu_phone =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(String value) {
            addCriterion("stu_phone <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(String value) {
            addCriterion("stu_phone >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("stu_phone >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(String value) {
            addCriterion("stu_phone <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(String value) {
            addCriterion("stu_phone <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLike(String value) {
            addCriterion("stu_phone like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotLike(String value) {
            addCriterion("stu_phone not like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<String> values) {
            addCriterion("stu_phone in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<String> values) {
            addCriterion("stu_phone not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(String value1, String value2) {
            addCriterion("stu_phone between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(String value1, String value2) {
            addCriterion("stu_phone not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNull() {
            addCriterion("stu_status is null");
            return (Criteria) this;
        }

        public Criteria andStuStatusIsNotNull() {
            addCriterion("stu_status is not null");
            return (Criteria) this;
        }

        public Criteria andStuStatusEqualTo(String value) {
            addCriterion("stu_status =", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotEqualTo(String value) {
            addCriterion("stu_status <>", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThan(String value) {
            addCriterion("stu_status >", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stu_status >=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThan(String value) {
            addCriterion("stu_status <", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLessThanOrEqualTo(String value) {
            addCriterion("stu_status <=", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusLike(String value) {
            addCriterion("stu_status like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotLike(String value) {
            addCriterion("stu_status not like", value, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusIn(List<String> values) {
            addCriterion("stu_status in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotIn(List<String> values) {
            addCriterion("stu_status not in", values, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusBetween(String value1, String value2) {
            addCriterion("stu_status between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuStatusNotBetween(String value1, String value2) {
            addCriterion("stu_status not between", value1, value2, "stuStatus");
            return (Criteria) this;
        }

        public Criteria andStuYearIsNull() {
            addCriterion("stu_year is null");
            return (Criteria) this;
        }

        public Criteria andStuYearIsNotNull() {
            addCriterion("stu_year is not null");
            return (Criteria) this;
        }

        public Criteria andStuYearEqualTo(Integer value) {
            addCriterion("stu_year =", value, "stuYear");
            return (Criteria) this;
        }
        
        
        
        public Criteria andStuYearEqualTo(String string) {
            addCriterion("stu_year =", string, "stuYear");
            return (Criteria) this;
        }
        
        
        
        
        
        
        

        public Criteria andStuYearNotEqualTo(Integer value) {
            addCriterion("stu_year <>", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearGreaterThan(Integer value) {
            addCriterion("stu_year >", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_year >=", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearLessThan(Integer value) {
            addCriterion("stu_year <", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearLessThanOrEqualTo(Integer value) {
            addCriterion("stu_year <=", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearIn(List<Integer> values) {
            addCriterion("stu_year in", values, "stuYear");
            return (Criteria) this;
        }
        
        
        
        public Criteria andStuYearIn(String string) {
            addCriterion("stu_year in", string, "stuYear");
            return (Criteria) this;
        }
        
        
        
        
        
        

        public Criteria andStuYearNotIn(List<Integer> values) {
            addCriterion("stu_year not in", values, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearBetween(Integer value1, Integer value2) {
            addCriterion("stu_year between", value1, value2, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_year not between", value1, value2, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuEducationIsNull() {
            addCriterion("stu_education is null");
            return (Criteria) this;
        }

        public Criteria andStuEducationIsNotNull() {
            addCriterion("stu_education is not null");
            return (Criteria) this;
        }

        public Criteria andStuEducationEqualTo(String value) {
            addCriterion("stu_education =", value, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationNotEqualTo(String value) {
            addCriterion("stu_education <>", value, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationGreaterThan(String value) {
            addCriterion("stu_education >", value, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationGreaterThanOrEqualTo(String value) {
            addCriterion("stu_education >=", value, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationLessThan(String value) {
            addCriterion("stu_education <", value, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationLessThanOrEqualTo(String value) {
            addCriterion("stu_education <=", value, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationLike(String value) {
            addCriterion("stu_education like", value, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationNotLike(String value) {
            addCriterion("stu_education not like", value, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationIn(List<String> values) {
            addCriterion("stu_education in", values, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationNotIn(List<String> values) {
            addCriterion("stu_education not in", values, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationBetween(String value1, String value2) {
            addCriterion("stu_education between", value1, value2, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuEducationNotBetween(String value1, String value2) {
            addCriterion("stu_education not between", value1, value2, "stuEducation");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNull() {
            addCriterion("stu_class is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNotNull() {
            addCriterion("stu_class is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassEqualTo(String value) {
            addCriterion("stu_class =", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotEqualTo(String value) {
            addCriterion("stu_class <>", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThan(String value) {
            addCriterion("stu_class >", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_class >=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThan(String value) {
            addCriterion("stu_class <", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThanOrEqualTo(String value) {
            addCriterion("stu_class <=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLike(String value) {
            addCriterion("stu_class like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotLike(String value) {
            addCriterion("stu_class not like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassIn(List<String> values) {
            addCriterion("stu_class in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotIn(List<String> values) {
            addCriterion("stu_class not in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassBetween(String value1, String value2) {
            addCriterion("stu_class between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotBetween(String value1, String value2) {
            addCriterion("stu_class not between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuMajorIsNull() {
            addCriterion("stu_major is null");
            return (Criteria) this;
        }

        public Criteria andStuMajorIsNotNull() {
            addCriterion("stu_major is not null");
            return (Criteria) this;
        }

        public Criteria andStuMajorEqualTo(String value) {
            addCriterion("stu_major =", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotEqualTo(String value) {
            addCriterion("stu_major <>", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorGreaterThan(String value) {
            addCriterion("stu_major >", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorGreaterThanOrEqualTo(String value) {
            addCriterion("stu_major >=", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLessThan(String value) {
            addCriterion("stu_major <", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLessThanOrEqualTo(String value) {
            addCriterion("stu_major <=", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLike(String value) {
            addCriterion("stu_major like", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotLike(String value) {
            addCriterion("stu_major not like", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorIn(List<String> values) {
            addCriterion("stu_major in", values, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotIn(List<String> values) {
            addCriterion("stu_major not in", values, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorBetween(String value1, String value2) {
            addCriterion("stu_major between", value1, value2, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotBetween(String value1, String value2) {
            addCriterion("stu_major not between", value1, value2, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNull() {
            addCriterion("stu_address is null");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNotNull() {
            addCriterion("stu_address is not null");
            return (Criteria) this;
        }

        public Criteria andStuAddressEqualTo(String value) {
            addCriterion("stu_address =", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotEqualTo(String value) {
            addCriterion("stu_address <>", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThan(String value) {
            addCriterion("stu_address >", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("stu_address >=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThan(String value) {
            addCriterion("stu_address <", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThanOrEqualTo(String value) {
            addCriterion("stu_address <=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLike(String value) {
            addCriterion("stu_address like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotLike(String value) {
            addCriterion("stu_address not like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressIn(List<String> values) {
            addCriterion("stu_address in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotIn(List<String> values) {
            addCriterion("stu_address not in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressBetween(String value1, String value2) {
            addCriterion("stu_address between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotBetween(String value1, String value2) {
            addCriterion("stu_address not between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeIsNull() {
            addCriterion("stu_create_time is null");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeIsNotNull() {
            addCriterion("stu_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeEqualTo(Date value) {
            addCriterion("stu_create_time =", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeNotEqualTo(Date value) {
            addCriterion("stu_create_time <>", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeGreaterThan(Date value) {
            addCriterion("stu_create_time >", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_create_time >=", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeLessThan(Date value) {
            addCriterion("stu_create_time <", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_create_time <=", value, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeIn(List<Date> values) {
            addCriterion("stu_create_time in", values, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeNotIn(List<Date> values) {
            addCriterion("stu_create_time not in", values, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeBetween(Date value1, Date value2) {
            addCriterion("stu_create_time between", value1, value2, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_create_time not between", value1, value2, "stuCreateTime");
            return (Criteria) this;
        }

        public Criteria andStuCreateByIsNull() {
            addCriterion("stu_create_by is null");
            return (Criteria) this;
        }

        public Criteria andStuCreateByIsNotNull() {
            addCriterion("stu_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andStuCreateByEqualTo(String value) {
            addCriterion("stu_create_by =", value, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByNotEqualTo(String value) {
            addCriterion("stu_create_by <>", value, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByGreaterThan(String value) {
            addCriterion("stu_create_by >", value, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("stu_create_by >=", value, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByLessThan(String value) {
            addCriterion("stu_create_by <", value, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByLessThanOrEqualTo(String value) {
            addCriterion("stu_create_by <=", value, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByLike(String value) {
            addCriterion("stu_create_by like", value, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByNotLike(String value) {
            addCriterion("stu_create_by not like", value, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByIn(List<String> values) {
            addCriterion("stu_create_by in", values, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByNotIn(List<String> values) {
            addCriterion("stu_create_by not in", values, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByBetween(String value1, String value2) {
            addCriterion("stu_create_by between", value1, value2, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuCreateByNotBetween(String value1, String value2) {
            addCriterion("stu_create_by not between", value1, value2, "stuCreateBy");
            return (Criteria) this;
        }

        public Criteria andStuFlagIsNull() {
            addCriterion("stu_flag is null");
            return (Criteria) this;
        }

        public Criteria andStuFlagIsNotNull() {
            addCriterion("stu_flag is not null");
            return (Criteria) this;
        }

        public Criteria andStuFlagEqualTo(Boolean value) {
            addCriterion("stu_flag =", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagNotEqualTo(Boolean value) {
            addCriterion("stu_flag <>", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagGreaterThan(Boolean value) {
            addCriterion("stu_flag >", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stu_flag >=", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagLessThan(Boolean value) {
            addCriterion("stu_flag <", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("stu_flag <=", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagIn(List<Boolean> values) {
            addCriterion("stu_flag in", values, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagNotIn(List<Boolean> values) {
            addCriterion("stu_flag not in", values, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("stu_flag between", value1, value2, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stu_flag not between", value1, value2, "stuFlag");
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