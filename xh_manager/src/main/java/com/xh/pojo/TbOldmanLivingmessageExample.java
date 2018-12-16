package com.xh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOldmanLivingmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOldmanLivingmessageExample() {
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

        public Criteria andLivingEatIsNull() {
            addCriterion("living_eat is null");
            return (Criteria) this;
        }

        public Criteria andLivingEatIsNotNull() {
            addCriterion("living_eat is not null");
            return (Criteria) this;
        }

        public Criteria andLivingEatEqualTo(Integer value) {
            addCriterion("living_eat =", value, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatNotEqualTo(Integer value) {
            addCriterion("living_eat <>", value, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatGreaterThan(Integer value) {
            addCriterion("living_eat >", value, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_eat >=", value, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatLessThan(Integer value) {
            addCriterion("living_eat <", value, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatLessThanOrEqualTo(Integer value) {
            addCriterion("living_eat <=", value, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatIn(List<Integer> values) {
            addCriterion("living_eat in", values, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatNotIn(List<Integer> values) {
            addCriterion("living_eat not in", values, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatBetween(Integer value1, Integer value2) {
            addCriterion("living_eat between", value1, value2, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingEatNotBetween(Integer value1, Integer value2) {
            addCriterion("living_eat not between", value1, value2, "livingEat");
            return (Criteria) this;
        }

        public Criteria andLivingBatheIsNull() {
            addCriterion("living_bathe is null");
            return (Criteria) this;
        }

        public Criteria andLivingBatheIsNotNull() {
            addCriterion("living_bathe is not null");
            return (Criteria) this;
        }

        public Criteria andLivingBatheEqualTo(Integer value) {
            addCriterion("living_bathe =", value, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheNotEqualTo(Integer value) {
            addCriterion("living_bathe <>", value, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheGreaterThan(Integer value) {
            addCriterion("living_bathe >", value, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_bathe >=", value, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheLessThan(Integer value) {
            addCriterion("living_bathe <", value, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheLessThanOrEqualTo(Integer value) {
            addCriterion("living_bathe <=", value, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheIn(List<Integer> values) {
            addCriterion("living_bathe in", values, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheNotIn(List<Integer> values) {
            addCriterion("living_bathe not in", values, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheBetween(Integer value1, Integer value2) {
            addCriterion("living_bathe between", value1, value2, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingBatheNotBetween(Integer value1, Integer value2) {
            addCriterion("living_bathe not between", value1, value2, "livingBathe");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateIsNull() {
            addCriterion("living_decorate is null");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateIsNotNull() {
            addCriterion("living_decorate is not null");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateEqualTo(Integer value) {
            addCriterion("living_decorate =", value, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateNotEqualTo(Integer value) {
            addCriterion("living_decorate <>", value, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateGreaterThan(Integer value) {
            addCriterion("living_decorate >", value, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_decorate >=", value, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateLessThan(Integer value) {
            addCriterion("living_decorate <", value, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateLessThanOrEqualTo(Integer value) {
            addCriterion("living_decorate <=", value, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateIn(List<Integer> values) {
            addCriterion("living_decorate in", values, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateNotIn(List<Integer> values) {
            addCriterion("living_decorate not in", values, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateBetween(Integer value1, Integer value2) {
            addCriterion("living_decorate between", value1, value2, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDecorateNotBetween(Integer value1, Integer value2) {
            addCriterion("living_decorate not between", value1, value2, "livingDecorate");
            return (Criteria) this;
        }

        public Criteria andLivingDressIsNull() {
            addCriterion("living_dress is null");
            return (Criteria) this;
        }

        public Criteria andLivingDressIsNotNull() {
            addCriterion("living_dress is not null");
            return (Criteria) this;
        }

        public Criteria andLivingDressEqualTo(Integer value) {
            addCriterion("living_dress =", value, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressNotEqualTo(Integer value) {
            addCriterion("living_dress <>", value, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressGreaterThan(Integer value) {
            addCriterion("living_dress >", value, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_dress >=", value, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressLessThan(Integer value) {
            addCriterion("living_dress <", value, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressLessThanOrEqualTo(Integer value) {
            addCriterion("living_dress <=", value, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressIn(List<Integer> values) {
            addCriterion("living_dress in", values, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressNotIn(List<Integer> values) {
            addCriterion("living_dress not in", values, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressBetween(Integer value1, Integer value2) {
            addCriterion("living_dress between", value1, value2, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingDressNotBetween(Integer value1, Integer value2) {
            addCriterion("living_dress not between", value1, value2, "livingDress");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlIsNull() {
            addCriterion("living_stool_control is null");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlIsNotNull() {
            addCriterion("living_stool_control is not null");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlEqualTo(Integer value) {
            addCriterion("living_stool_control =", value, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlNotEqualTo(Integer value) {
            addCriterion("living_stool_control <>", value, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlGreaterThan(Integer value) {
            addCriterion("living_stool_control >", value, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_stool_control >=", value, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlLessThan(Integer value) {
            addCriterion("living_stool_control <", value, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlLessThanOrEqualTo(Integer value) {
            addCriterion("living_stool_control <=", value, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlIn(List<Integer> values) {
            addCriterion("living_stool_control in", values, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlNotIn(List<Integer> values) {
            addCriterion("living_stool_control not in", values, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlBetween(Integer value1, Integer value2) {
            addCriterion("living_stool_control between", value1, value2, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingStoolControlNotBetween(Integer value1, Integer value2) {
            addCriterion("living_stool_control not between", value1, value2, "livingStoolControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlIsNull() {
            addCriterion("living_urination_control is null");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlIsNotNull() {
            addCriterion("living_urination_control is not null");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlEqualTo(Integer value) {
            addCriterion("living_urination_control =", value, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlNotEqualTo(Integer value) {
            addCriterion("living_urination_control <>", value, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlGreaterThan(Integer value) {
            addCriterion("living_urination_control >", value, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_urination_control >=", value, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlLessThan(Integer value) {
            addCriterion("living_urination_control <", value, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlLessThanOrEqualTo(Integer value) {
            addCriterion("living_urination_control <=", value, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlIn(List<Integer> values) {
            addCriterion("living_urination_control in", values, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlNotIn(List<Integer> values) {
            addCriterion("living_urination_control not in", values, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlBetween(Integer value1, Integer value2) {
            addCriterion("living_urination_control between", value1, value2, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingUrinationControlNotBetween(Integer value1, Integer value2) {
            addCriterion("living_urination_control not between", value1, value2, "livingUrinationControl");
            return (Criteria) this;
        }

        public Criteria andLivingToiletIsNull() {
            addCriterion("living_toilet is null");
            return (Criteria) this;
        }

        public Criteria andLivingToiletIsNotNull() {
            addCriterion("living_toilet is not null");
            return (Criteria) this;
        }

        public Criteria andLivingToiletEqualTo(Integer value) {
            addCriterion("living_toilet =", value, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletNotEqualTo(Integer value) {
            addCriterion("living_toilet <>", value, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletGreaterThan(Integer value) {
            addCriterion("living_toilet >", value, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_toilet >=", value, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletLessThan(Integer value) {
            addCriterion("living_toilet <", value, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletLessThanOrEqualTo(Integer value) {
            addCriterion("living_toilet <=", value, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletIn(List<Integer> values) {
            addCriterion("living_toilet in", values, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletNotIn(List<Integer> values) {
            addCriterion("living_toilet not in", values, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletBetween(Integer value1, Integer value2) {
            addCriterion("living_toilet between", value1, value2, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingToiletNotBetween(Integer value1, Integer value2) {
            addCriterion("living_toilet not between", value1, value2, "livingToilet");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferIsNull() {
            addCriterion("living_bed_chair_transfer is null");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferIsNotNull() {
            addCriterion("living_bed_chair_transfer is not null");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferEqualTo(Integer value) {
            addCriterion("living_bed_chair_transfer =", value, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferNotEqualTo(Integer value) {
            addCriterion("living_bed_chair_transfer <>", value, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferGreaterThan(Integer value) {
            addCriterion("living_bed_chair_transfer >", value, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_bed_chair_transfer >=", value, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferLessThan(Integer value) {
            addCriterion("living_bed_chair_transfer <", value, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferLessThanOrEqualTo(Integer value) {
            addCriterion("living_bed_chair_transfer <=", value, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferIn(List<Integer> values) {
            addCriterion("living_bed_chair_transfer in", values, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferNotIn(List<Integer> values) {
            addCriterion("living_bed_chair_transfer not in", values, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferBetween(Integer value1, Integer value2) {
            addCriterion("living_bed_chair_transfer between", value1, value2, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingBedChairTransferNotBetween(Integer value1, Integer value2) {
            addCriterion("living_bed_chair_transfer not between", value1, value2, "livingBedChairTransfer");
            return (Criteria) this;
        }

        public Criteria andLivingWalkIsNull() {
            addCriterion("living_walk is null");
            return (Criteria) this;
        }

        public Criteria andLivingWalkIsNotNull() {
            addCriterion("living_walk is not null");
            return (Criteria) this;
        }

        public Criteria andLivingWalkEqualTo(Integer value) {
            addCriterion("living_walk =", value, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkNotEqualTo(Integer value) {
            addCriterion("living_walk <>", value, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkGreaterThan(Integer value) {
            addCriterion("living_walk >", value, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_walk >=", value, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkLessThan(Integer value) {
            addCriterion("living_walk <", value, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkLessThanOrEqualTo(Integer value) {
            addCriterion("living_walk <=", value, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkIn(List<Integer> values) {
            addCriterion("living_walk in", values, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkNotIn(List<Integer> values) {
            addCriterion("living_walk not in", values, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkBetween(Integer value1, Integer value2) {
            addCriterion("living_walk between", value1, value2, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingWalkNotBetween(Integer value1, Integer value2) {
            addCriterion("living_walk not between", value1, value2, "livingWalk");
            return (Criteria) this;
        }

        public Criteria andLivingStairsIsNull() {
            addCriterion("living_stairs is null");
            return (Criteria) this;
        }

        public Criteria andLivingStairsIsNotNull() {
            addCriterion("living_stairs is not null");
            return (Criteria) this;
        }

        public Criteria andLivingStairsEqualTo(Integer value) {
            addCriterion("living_stairs =", value, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsNotEqualTo(Integer value) {
            addCriterion("living_stairs <>", value, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsGreaterThan(Integer value) {
            addCriterion("living_stairs >", value, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsGreaterThanOrEqualTo(Integer value) {
            addCriterion("living_stairs >=", value, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsLessThan(Integer value) {
            addCriterion("living_stairs <", value, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsLessThanOrEqualTo(Integer value) {
            addCriterion("living_stairs <=", value, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsIn(List<Integer> values) {
            addCriterion("living_stairs in", values, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsNotIn(List<Integer> values) {
            addCriterion("living_stairs not in", values, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsBetween(Integer value1, Integer value2) {
            addCriterion("living_stairs between", value1, value2, "livingStairs");
            return (Criteria) this;
        }

        public Criteria andLivingStairsNotBetween(Integer value1, Integer value2) {
            addCriterion("living_stairs not between", value1, value2, "livingStairs");
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