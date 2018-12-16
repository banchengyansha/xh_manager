package com.xh.pojo;

import java.util.Date;

public class TbOldmanSocialParticipation {
    private Integer id;

    private Integer livingAbility;

    private Integer jobAbility;

    private Integer timeSpaceOrientation;

    private Integer personageOrientation;

    private Integer communicationAbility;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLivingAbility() {
        return livingAbility;
    }

    public void setLivingAbility(Integer livingAbility) {
        this.livingAbility = livingAbility;
    }

    public Integer getJobAbility() {
        return jobAbility;
    }

    public void setJobAbility(Integer jobAbility) {
        this.jobAbility = jobAbility;
    }

    public Integer getTimeSpaceOrientation() {
        return timeSpaceOrientation;
    }

    public void setTimeSpaceOrientation(Integer timeSpaceOrientation) {
        this.timeSpaceOrientation = timeSpaceOrientation;
    }

    public Integer getPersonageOrientation() {
        return personageOrientation;
    }

    public void setPersonageOrientation(Integer personageOrientation) {
        this.personageOrientation = personageOrientation;
    }

    public Integer getCommunicationAbility() {
        return communicationAbility;
    }

    public void setCommunicationAbility(Integer communicationAbility) {
        this.communicationAbility = communicationAbility;
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