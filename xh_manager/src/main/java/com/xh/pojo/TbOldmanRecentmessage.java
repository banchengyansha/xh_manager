package com.xh.pojo;

import java.util.Date;

public class TbOldmanRecentmessage {
    private Integer id;

    private Integer senileDementia;

    private Integer mentalIllness;

    private Integer fallRecently;

    private Integer chokingRecently;

    private Integer lostRecently;

    private Integer commitSuicideRecently;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSenileDementia() {
        return senileDementia;
    }

    public void setSenileDementia(Integer senileDementia) {
        this.senileDementia = senileDementia;
    }

    public Integer getMentalIllness() {
        return mentalIllness;
    }

    public void setMentalIllness(Integer mentalIllness) {
        this.mentalIllness = mentalIllness;
    }

    public Integer getFallRecently() {
        return fallRecently;
    }

    public void setFallRecently(Integer fallRecently) {
        this.fallRecently = fallRecently;
    }

    public Integer getChokingRecently() {
        return chokingRecently;
    }

    public void setChokingRecently(Integer chokingRecently) {
        this.chokingRecently = chokingRecently;
    }

    public Integer getLostRecently() {
        return lostRecently;
    }

    public void setLostRecently(Integer lostRecently) {
        this.lostRecently = lostRecently;
    }

    public Integer getCommitSuicideRecently() {
        return commitSuicideRecently;
    }

    public void setCommitSuicideRecently(Integer commitSuicideRecently) {
        this.commitSuicideRecently = commitSuicideRecently;
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