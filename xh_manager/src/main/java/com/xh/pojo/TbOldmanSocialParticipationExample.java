package com.xh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOldmanSocialParticipationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOldmanSocialParticipationExample() {
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

        public Criteria andLivingAbilityIsNull() {
            addCriterion("living_ability is null");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityIsNotNull() {
            addCriterion("living_ability is not null");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityEqualTo(Integer value) {
            addCriterion("living_ability =", value, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityNotEqualTo(Integer value) {
            addCriterion("living_ability <>", value, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityGreaterThan(Integer value) {
            addCriterion("living_ability >", value, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_ability >=", value, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityLessThan(Integer value) {
            addCriterion("living_ability <", value, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityLessThanOrEqualTo(Integer value) {
            addCriterion("living_ability <=", value, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityIn(List<Integer> values) {
            addCriterion("living_ability in", values, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityNotIn(List<Integer> values) {
            addCriterion("living_ability not in", values, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityBetween(Integer value1, Integer value2) {
            addCriterion("living_ability between", value1, value2, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andLivingAbilityNotBetween(Integer value1, Integer value2) {
            addCriterion("living_ability not between", value1, value2, "livingAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityIsNull() {
            addCriterion("job_ability is null");
            return (Criteria) this;
        }

        public Criteria andJobAbilityIsNotNull() {
            addCriterion("job_ability is not null");
            return (Criteria) this;
        }

        public Criteria andJobAbilityEqualTo(Integer value) {
            addCriterion("job_ability =", value, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityNotEqualTo(Integer value) {
            addCriterion("job_ability <>", value, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityGreaterThan(Integer value) {
            addCriterion("job_ability >", value, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_ability >=", value, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityLessThan(Integer value) {
            addCriterion("job_ability <", value, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityLessThanOrEqualTo(Integer value) {
            addCriterion("job_ability <=", value, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityIn(List<Integer> values) {
            addCriterion("job_ability in", values, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityNotIn(List<Integer> values) {
            addCriterion("job_ability not in", values, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityBetween(Integer value1, Integer value2) {
            addCriterion("job_ability between", value1, value2, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andJobAbilityNotBetween(Integer value1, Integer value2) {
            addCriterion("job_ability not between", value1, value2, "jobAbility");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationIsNull() {
            addCriterion("time_space_orientation is null");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationIsNotNull() {
            addCriterion("time_space_orientation is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationEqualTo(Integer value) {
            addCriterion("time_space_orientation =", value, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationNotEqualTo(Integer value) {
            addCriterion("time_space_orientation <>", value, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationGreaterThan(Integer value) {
            addCriterion("time_space_orientation >", value, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_space_orientation >=", value, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationLessThan(Integer value) {
            addCriterion("time_space_orientation <", value, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationLessThanOrEqualTo(Integer value) {
            addCriterion("time_space_orientation <=", value, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationIn(List<Integer> values) {
            addCriterion("time_space_orientation in", values, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationNotIn(List<Integer> values) {
            addCriterion("time_space_orientation not in", values, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationBetween(Integer value1, Integer value2) {
            addCriterion("time_space_orientation between", value1, value2, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andTimeSpaceOrientationNotBetween(Integer value1, Integer value2) {
            addCriterion("time_space_orientation not between", value1, value2, "timeSpaceOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationIsNull() {
            addCriterion("personage_orientation is null");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationIsNotNull() {
            addCriterion("personage_orientation is not null");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationEqualTo(Integer value) {
            addCriterion("personage_orientation =", value, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationNotEqualTo(Integer value) {
            addCriterion("personage_orientation <>", value, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationGreaterThan(Integer value) {
            addCriterion("personage_orientation >", value, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationGreaterThanOrEqualTo(Integer value) {
            addCriterion("personage_orientation >=", value, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationLessThan(Integer value) {
            addCriterion("personage_orientation <", value, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationLessThanOrEqualTo(Integer value) {
            addCriterion("personage_orientation <=", value, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationIn(List<Integer> values) {
            addCriterion("personage_orientation in", values, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationNotIn(List<Integer> values) {
            addCriterion("personage_orientation not in", values, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationBetween(Integer value1, Integer value2) {
            addCriterion("personage_orientation between", value1, value2, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andPersonageOrientationNotBetween(Integer value1, Integer value2) {
            addCriterion("personage_orientation not between", value1, value2, "personageOrientation");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityIsNull() {
            addCriterion("communication_ability is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityIsNotNull() {
            addCriterion("communication_ability is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityEqualTo(Integer value) {
            addCriterion("communication_ability =", value, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityNotEqualTo(Integer value) {
            addCriterion("communication_ability <>", value, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityGreaterThan(Integer value) {
            addCriterion("communication_ability >", value, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("communication_ability >=", value, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityLessThan(Integer value) {
            addCriterion("communication_ability <", value, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityLessThanOrEqualTo(Integer value) {
            addCriterion("communication_ability <=", value, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityIn(List<Integer> values) {
            addCriterion("communication_ability in", values, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityNotIn(List<Integer> values) {
            addCriterion("communication_ability not in", values, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityBetween(Integer value1, Integer value2) {
            addCriterion("communication_ability between", value1, value2, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCommunicationAbilityNotBetween(Integer value1, Integer value2) {
            addCriterion("communication_ability not between", value1, value2, "communicationAbility");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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