package com.xh.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbOldmanAbilityGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOldmanAbilityGradeExample() {
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

        public Criteria andLowerLimitScoreIsNull() {
            addCriterion("lower_limit_score is null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreIsNotNull() {
            addCriterion("lower_limit_score is not null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreEqualTo(Integer value) {
            addCriterion("lower_limit_score =", value, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreNotEqualTo(Integer value) {
            addCriterion("lower_limit_score <>", value, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreGreaterThan(Integer value) {
            addCriterion("lower_limit_score >", value, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("lower_limit_score >=", value, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreLessThan(Integer value) {
            addCriterion("lower_limit_score <", value, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreLessThanOrEqualTo(Integer value) {
            addCriterion("lower_limit_score <=", value, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreIn(List<Integer> values) {
            addCriterion("lower_limit_score in", values, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreNotIn(List<Integer> values) {
            addCriterion("lower_limit_score not in", values, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreBetween(Integer value1, Integer value2) {
            addCriterion("lower_limit_score between", value1, value2, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andLowerLimitScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("lower_limit_score not between", value1, value2, "lowerLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreIsNull() {
            addCriterion("upper_limit_score is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreIsNotNull() {
            addCriterion("upper_limit_score is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreEqualTo(Integer value) {
            addCriterion("upper_limit_score =", value, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreNotEqualTo(Integer value) {
            addCriterion("upper_limit_score <>", value, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreGreaterThan(Integer value) {
            addCriterion("upper_limit_score >", value, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("upper_limit_score >=", value, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreLessThan(Integer value) {
            addCriterion("upper_limit_score <", value, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreLessThanOrEqualTo(Integer value) {
            addCriterion("upper_limit_score <=", value, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreIn(List<Integer> values) {
            addCriterion("upper_limit_score in", values, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreNotIn(List<Integer> values) {
            addCriterion("upper_limit_score not in", values, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreBetween(Integer value1, Integer value2) {
            addCriterion("upper_limit_score between", value1, value2, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andUpperLimitScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("upper_limit_score not between", value1, value2, "upperLimitScore");
            return (Criteria) this;
        }

        public Criteria andAbilityCatIsNull() {
            addCriterion("ability_cat is null");
            return (Criteria) this;
        }

        public Criteria andAbilityCatIsNotNull() {
            addCriterion("ability_cat is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityCatEqualTo(Integer value) {
            addCriterion("ability_cat =", value, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatNotEqualTo(Integer value) {
            addCriterion("ability_cat <>", value, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatGreaterThan(Integer value) {
            addCriterion("ability_cat >", value, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatGreaterThanOrEqualTo(Integer value) {
            addCriterion("ability_cat >=", value, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatLessThan(Integer value) {
            addCriterion("ability_cat <", value, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatLessThanOrEqualTo(Integer value) {
            addCriterion("ability_cat <=", value, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatIn(List<Integer> values) {
            addCriterion("ability_cat in", values, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatNotIn(List<Integer> values) {
            addCriterion("ability_cat not in", values, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatBetween(Integer value1, Integer value2) {
            addCriterion("ability_cat between", value1, value2, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityCatNotBetween(Integer value1, Integer value2) {
            addCriterion("ability_cat not between", value1, value2, "abilityCat");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeIsNull() {
            addCriterion("ability_grade is null");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeIsNotNull() {
            addCriterion("ability_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeEqualTo(Integer value) {
            addCriterion("ability_grade =", value, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeNotEqualTo(Integer value) {
            addCriterion("ability_grade <>", value, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeGreaterThan(Integer value) {
            addCriterion("ability_grade >", value, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ability_grade >=", value, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeLessThan(Integer value) {
            addCriterion("ability_grade <", value, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeLessThanOrEqualTo(Integer value) {
            addCriterion("ability_grade <=", value, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeIn(List<Integer> values) {
            addCriterion("ability_grade in", values, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeNotIn(List<Integer> values) {
            addCriterion("ability_grade not in", values, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeBetween(Integer value1, Integer value2) {
            addCriterion("ability_grade between", value1, value2, "abilityGrade");
            return (Criteria) this;
        }

        public Criteria andAbilityGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("ability_grade not between", value1, value2, "abilityGrade");
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