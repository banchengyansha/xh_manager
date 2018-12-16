package com.xh.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbAbilityGradeLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAbilityGradeLevelExample() {
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

        public Criteria andLevelMentalityStatusIsNull() {
            addCriterion("level_mentality_status is null");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusIsNotNull() {
            addCriterion("level_mentality_status is not null");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusEqualTo(Integer value) {
            addCriterion("level_mentality_status =", value, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusNotEqualTo(Integer value) {
            addCriterion("level_mentality_status <>", value, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusGreaterThan(Integer value) {
            addCriterion("level_mentality_status >", value, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_mentality_status >=", value, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusLessThan(Integer value) {
            addCriterion("level_mentality_status <", value, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("level_mentality_status <=", value, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusIn(List<Integer> values) {
            addCriterion("level_mentality_status in", values, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusNotIn(List<Integer> values) {
            addCriterion("level_mentality_status not in", values, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusBetween(Integer value1, Integer value2) {
            addCriterion("level_mentality_status between", value1, value2, "levelMentalityStatus");
            return (Criteria) this;
        }

        public Criteria andLevelMentalityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("level_mentality_status not between", value1, value2, "levelMentalityStatus");
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

        public Criteria andLevelSocialParticipationIsNull() {
            addCriterion("level_social_participation is null");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationIsNotNull() {
            addCriterion("level_social_participation is not null");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationEqualTo(Integer value) {
            addCriterion("level_social_participation =", value, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationNotEqualTo(Integer value) {
            addCriterion("level_social_participation <>", value, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationGreaterThan(Integer value) {
            addCriterion("level_social_participation >", value, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_social_participation >=", value, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationLessThan(Integer value) {
            addCriterion("level_social_participation <", value, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationLessThanOrEqualTo(Integer value) {
            addCriterion("level_social_participation <=", value, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationIn(List<Integer> values) {
            addCriterion("level_social_participation in", values, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationNotIn(List<Integer> values) {
            addCriterion("level_social_participation not in", values, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationBetween(Integer value1, Integer value2) {
            addCriterion("level_social_participation between", value1, value2, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andLevelSocialParticipationNotBetween(Integer value1, Integer value2) {
            addCriterion("level_social_participation not between", value1, value2, "levelSocialParticipation");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelIsNull() {
            addCriterion("ability_level is null");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelIsNotNull() {
            addCriterion("ability_level is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelEqualTo(Integer value) {
            addCriterion("ability_level =", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelNotEqualTo(Integer value) {
            addCriterion("ability_level <>", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelGreaterThan(Integer value) {
            addCriterion("ability_level >", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ability_level >=", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelLessThan(Integer value) {
            addCriterion("ability_level <", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelLessThanOrEqualTo(Integer value) {
            addCriterion("ability_level <=", value, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelIn(List<Integer> values) {
            addCriterion("ability_level in", values, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelNotIn(List<Integer> values) {
            addCriterion("ability_level not in", values, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelBetween(Integer value1, Integer value2) {
            addCriterion("ability_level between", value1, value2, "abilityLevel");
            return (Criteria) this;
        }

        public Criteria andAbilityLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ability_level not between", value1, value2, "abilityLevel");
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