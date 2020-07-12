package com.softjx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WayExample() {
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

        public Criteria andWayIdIsNull() {
            addCriterion("way_id is null");
            return (Criteria) this;
        }

        public Criteria andWayIdIsNotNull() {
            addCriterion("way_id is not null");
            return (Criteria) this;
        }

        public Criteria andWayIdEqualTo(Integer value) {
            addCriterion("way_id =", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotEqualTo(Integer value) {
            addCriterion("way_id <>", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdGreaterThan(Integer value) {
            addCriterion("way_id >", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("way_id >=", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdLessThan(Integer value) {
            addCriterion("way_id <", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("way_id <=", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdIn(List<Integer> values) {
            addCriterion("way_id in", values, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotIn(List<Integer> values) {
            addCriterion("way_id not in", values, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdBetween(Integer value1, Integer value2) {
            addCriterion("way_id between", value1, value2, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("way_id not between", value1, value2, "wayId");
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

        public Criteria andWayCompanyIsNull() {
            addCriterion("way_company is null");
            return (Criteria) this;
        }

        public Criteria andWayCompanyIsNotNull() {
            addCriterion("way_company is not null");
            return (Criteria) this;
        }

        public Criteria andWayCompanyEqualTo(String value) {
            addCriterion("way_company =", value, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyNotEqualTo(String value) {
            addCriterion("way_company <>", value, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyGreaterThan(String value) {
            addCriterion("way_company >", value, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("way_company >=", value, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyLessThan(String value) {
            addCriterion("way_company <", value, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyLessThanOrEqualTo(String value) {
            addCriterion("way_company <=", value, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyLike(String value) {
            addCriterion("way_company like", value, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyNotLike(String value) {
            addCriterion("way_company not like", value, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyIn(List<String> values) {
            addCriterion("way_company in", values, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyNotIn(List<String> values) {
            addCriterion("way_company not in", values, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyBetween(String value1, String value2) {
            addCriterion("way_company between", value1, value2, "wayCompany");
            return (Criteria) this;
        }

        public Criteria andWayCompanyNotBetween(String value1, String value2) {
            addCriterion("way_company not between", value1, value2, "wayCompany");
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

        public Criteria andWaySalaryIsNull() {
            addCriterion("way_salary is null");
            return (Criteria) this;
        }

        public Criteria andWaySalaryIsNotNull() {
            addCriterion("way_salary is not null");
            return (Criteria) this;
        }

        public Criteria andWaySalaryEqualTo(Double value) {
            addCriterion("way_salary =", value, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryNotEqualTo(Double value) {
            addCriterion("way_salary <>", value, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryGreaterThan(Double value) {
            addCriterion("way_salary >", value, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("way_salary >=", value, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryLessThan(Double value) {
            addCriterion("way_salary <", value, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryLessThanOrEqualTo(Double value) {
            addCriterion("way_salary <=", value, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryIn(List<Double> values) {
            addCriterion("way_salary in", values, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryNotIn(List<Double> values) {
            addCriterion("way_salary not in", values, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryBetween(Double value1, Double value2) {
            addCriterion("way_salary between", value1, value2, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWaySalaryNotBetween(Double value1, Double value2) {
            addCriterion("way_salary not between", value1, value2, "waySalary");
            return (Criteria) this;
        }

        public Criteria andWayTimeIsNull() {
            addCriterion("way_time is null");
            return (Criteria) this;
        }

        public Criteria andWayTimeIsNotNull() {
            addCriterion("way_time is not null");
            return (Criteria) this;
        }

        public Criteria andWayTimeEqualTo(String value) {
            addCriterion("way_time =", value, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeNotEqualTo(String value) {
            addCriterion("way_time <>", value, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeGreaterThan(String value) {
            addCriterion("way_time >", value, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("way_time >=", value, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeLessThan(String value) {
            addCriterion("way_time <", value, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeLessThanOrEqualTo(String value) {
            addCriterion("way_time <=", value, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeLike(String value) {
            addCriterion("way_time like", value, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeNotLike(String value) {
            addCriterion("way_time not like", value, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeIn(List<String> values) {
            addCriterion("way_time in", values, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeNotIn(List<String> values) {
            addCriterion("way_time not in", values, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeBetween(String value1, String value2) {
            addCriterion("way_time between", value1, value2, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayTimeNotBetween(String value1, String value2) {
            addCriterion("way_time not between", value1, value2, "wayTime");
            return (Criteria) this;
        }

        public Criteria andWayAddrssIsNull() {
            addCriterion("way_addrss is null");
            return (Criteria) this;
        }

        public Criteria andWayAddrssIsNotNull() {
            addCriterion("way_addrss is not null");
            return (Criteria) this;
        }

        public Criteria andWayAddrssEqualTo(String value) {
            addCriterion("way_addrss =", value, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssNotEqualTo(String value) {
            addCriterion("way_addrss <>", value, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssGreaterThan(String value) {
            addCriterion("way_addrss >", value, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssGreaterThanOrEqualTo(String value) {
            addCriterion("way_addrss >=", value, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssLessThan(String value) {
            addCriterion("way_addrss <", value, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssLessThanOrEqualTo(String value) {
            addCriterion("way_addrss <=", value, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssLike(String value) {
            addCriterion("way_addrss like", value, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssNotLike(String value) {
            addCriterion("way_addrss not like", value, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssIn(List<String> values) {
            addCriterion("way_addrss in", values, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssNotIn(List<String> values) {
            addCriterion("way_addrss not in", values, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssBetween(String value1, String value2) {
            addCriterion("way_addrss between", value1, value2, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayAddrssNotBetween(String value1, String value2) {
            addCriterion("way_addrss not between", value1, value2, "wayAddrss");
            return (Criteria) this;
        }

        public Criteria andWayPhoneIsNull() {
            addCriterion("way_phone is null");
            return (Criteria) this;
        }

        public Criteria andWayPhoneIsNotNull() {
            addCriterion("way_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWayPhoneEqualTo(String value) {
            addCriterion("way_phone =", value, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneNotEqualTo(String value) {
            addCriterion("way_phone <>", value, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneGreaterThan(String value) {
            addCriterion("way_phone >", value, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("way_phone >=", value, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneLessThan(String value) {
            addCriterion("way_phone <", value, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneLessThanOrEqualTo(String value) {
            addCriterion("way_phone <=", value, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneLike(String value) {
            addCriterion("way_phone like", value, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneNotLike(String value) {
            addCriterion("way_phone not like", value, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneIn(List<String> values) {
            addCriterion("way_phone in", values, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneNotIn(List<String> values) {
            addCriterion("way_phone not in", values, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneBetween(String value1, String value2) {
            addCriterion("way_phone between", value1, value2, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayPhoneNotBetween(String value1, String value2) {
            addCriterion("way_phone not between", value1, value2, "wayPhone");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateIsNull() {
            addCriterion("way_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateIsNotNull() {
            addCriterion("way_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateEqualTo(String value) {
            addCriterion("way_evaluate =", value, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateNotEqualTo(String value) {
            addCriterion("way_evaluate <>", value, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateGreaterThan(String value) {
            addCriterion("way_evaluate >", value, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("way_evaluate >=", value, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateLessThan(String value) {
            addCriterion("way_evaluate <", value, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateLessThanOrEqualTo(String value) {
            addCriterion("way_evaluate <=", value, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateLike(String value) {
            addCriterion("way_evaluate like", value, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateNotLike(String value) {
            addCriterion("way_evaluate not like", value, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateIn(List<String> values) {
            addCriterion("way_evaluate in", values, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateNotIn(List<String> values) {
            addCriterion("way_evaluate not in", values, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateBetween(String value1, String value2) {
            addCriterion("way_evaluate between", value1, value2, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayEvaluateNotBetween(String value1, String value2) {
            addCriterion("way_evaluate not between", value1, value2, "wayEvaluate");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeIsNull() {
            addCriterion("way_create_time is null");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeIsNotNull() {
            addCriterion("way_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeEqualTo(Date value) {
            addCriterion("way_create_time =", value, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeNotEqualTo(Date value) {
            addCriterion("way_create_time <>", value, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeGreaterThan(Date value) {
            addCriterion("way_create_time >", value, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("way_create_time >=", value, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeLessThan(Date value) {
            addCriterion("way_create_time <", value, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("way_create_time <=", value, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeIn(List<Date> values) {
            addCriterion("way_create_time in", values, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeNotIn(List<Date> values) {
            addCriterion("way_create_time not in", values, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeBetween(Date value1, Date value2) {
            addCriterion("way_create_time between", value1, value2, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("way_create_time not between", value1, value2, "wayCreateTime");
            return (Criteria) this;
        }

        public Criteria andWayCreateByIsNull() {
            addCriterion("way_create_by is null");
            return (Criteria) this;
        }

        public Criteria andWayCreateByIsNotNull() {
            addCriterion("way_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andWayCreateByEqualTo(String value) {
            addCriterion("way_create_by =", value, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByNotEqualTo(String value) {
            addCriterion("way_create_by <>", value, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByGreaterThan(String value) {
            addCriterion("way_create_by >", value, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("way_create_by >=", value, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByLessThan(String value) {
            addCriterion("way_create_by <", value, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByLessThanOrEqualTo(String value) {
            addCriterion("way_create_by <=", value, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByLike(String value) {
            addCriterion("way_create_by like", value, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByNotLike(String value) {
            addCriterion("way_create_by not like", value, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByIn(List<String> values) {
            addCriterion("way_create_by in", values, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByNotIn(List<String> values) {
            addCriterion("way_create_by not in", values, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByBetween(String value1, String value2) {
            addCriterion("way_create_by between", value1, value2, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCreateByNotBetween(String value1, String value2) {
            addCriterion("way_create_by not between", value1, value2, "wayCreateBy");
            return (Criteria) this;
        }

        public Criteria andWayCompanorIsNull() {
            addCriterion("way_companor is null");
            return (Criteria) this;
        }

        public Criteria andWayCompanorIsNotNull() {
            addCriterion("way_companor is not null");
            return (Criteria) this;
        }

        public Criteria andWayCompanorEqualTo(String value) {
            addCriterion("way_companor =", value, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorNotEqualTo(String value) {
            addCriterion("way_companor <>", value, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorGreaterThan(String value) {
            addCriterion("way_companor >", value, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorGreaterThanOrEqualTo(String value) {
            addCriterion("way_companor >=", value, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorLessThan(String value) {
            addCriterion("way_companor <", value, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorLessThanOrEqualTo(String value) {
            addCriterion("way_companor <=", value, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorLike(String value) {
            addCriterion("way_companor like", value, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorNotLike(String value) {
            addCriterion("way_companor not like", value, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorIn(List<String> values) {
            addCriterion("way_companor in", values, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorNotIn(List<String> values) {
            addCriterion("way_companor not in", values, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorBetween(String value1, String value2) {
            addCriterion("way_companor between", value1, value2, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayCompanorNotBetween(String value1, String value2) {
            addCriterion("way_companor not between", value1, value2, "wayCompanor");
            return (Criteria) this;
        }

        public Criteria andWayFlagIsNull() {
            addCriterion("way_flag is null");
            return (Criteria) this;
        }

        public Criteria andWayFlagIsNotNull() {
            addCriterion("way_flag is not null");
            return (Criteria) this;
        }

        public Criteria andWayFlagEqualTo(Boolean value) {
            addCriterion("way_flag =", value, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagNotEqualTo(Boolean value) {
            addCriterion("way_flag <>", value, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagGreaterThan(Boolean value) {
            addCriterion("way_flag >", value, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("way_flag >=", value, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagLessThan(Boolean value) {
            addCriterion("way_flag <", value, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("way_flag <=", value, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagIn(List<Boolean> values) {
            addCriterion("way_flag in", values, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagNotIn(List<Boolean> values) {
            addCriterion("way_flag not in", values, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("way_flag between", value1, value2, "wayFlag");
            return (Criteria) this;
        }

        public Criteria andWayFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("way_flag not between", value1, value2, "wayFlag");
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