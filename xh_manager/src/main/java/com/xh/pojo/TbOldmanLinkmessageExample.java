package com.xh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOldmanLinkmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOldmanLinkmessageExample() {
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

        public Criteria andProviderNameIsNull() {
            addCriterion("provider_name is null");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNotNull() {
            addCriterion("provider_name is not null");
            return (Criteria) this;
        }

        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("provider_name =", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("provider_name <>", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("provider_name >", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("provider_name >=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThan(String value) {
            addCriterion("provider_name <", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("provider_name <=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLike(String value) {
            addCriterion("provider_name like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotLike(String value) {
            addCriterion("provider_name not like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameIn(List<String> values) {
            addCriterion("provider_name in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("provider_name not in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("provider_name between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("provider_name not between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderRelationIsNull() {
            addCriterion("provider_relation is null");
            return (Criteria) this;
        }

        public Criteria andProviderRelationIsNotNull() {
            addCriterion("provider_relation is not null");
            return (Criteria) this;
        }

        public Criteria andProviderRelationEqualTo(Integer value) {
            addCriterion("provider_relation =", value, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationNotEqualTo(Integer value) {
            addCriterion("provider_relation <>", value, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationGreaterThan(Integer value) {
            addCriterion("provider_relation >", value, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationGreaterThanOrEqualTo(Integer value) {
            addCriterion("provider_relation >=", value, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationLessThan(Integer value) {
            addCriterion("provider_relation <", value, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationLessThanOrEqualTo(Integer value) {
            addCriterion("provider_relation <=", value, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationIn(List<Integer> values) {
            addCriterion("provider_relation in", values, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationNotIn(List<Integer> values) {
            addCriterion("provider_relation not in", values, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationBetween(Integer value1, Integer value2) {
            addCriterion("provider_relation between", value1, value2, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andProviderRelationNotBetween(Integer value1, Integer value2) {
            addCriterion("provider_relation not between", value1, value2, "providerRelation");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameIsNull() {
            addCriterion("linkman1_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameIsNotNull() {
            addCriterion("linkman1_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameEqualTo(String value) {
            addCriterion("linkman1_name =", value, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameNotEqualTo(String value) {
            addCriterion("linkman1_name <>", value, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameGreaterThan(String value) {
            addCriterion("linkman1_name >", value, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameGreaterThanOrEqualTo(String value) {
            addCriterion("linkman1_name >=", value, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameLessThan(String value) {
            addCriterion("linkman1_name <", value, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameLessThanOrEqualTo(String value) {
            addCriterion("linkman1_name <=", value, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameLike(String value) {
            addCriterion("linkman1_name like", value, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameNotLike(String value) {
            addCriterion("linkman1_name not like", value, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameIn(List<String> values) {
            addCriterion("linkman1_name in", values, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameNotIn(List<String> values) {
            addCriterion("linkman1_name not in", values, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameBetween(String value1, String value2) {
            addCriterion("linkman1_name between", value1, value2, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1NameNotBetween(String value1, String value2) {
            addCriterion("linkman1_name not between", value1, value2, "linkman1Name");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneIsNull() {
            addCriterion("linkman1_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneIsNotNull() {
            addCriterion("linkman1_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneEqualTo(String value) {
            addCriterion("linkman1_phone =", value, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneNotEqualTo(String value) {
            addCriterion("linkman1_phone <>", value, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneGreaterThan(String value) {
            addCriterion("linkman1_phone >", value, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkman1_phone >=", value, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneLessThan(String value) {
            addCriterion("linkman1_phone <", value, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneLessThanOrEqualTo(String value) {
            addCriterion("linkman1_phone <=", value, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneLike(String value) {
            addCriterion("linkman1_phone like", value, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneNotLike(String value) {
            addCriterion("linkman1_phone not like", value, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneIn(List<String> values) {
            addCriterion("linkman1_phone in", values, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneNotIn(List<String> values) {
            addCriterion("linkman1_phone not in", values, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneBetween(String value1, String value2) {
            addCriterion("linkman1_phone between", value1, value2, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman1PhoneNotBetween(String value1, String value2) {
            addCriterion("linkman1_phone not between", value1, value2, "linkman1Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameIsNull() {
            addCriterion("linkman2_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameIsNotNull() {
            addCriterion("linkman2_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameEqualTo(String value) {
            addCriterion("linkman2_name =", value, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameNotEqualTo(String value) {
            addCriterion("linkman2_name <>", value, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameGreaterThan(String value) {
            addCriterion("linkman2_name >", value, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameGreaterThanOrEqualTo(String value) {
            addCriterion("linkman2_name >=", value, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameLessThan(String value) {
            addCriterion("linkman2_name <", value, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameLessThanOrEqualTo(String value) {
            addCriterion("linkman2_name <=", value, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameLike(String value) {
            addCriterion("linkman2_name like", value, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameNotLike(String value) {
            addCriterion("linkman2_name not like", value, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameIn(List<String> values) {
            addCriterion("linkman2_name in", values, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameNotIn(List<String> values) {
            addCriterion("linkman2_name not in", values, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameBetween(String value1, String value2) {
            addCriterion("linkman2_name between", value1, value2, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2NameNotBetween(String value1, String value2) {
            addCriterion("linkman2_name not between", value1, value2, "linkman2Name");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneIsNull() {
            addCriterion("linkman2_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneIsNotNull() {
            addCriterion("linkman2_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneEqualTo(String value) {
            addCriterion("linkman2_phone =", value, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneNotEqualTo(String value) {
            addCriterion("linkman2_phone <>", value, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneGreaterThan(String value) {
            addCriterion("linkman2_phone >", value, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkman2_phone >=", value, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneLessThan(String value) {
            addCriterion("linkman2_phone <", value, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneLessThanOrEqualTo(String value) {
            addCriterion("linkman2_phone <=", value, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneLike(String value) {
            addCriterion("linkman2_phone like", value, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneNotLike(String value) {
            addCriterion("linkman2_phone not like", value, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneIn(List<String> values) {
            addCriterion("linkman2_phone in", values, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneNotIn(List<String> values) {
            addCriterion("linkman2_phone not in", values, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneBetween(String value1, String value2) {
            addCriterion("linkman2_phone between", value1, value2, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman2PhoneNotBetween(String value1, String value2) {
            addCriterion("linkman2_phone not between", value1, value2, "linkman2Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameIsNull() {
            addCriterion("linkman3_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameIsNotNull() {
            addCriterion("linkman3_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameEqualTo(String value) {
            addCriterion("linkman3_name =", value, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameNotEqualTo(String value) {
            addCriterion("linkman3_name <>", value, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameGreaterThan(String value) {
            addCriterion("linkman3_name >", value, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameGreaterThanOrEqualTo(String value) {
            addCriterion("linkman3_name >=", value, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameLessThan(String value) {
            addCriterion("linkman3_name <", value, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameLessThanOrEqualTo(String value) {
            addCriterion("linkman3_name <=", value, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameLike(String value) {
            addCriterion("linkman3_name like", value, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameNotLike(String value) {
            addCriterion("linkman3_name not like", value, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameIn(List<String> values) {
            addCriterion("linkman3_name in", values, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameNotIn(List<String> values) {
            addCriterion("linkman3_name not in", values, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameBetween(String value1, String value2) {
            addCriterion("linkman3_name between", value1, value2, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3NameNotBetween(String value1, String value2) {
            addCriterion("linkman3_name not between", value1, value2, "linkman3Name");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneIsNull() {
            addCriterion("linkman3_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneIsNotNull() {
            addCriterion("linkman3_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneEqualTo(String value) {
            addCriterion("linkman3_phone =", value, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneNotEqualTo(String value) {
            addCriterion("linkman3_phone <>", value, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneGreaterThan(String value) {
            addCriterion("linkman3_phone >", value, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkman3_phone >=", value, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneLessThan(String value) {
            addCriterion("linkman3_phone <", value, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneLessThanOrEqualTo(String value) {
            addCriterion("linkman3_phone <=", value, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneLike(String value) {
            addCriterion("linkman3_phone like", value, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneNotLike(String value) {
            addCriterion("linkman3_phone not like", value, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneIn(List<String> values) {
            addCriterion("linkman3_phone in", values, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneNotIn(List<String> values) {
            addCriterion("linkman3_phone not in", values, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneBetween(String value1, String value2) {
            addCriterion("linkman3_phone between", value1, value2, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andLinkman3PhoneNotBetween(String value1, String value2) {
            addCriterion("linkman3_phone not between", value1, value2, "linkman3Phone");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameIsNull() {
            addCriterion("evaluate_name is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameIsNotNull() {
            addCriterion("evaluate_name is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameEqualTo(String value) {
            addCriterion("evaluate_name =", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameNotEqualTo(String value) {
            addCriterion("evaluate_name <>", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameGreaterThan(String value) {
            addCriterion("evaluate_name >", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_name >=", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameLessThan(String value) {
            addCriterion("evaluate_name <", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameLessThanOrEqualTo(String value) {
            addCriterion("evaluate_name <=", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameLike(String value) {
            addCriterion("evaluate_name like", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameNotLike(String value) {
            addCriterion("evaluate_name not like", value, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameIn(List<String> values) {
            addCriterion("evaluate_name in", values, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameNotIn(List<String> values) {
            addCriterion("evaluate_name not in", values, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameBetween(String value1, String value2) {
            addCriterion("evaluate_name between", value1, value2, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluateNameNotBetween(String value1, String value2) {
            addCriterion("evaluate_name not between", value1, value2, "evaluateName");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneIsNull() {
            addCriterion("evaluate_phone is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneIsNotNull() {
            addCriterion("evaluate_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneEqualTo(String value) {
            addCriterion("evaluate_phone =", value, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneNotEqualTo(String value) {
            addCriterion("evaluate_phone <>", value, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneGreaterThan(String value) {
            addCriterion("evaluate_phone >", value, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_phone >=", value, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneLessThan(String value) {
            addCriterion("evaluate_phone <", value, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneLessThanOrEqualTo(String value) {
            addCriterion("evaluate_phone <=", value, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneLike(String value) {
            addCriterion("evaluate_phone like", value, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneNotLike(String value) {
            addCriterion("evaluate_phone not like", value, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneIn(List<String> values) {
            addCriterion("evaluate_phone in", values, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneNotIn(List<String> values) {
            addCriterion("evaluate_phone not in", values, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneBetween(String value1, String value2) {
            addCriterion("evaluate_phone between", value1, value2, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluatePhoneNotBetween(String value1, String value2) {
            addCriterion("evaluate_phone not between", value1, value2, "evaluatePhone");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupIsNull() {
            addCriterion("evaluate_group is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupIsNotNull() {
            addCriterion("evaluate_group is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupEqualTo(String value) {
            addCriterion("evaluate_group =", value, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupNotEqualTo(String value) {
            addCriterion("evaluate_group <>", value, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupGreaterThan(String value) {
            addCriterion("evaluate_group >", value, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_group >=", value, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupLessThan(String value) {
            addCriterion("evaluate_group <", value, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupLessThanOrEqualTo(String value) {
            addCriterion("evaluate_group <=", value, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupLike(String value) {
            addCriterion("evaluate_group like", value, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupNotLike(String value) {
            addCriterion("evaluate_group not like", value, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupIn(List<String> values) {
            addCriterion("evaluate_group in", values, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupNotIn(List<String> values) {
            addCriterion("evaluate_group not in", values, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupBetween(String value1, String value2) {
            addCriterion("evaluate_group between", value1, value2, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateGroupNotBetween(String value1, String value2) {
            addCriterion("evaluate_group not between", value1, value2, "evaluateGroup");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressIsNull() {
            addCriterion("evaluate_address is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressIsNotNull() {
            addCriterion("evaluate_address is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressEqualTo(String value) {
            addCriterion("evaluate_address =", value, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressNotEqualTo(String value) {
            addCriterion("evaluate_address <>", value, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressGreaterThan(String value) {
            addCriterion("evaluate_address >", value, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_address >=", value, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressLessThan(String value) {
            addCriterion("evaluate_address <", value, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressLessThanOrEqualTo(String value) {
            addCriterion("evaluate_address <=", value, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressLike(String value) {
            addCriterion("evaluate_address like", value, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressNotLike(String value) {
            addCriterion("evaluate_address not like", value, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressIn(List<String> values) {
            addCriterion("evaluate_address in", values, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressNotIn(List<String> values) {
            addCriterion("evaluate_address not in", values, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressBetween(String value1, String value2) {
            addCriterion("evaluate_address between", value1, value2, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateAddressNotBetween(String value1, String value2) {
            addCriterion("evaluate_address not between", value1, value2, "evaluateAddress");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailIsNull() {
            addCriterion("evaluate_email is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailIsNotNull() {
            addCriterion("evaluate_email is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailEqualTo(String value) {
            addCriterion("evaluate_email =", value, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailNotEqualTo(String value) {
            addCriterion("evaluate_email <>", value, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailGreaterThan(String value) {
            addCriterion("evaluate_email >", value, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_email >=", value, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailLessThan(String value) {
            addCriterion("evaluate_email <", value, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailLessThanOrEqualTo(String value) {
            addCriterion("evaluate_email <=", value, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailLike(String value) {
            addCriterion("evaluate_email like", value, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailNotLike(String value) {
            addCriterion("evaluate_email not like", value, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailIn(List<String> values) {
            addCriterion("evaluate_email in", values, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailNotIn(List<String> values) {
            addCriterion("evaluate_email not in", values, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailBetween(String value1, String value2) {
            addCriterion("evaluate_email between", value1, value2, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateEmailNotBetween(String value1, String value2) {
            addCriterion("evaluate_email not between", value1, value2, "evaluateEmail");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeIsNull() {
            addCriterion("evaluate_createtime is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeIsNotNull() {
            addCriterion("evaluate_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeEqualTo(Date value) {
            addCriterion("evaluate_createtime =", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeNotEqualTo(Date value) {
            addCriterion("evaluate_createtime <>", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeGreaterThan(Date value) {
            addCriterion("evaluate_createtime >", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluate_createtime >=", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeLessThan(Date value) {
            addCriterion("evaluate_createtime <", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluate_createtime <=", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeIn(List<Date> values) {
            addCriterion("evaluate_createtime in", values, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeNotIn(List<Date> values) {
            addCriterion("evaluate_createtime not in", values, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeBetween(Date value1, Date value2) {
            addCriterion("evaluate_createtime between", value1, value2, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluate_createtime not between", value1, value2, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeIsNull() {
            addCriterion("evaluate_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeIsNotNull() {
            addCriterion("evaluate_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeEqualTo(Date value) {
            addCriterion("evaluate_updatetime =", value, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeNotEqualTo(Date value) {
            addCriterion("evaluate_updatetime <>", value, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeGreaterThan(Date value) {
            addCriterion("evaluate_updatetime >", value, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluate_updatetime >=", value, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeLessThan(Date value) {
            addCriterion("evaluate_updatetime <", value, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluate_updatetime <=", value, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeIn(List<Date> values) {
            addCriterion("evaluate_updatetime in", values, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeNotIn(List<Date> values) {
            addCriterion("evaluate_updatetime not in", values, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("evaluate_updatetime between", value1, value2, "evaluateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluate_updatetime not between", value1, value2, "evaluateUpdatetime");
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