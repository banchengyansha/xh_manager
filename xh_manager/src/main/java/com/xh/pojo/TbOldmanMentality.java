package com.xh.pojo;

import java.util.Date;

public class TbOldmanMentality {
    private Integer id;

    private Integer cognitiveFunction;

    private Integer aggressiveBehavior;

    private Integer depressiveSymptoms;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCognitiveFunction() {
        return cognitiveFunction;
    }

    public void setCognitiveFunction(Integer cognitiveFunction) {
        this.cognitiveFunction = cognitiveFunction;
    }

    public Integer getAggressiveBehavior() {
        return aggressiveBehavior;
    }

    public void setAggressiveBehavior(Integer aggressiveBehavior) {
        this.aggressiveBehavior = aggressiveBehavior;
    }

    public Integer getDepressiveSymptoms() {
        return depressiveSymptoms;
    }

    public void setDepressiveSymptoms(Integer depressiveSymptoms) {
        this.depressiveSymptoms = depressiveSymptoms;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}