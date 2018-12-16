package com.xh.pojo;

import java.util.Date;

public class TbOldmanLinkmessage {
    private Integer id;

    private String providerName;

    private Integer providerRelation;

    private String linkman1Name;

    private String linkman1Phone;

    private String linkman2Name;

    private String linkman2Phone;

    private String linkman3Name;

    private String linkman3Phone;

    private String evaluateName;

    private String evaluatePhone;

    private String evaluateGroup;

    private String evaluateAddress;

    private String evaluateEmail;

    private Date evaluateCreatetime;

    private Date evaluateUpdatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName == null ? null : providerName.trim();
    }

    public Integer getProviderRelation() {
        return providerRelation;
    }

    public void setProviderRelation(Integer providerRelation) {
        this.providerRelation = providerRelation;
    }

    public String getLinkman1Name() {
        return linkman1Name;
    }

    public void setLinkman1Name(String linkman1Name) {
        this.linkman1Name = linkman1Name == null ? null : linkman1Name.trim();
    }

    public String getLinkman1Phone() {
        return linkman1Phone;
    }

    public void setLinkman1Phone(String linkman1Phone) {
        this.linkman1Phone = linkman1Phone == null ? null : linkman1Phone.trim();
    }

    public String getLinkman2Name() {
        return linkman2Name;
    }

    public void setLinkman2Name(String linkman2Name) {
        this.linkman2Name = linkman2Name == null ? null : linkman2Name.trim();
    }

    public String getLinkman2Phone() {
        return linkman2Phone;
    }

    public void setLinkman2Phone(String linkman2Phone) {
        this.linkman2Phone = linkman2Phone == null ? null : linkman2Phone.trim();
    }

    public String getLinkman3Name() {
        return linkman3Name;
    }

    public void setLinkman3Name(String linkman3Name) {
        this.linkman3Name = linkman3Name == null ? null : linkman3Name.trim();
    }

    public String getLinkman3Phone() {
        return linkman3Phone;
    }

    public void setLinkman3Phone(String linkman3Phone) {
        this.linkman3Phone = linkman3Phone == null ? null : linkman3Phone.trim();
    }

    public String getEvaluateName() {
        return evaluateName;
    }

    public void setEvaluateName(String evaluateName) {
        this.evaluateName = evaluateName == null ? null : evaluateName.trim();
    }

    public String getEvaluatePhone() {
        return evaluatePhone;
    }

    public void setEvaluatePhone(String evaluatePhone) {
        this.evaluatePhone = evaluatePhone == null ? null : evaluatePhone.trim();
    }

    public String getEvaluateGroup() {
        return evaluateGroup;
    }

    public void setEvaluateGroup(String evaluateGroup) {
        this.evaluateGroup = evaluateGroup == null ? null : evaluateGroup.trim();
    }

    public String getEvaluateAddress() {
        return evaluateAddress;
    }

    public void setEvaluateAddress(String evaluateAddress) {
        this.evaluateAddress = evaluateAddress == null ? null : evaluateAddress.trim();
    }

    public String getEvaluateEmail() {
        return evaluateEmail;
    }

    public void setEvaluateEmail(String evaluateEmail) {
        this.evaluateEmail = evaluateEmail == null ? null : evaluateEmail.trim();
    }

    public Date getEvaluateCreatetime() {
        return evaluateCreatetime;
    }

    public void setEvaluateCreatetime(Date evaluateCreatetime) {
        this.evaluateCreatetime = evaluateCreatetime;
    }

    public Date getEvaluateUpdatetime() {
        return evaluateUpdatetime;
    }

    public void setEvaluateUpdatetime(Date evaluateUpdatetime) {
        this.evaluateUpdatetime = evaluateUpdatetime;
    }
}