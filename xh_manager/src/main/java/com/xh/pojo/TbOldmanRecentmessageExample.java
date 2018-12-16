package com.xh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOldmanRecentmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOldmanRecentmessageExample() {
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

        public Criteria andSenileDementiaIsNull() {
            addCriterion("senile_dementia is null");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaIsNotNull() {
            addCriterion("senile_dementia is not null");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaEqualTo(Integer value) {
            addCriterion("senile_dementia =", value, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaNotEqualTo(Integer value) {
            addCriterion("senile_dementia <>", value, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaGreaterThan(Integer value) {
            addCriterion("senile_dementia >", value, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("senile_dementia >=", value, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaLessThan(Integer value) {
            addCriterion("senile_dementia <", value, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaLessThanOrEqualTo(Integer value) {
            addCriterion("senile_dementia <=", value, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaIn(List<Integer> values) {
            addCriterion("senile_dementia in", values, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaNotIn(List<Integer> values) {
            addCriterion("senile_dementia not in", values, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaBetween(Integer value1, Integer value2) {
            addCriterion("senile_dementia between", value1, value2, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andSenileDementiaNotBetween(Integer value1, Integer value2) {
            addCriterion("senile_dementia not between", value1, value2, "senileDementia");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessIsNull() {
            addCriterion("mental_illness is null");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessIsNotNull() {
            addCriterion("mental_illness is not null");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessEqualTo(Integer value) {
            addCriterion("mental_illness =", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessNotEqualTo(Integer value) {
            addCriterion("mental_illness <>", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessGreaterThan(Integer value) {
            addCriterion("mental_illness >", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessGreaterThanOrEqualTo(Integer value) {
            addCriterion("mental_illness >=", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessLessThan(Integer value) {
            addCriterion("mental_illness <", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessLessThanOrEqualTo(Integer value) {
            addCriterion("mental_illness <=", value, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessIn(List<Integer> values) {
            addCriterion("mental_illness in", values, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessNotIn(List<Integer> values) {
            addCriterion("mental_illness not in", values, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessBetween(Integer value1, Integer value2) {
            addCriterion("mental_illness between", value1, value2, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andMentalIllnessNotBetween(Integer value1, Integer value2) {
            addCriterion("mental_illness not between", value1, value2, "mentalIllness");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyIsNull() {
            addCriterion("fall_recently is null");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyIsNotNull() {
            addCriterion("fall_recently is not null");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyEqualTo(Integer value) {
            addCriterion("fall_recently =", value, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyNotEqualTo(Integer value) {
            addCriterion("fall_recently <>", value, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyGreaterThan(Integer value) {
            addCriterion("fall_recently >", value, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("fall_recently >=", value, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyLessThan(Integer value) {
            addCriterion("fall_recently <", value, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyLessThanOrEqualTo(Integer value) {
            addCriterion("fall_recently <=", value, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyIn(List<Integer> values) {
            addCriterion("fall_recently in", values, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyNotIn(List<Integer> values) {
            addCriterion("fall_recently not in", values, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyBetween(Integer value1, Integer value2) {
            addCriterion("fall_recently between", value1, value2, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andFallRecentlyNotBetween(Integer value1, Integer value2) {
            addCriterion("fall_recently not between", value1, value2, "fallRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyIsNull() {
            addCriterion("choking_recently is null");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyIsNotNull() {
            addCriterion("choking_recently is not null");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyEqualTo(Integer value) {
            addCriterion("choking_recently =", value, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyNotEqualTo(Integer value) {
            addCriterion("choking_recently <>", value, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyGreaterThan(Integer value) {
            addCriterion("choking_recently >", value, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("choking_recently >=", value, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyLessThan(Integer value) {
            addCriterion("choking_recently <", value, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyLessThanOrEqualTo(Integer value) {
            addCriterion("choking_recently <=", value, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyIn(List<Integer> values) {
            addCriterion("choking_recently in", values, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyNotIn(List<Integer> values) {
            addCriterion("choking_recently not in", values, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyBetween(Integer value1, Integer value2) {
            addCriterion("choking_recently between", value1, value2, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andChokingRecentlyNotBetween(Integer value1, Integer value2) {
            addCriterion("choking_recently not between", value1, value2, "chokingRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyIsNull() {
            addCriterion("lost_recently is null");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyIsNotNull() {
            addCriterion("lost_recently is not null");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyEqualTo(Integer value) {
            addCriterion("lost_recently =", value, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyNotEqualTo(Integer value) {
            addCriterion("lost_recently <>", value, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyGreaterThan(Integer value) {
            addCriterion("lost_recently >", value, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("lost_recently >=", value, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyLessThan(Integer value) {
            addCriterion("lost_recently <", value, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyLessThanOrEqualTo(Integer value) {
            addCriterion("lost_recently <=", value, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyIn(List<Integer> values) {
            addCriterion("lost_recently in", values, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyNotIn(List<Integer> values) {
            addCriterion("lost_recently not in", values, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyBetween(Integer value1, Integer value2) {
            addCriterion("lost_recently between", value1, value2, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andLostRecentlyNotBetween(Integer value1, Integer value2) {
            addCriterion("lost_recently not between", value1, value2, "lostRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyIsNull() {
            addCriterion("commit_suicide_recently is null");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyIsNotNull() {
            addCriterion("commit_suicide_recently is not null");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyEqualTo(Integer value) {
            addCriterion("commit_suicide_recently =", value, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyNotEqualTo(Integer value) {
            addCriterion("commit_suicide_recently <>", value, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyGreaterThan(Integer value) {
            addCriterion("commit_suicide_recently >", value, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("commit_suicide_recently >=", value, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyLessThan(Integer value) {
            addCriterion("commit_suicide_recently <", value, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyLessThanOrEqualTo(Integer value) {
            addCriterion("commit_suicide_recently <=", value, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyIn(List<Integer> values) {
            addCriterion("commit_suicide_recently in", values, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyNotIn(List<Integer> values) {
            addCriterion("commit_suicide_recently not in", values, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyBetween(Integer value1, Integer value2) {
            addCriterion("commit_suicide_recently between", value1, value2, "commitSuicideRecently");
            return (Criteria) this;
        }

        public Criteria andCommitSuicideRecentlyNotBetween(Integer value1, Integer value2) {
            addCriterion("commit_suicide_recently not between", value1, value2, "commitSuicideRecently");
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