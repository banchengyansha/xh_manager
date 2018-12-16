package com.xh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbOldmanMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOldmanMessageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEvaluateNoIsNull() {
            addCriterion("evaluate_no is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoIsNotNull() {
            addCriterion("evaluate_no is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoEqualTo(String value) {
            addCriterion("evaluate_no =", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotEqualTo(String value) {
            addCriterion("evaluate_no <>", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoGreaterThan(String value) {
            addCriterion("evaluate_no >", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_no >=", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLessThan(String value) {
            addCriterion("evaluate_no <", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLessThanOrEqualTo(String value) {
            addCriterion("evaluate_no <=", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLike(String value) {
            addCriterion("evaluate_no like", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotLike(String value) {
            addCriterion("evaluate_no not like", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoIn(List<String> values) {
            addCriterion("evaluate_no in", values, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotIn(List<String> values) {
            addCriterion("evaluate_no not in", values, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoBetween(String value1, String value2) {
            addCriterion("evaluate_no between", value1, value2, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotBetween(String value1, String value2) {
            addCriterion("evaluate_no not between", value1, value2, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdCartIsNull() {
            addCriterion("id_cart is null");
            return (Criteria) this;
        }

        public Criteria andIdCartIsNotNull() {
            addCriterion("id_cart is not null");
            return (Criteria) this;
        }

        public Criteria andIdCartEqualTo(String value) {
            addCriterion("id_cart =", value, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartNotEqualTo(String value) {
            addCriterion("id_cart <>", value, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartGreaterThan(String value) {
            addCriterion("id_cart >", value, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartGreaterThanOrEqualTo(String value) {
            addCriterion("id_cart >=", value, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartLessThan(String value) {
            addCriterion("id_cart <", value, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartLessThanOrEqualTo(String value) {
            addCriterion("id_cart <=", value, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartLike(String value) {
            addCriterion("id_cart like", value, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartNotLike(String value) {
            addCriterion("id_cart not like", value, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartIn(List<String> values) {
            addCriterion("id_cart in", values, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartNotIn(List<String> values) {
            addCriterion("id_cart not in", values, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartBetween(String value1, String value2) {
            addCriterion("id_cart between", value1, value2, "idCart");
            return (Criteria) this;
        }

        public Criteria andIdCartNotBetween(String value1, String value2) {
            addCriterion("id_cart not between", value1, value2, "idCart");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNull() {
            addCriterion("belief is null");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNotNull() {
            addCriterion("belief is not null");
            return (Criteria) this;
        }

        public Criteria andBeliefEqualTo(Integer value) {
            addCriterion("belief =", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotEqualTo(Integer value) {
            addCriterion("belief <>", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThan(Integer value) {
            addCriterion("belief >", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThanOrEqualTo(Integer value) {
            addCriterion("belief >=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThan(Integer value) {
            addCriterion("belief <", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThanOrEqualTo(Integer value) {
            addCriterion("belief <=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefIn(List<Integer> values) {
            addCriterion("belief in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotIn(List<Integer> values) {
            addCriterion("belief not in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefBetween(Integer value1, Integer value2) {
            addCriterion("belief between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotBetween(Integer value1, Integer value2) {
            addCriterion("belief not between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Integer value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Integer value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Integer value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Integer value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Integer> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Integer> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardIsNull() {
            addCriterion("social_security_card is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardIsNotNull() {
            addCriterion("social_security_card is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardEqualTo(String value) {
            addCriterion("social_security_card =", value, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardNotEqualTo(String value) {
            addCriterion("social_security_card <>", value, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardGreaterThan(String value) {
            addCriterion("social_security_card >", value, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardGreaterThanOrEqualTo(String value) {
            addCriterion("social_security_card >=", value, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardLessThan(String value) {
            addCriterion("social_security_card <", value, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardLessThanOrEqualTo(String value) {
            addCriterion("social_security_card <=", value, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardLike(String value) {
            addCriterion("social_security_card like", value, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardNotLike(String value) {
            addCriterion("social_security_card not like", value, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardIn(List<String> values) {
            addCriterion("social_security_card in", values, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardNotIn(List<String> values) {
            addCriterion("social_security_card not in", values, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardBetween(String value1, String value2) {
            addCriterion("social_security_card between", value1, value2, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityCardNotBetween(String value1, String value2) {
            addCriterion("social_security_card not between", value1, value2, "socialSecurityCard");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeIsNull() {
            addCriterion("culture__degree is null");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeIsNotNull() {
            addCriterion("culture__degree is not null");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeEqualTo(Integer value) {
            addCriterion("culture__degree =", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeNotEqualTo(Integer value) {
            addCriterion("culture__degree <>", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeGreaterThan(Integer value) {
            addCriterion("culture__degree >", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("culture__degree >=", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeLessThan(Integer value) {
            addCriterion("culture__degree <", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("culture__degree <=", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeIn(List<Integer> values) {
            addCriterion("culture__degree in", values, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeNotIn(List<Integer> values) {
            addCriterion("culture__degree not in", values, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeBetween(Integer value1, Integer value2) {
            addCriterion("culture__degree between", value1, value2, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("culture__degree not between", value1, value2, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andLivingAddressIsNull() {
            addCriterion("living_address is null");
            return (Criteria) this;
        }

        public Criteria andLivingAddressIsNotNull() {
            addCriterion("living_address is not null");
            return (Criteria) this;
        }

        public Criteria andLivingAddressEqualTo(String value) {
            addCriterion("living_address =", value, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressNotEqualTo(String value) {
            addCriterion("living_address <>", value, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressGreaterThan(String value) {
            addCriterion("living_address >", value, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("living_address >=", value, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressLessThan(String value) {
            addCriterion("living_address <", value, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressLessThanOrEqualTo(String value) {
            addCriterion("living_address <=", value, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressLike(String value) {
            addCriterion("living_address like", value, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressNotLike(String value) {
            addCriterion("living_address not like", value, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressIn(List<String> values) {
            addCriterion("living_address in", values, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressNotIn(List<String> values) {
            addCriterion("living_address not in", values, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressBetween(String value1, String value2) {
            addCriterion("living_address between", value1, value2, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingAddressNotBetween(String value1, String value2) {
            addCriterion("living_address not between", value1, value2, "livingAddress");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIsNull() {
            addCriterion("living_condition is null");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIsNotNull() {
            addCriterion("living_condition is not null");
            return (Criteria) this;
        }

        public Criteria andLivingConditionEqualTo(Integer value) {
            addCriterion("living_condition =", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotEqualTo(Integer value) {
            addCriterion("living_condition <>", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionGreaterThan(Integer value) {
            addCriterion("living_condition >", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_condition >=", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionLessThan(Integer value) {
            addCriterion("living_condition <", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionLessThanOrEqualTo(Integer value) {
            addCriterion("living_condition <=", value, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionIn(List<Integer> values) {
            addCriterion("living_condition in", values, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotIn(List<Integer> values) {
            addCriterion("living_condition not in", values, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionBetween(Integer value1, Integer value2) {
            addCriterion("living_condition between", value1, value2, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andLivingConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("living_condition not between", value1, value2, "livingCondition");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceIsNull() {
            addCriterion("economic_source is null");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceIsNotNull() {
            addCriterion("economic_source is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceEqualTo(Integer value) {
            addCriterion("economic_source =", value, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceNotEqualTo(Integer value) {
            addCriterion("economic_source <>", value, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceGreaterThan(Integer value) {
            addCriterion("economic_source >", value, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("economic_source >=", value, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceLessThan(Integer value) {
            addCriterion("economic_source <", value, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceLessThanOrEqualTo(Integer value) {
            addCriterion("economic_source <=", value, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceIn(List<Integer> values) {
            addCriterion("economic_source in", values, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceNotIn(List<Integer> values) {
            addCriterion("economic_source not in", values, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceBetween(Integer value1, Integer value2) {
            addCriterion("economic_source between", value1, value2, "economicSource");
            return (Criteria) this;
        }

        public Criteria andEconomicSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("economic_source not between", value1, value2, "economicSource");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonIsNull() {
            addCriterion("assessment_reason is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonIsNotNull() {
            addCriterion("assessment_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonEqualTo(Integer value) {
            addCriterion("assessment_reason =", value, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonNotEqualTo(Integer value) {
            addCriterion("assessment_reason <>", value, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonGreaterThan(Integer value) {
            addCriterion("assessment_reason >", value, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("assessment_reason >=", value, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonLessThan(Integer value) {
            addCriterion("assessment_reason <", value, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonLessThanOrEqualTo(Integer value) {
            addCriterion("assessment_reason <=", value, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonIn(List<Integer> values) {
            addCriterion("assessment_reason in", values, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonNotIn(List<Integer> values) {
            addCriterion("assessment_reason not in", values, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonBetween(Integer value1, Integer value2) {
            addCriterion("assessment_reason between", value1, value2, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andAssessmentReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("assessment_reason not between", value1, value2, "assessmentReason");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingIsNull() {
            addCriterion("level_daily_living is null");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingIsNotNull() {
            addCriterion("level_daily_living is not null");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingEqualTo(Integer value) {
            addCriterion("level_daily_living =", value, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingNotEqualTo(Integer value) {
            addCriterion("level_daily_living <>", value, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingGreaterThan(Integer value) {
            addCriterion("level_daily_living >", value, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_daily_living >=", value, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingLessThan(Integer value) {
            addCriterion("level_daily_living <", value, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingLessThanOrEqualTo(Integer value) {
            addCriterion("level_daily_living <=", value, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingIn(List<Integer> values) {
            addCriterion("level_daily_living in", values, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingNotIn(List<Integer> values) {
            addCriterion("level_daily_living not in", values, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingBetween(Integer value1, Integer value2) {
            addCriterion("level_daily_living between", value1, value2, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelDailyLivingNotBetween(Integer value1, Integer value2) {
            addCriterion("level_daily_living not between", value1, value2, "levelDailyLiving");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityIsNull() {
            addCriterion("level_mentality is null");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityIsNotNull() {
            addCriterion("level_mentality is not null");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityEqualTo(Integer value) {
            addCriterion("level_mentality =", value, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityNotEqualTo(Integer value) {
            addCriterion("level_mentality <>", value, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityGreaterThan(Integer value) {
            addCriterion("level_mentality >", value, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_mentality >=", value, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityLessThan(Integer value) {
            addCriterion("level_mentality <", value, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityLessThanOrEqualTo(Integer value) {
            addCriterion("level_mentality <=", value, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityIn(List<Integer> values) {
            addCriterion("level_mentality in", values, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityNotIn(List<Integer> values) {
            addCriterion("level_mentality not in", values, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityBetween(Integer value1, Integer value2) {
            addCriterion("level_mentality between", value1, value2, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityNotBetween(Integer value1, Integer value2) {
            addCriterion("level_mentality not between", value1, value2, "levelMentality");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionIsNull() {
            addCriterion("level_perception is null");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionIsNotNull() {
            addCriterion("level_perception is not null");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionEqualTo(Integer value) {
            addCriterion("level_perception =", value, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionNotEqualTo(Integer value) {
            addCriterion("level_perception <>", value, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionGreaterThan(Integer value) {
            addCriterion("level_perception >", value, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_perception >=", value, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionLessThan(Integer value) {
            addCriterion("level_perception <", value, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionLessThanOrEqualTo(Integer value) {
            addCriterion("level_perception <=", value, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionIn(List<Integer> values) {
            addCriterion("level_perception in", values, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionNotIn(List<Integer> values) {
            addCriterion("level_perception not in", values, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionBetween(Integer value1, Integer value2) {
            addCriterion("level_perception between", value1, value2, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelPerceptionNotBetween(Integer value1, Integer value2) {
            addCriterion("level_perception not between", value1, value2, "levelPerception");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationIsNull() {
            addCriterion("level_social_partipation is null");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationIsNotNull() {
            addCriterion("level_social_partipation is not null");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationEqualTo(Integer value) {
            addCriterion("level_social_partipation =", value, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationNotEqualTo(Integer value) {
            addCriterion("level_social_partipation <>", value, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationGreaterThan(Integer value) {
            addCriterion("level_social_partipation >", value, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_social_partipation >=", value, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationLessThan(Integer value) {
            addCriterion("level_social_partipation <", value, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationLessThanOrEqualTo(Integer value) {
            addCriterion("level_social_partipation <=", value, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationIn(List<Integer> values) {
            addCriterion("level_social_partipation in", values, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationNotIn(List<Integer> values) {
            addCriterion("level_social_partipation not in", values, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationBetween(Integer value1, Integer value2) {
            addCriterion("level_social_partipation between", value1, value2, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialPartipationNotBetween(Integer value1, Integer value2) {
            addCriterion("level_social_partipation not between", value1, value2, "levelSocialPartipation");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelIsNull() {
            addCriterion("primary_level is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelIsNotNull() {
            addCriterion("primary_level is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelEqualTo(Integer value) {
            addCriterion("primary_level =", value, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelNotEqualTo(Integer value) {
            addCriterion("primary_level <>", value, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelGreaterThan(Integer value) {
            addCriterion("primary_level >", value, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_level >=", value, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelLessThan(Integer value) {
            addCriterion("primary_level <", value, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelLessThanOrEqualTo(Integer value) {
            addCriterion("primary_level <=", value, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelIn(List<Integer> values) {
            addCriterion("primary_level in", values, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelNotIn(List<Integer> values) {
            addCriterion("primary_level not in", values, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelBetween(Integer value1, Integer value2) {
            addCriterion("primary_level between", value1, value2, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andPrimaryLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_level not between", value1, value2, "primaryLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelIsNull() {
            addCriterion("final_level is null");
            return (Criteria) this;
        }

        public Criteria andFinalLevelIsNotNull() {
            addCriterion("final_level is not null");
            return (Criteria) this;
        }

        public Criteria andFinalLevelEqualTo(Integer value) {
            addCriterion("final_level =", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelNotEqualTo(Integer value) {
            addCriterion("final_level <>", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelGreaterThan(Integer value) {
            addCriterion("final_level >", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_level >=", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelLessThan(Integer value) {
            addCriterion("final_level <", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelLessThanOrEqualTo(Integer value) {
            addCriterion("final_level <=", value, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelIn(List<Integer> values) {
            addCriterion("final_level in", values, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelNotIn(List<Integer> values) {
            addCriterion("final_level not in", values, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelBetween(Integer value1, Integer value2) {
            addCriterion("final_level between", value1, value2, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andFinalLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("final_level not between", value1, value2, "finalLevel");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createuser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createuser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createuser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createuser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createuser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createuser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createuser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createuser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createuser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createuser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createuser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createuser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createuser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("updateuser is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("updateuser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("updateuser =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("updateuser <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("updateuser >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("updateuser >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("updateuser <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("updateuser <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("updateuser like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("updateuser not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("updateuser in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("updateuser not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("updateuser between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("updateuser not between", value1, value2, "updateuser");
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