package com.xh.pojo;

import java.util.Date;

public class TbOldmanPerception {
    private Integer id;

    private Integer consciousnessLevel;//意识水平

    private Integer visionLevel;//视力

    private Integer hearingLevel;//听力

    private Integer communicationLevel;//沟通交流

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConsciousnessLevel() {
        return consciousnessLevel;
    }

    public void setConsciousnessLevel(Integer consciousnessLevel) {
        this.consciousnessLevel = consciousnessLevel;
    }

    public Integer getVisionLevel() {
        return visionLevel;
    }

    public void setVisionLevel(Integer visionLevel) {
        this.visionLevel = visionLevel;
    }

    public Integer getHearingLevel() {
        return hearingLevel;
    }

    public void setHearingLevel(Integer hearingLevel) {
        this.hearingLevel = hearingLevel;
    }

    public Integer getCommunicationLevel() {
        return communicationLevel;
    }

    public void setCommunicationLevel(Integer communicationLevel) {
        this.communicationLevel = communicationLevel;
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