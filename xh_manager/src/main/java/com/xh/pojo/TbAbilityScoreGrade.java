package com.xh.pojo;

public class TbAbilityScoreGrade {
    private Integer id;

    private Integer lowerLimitScore;

    private Integer upperLimitScore;

    private Integer abilityCat;

    private String abilityDesc;

    private Integer abilityGrade;

    private String abilityGradeDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLowerLimitScore() {
        return lowerLimitScore;
    }

    public void setLowerLimitScore(Integer lowerLimitScore) {
        this.lowerLimitScore = lowerLimitScore;
    }

    public Integer getUpperLimitScore() {
        return upperLimitScore;
    }

    public void setUpperLimitScore(Integer upperLimitScore) {
        this.upperLimitScore = upperLimitScore;
    }

    public Integer getAbilityCat() {
        return abilityCat;
    }

    public void setAbilityCat(Integer abilityCat) {
        this.abilityCat = abilityCat;
    }

    public String getAbilityDesc() {
        return abilityDesc;
    }

    public void setAbilityDesc(String abilityDesc) {
        this.abilityDesc = abilityDesc == null ? null : abilityDesc.trim();
    }

    public Integer getAbilityGrade() {
        return abilityGrade;
    }

    public void setAbilityGrade(Integer abilityGrade) {
        this.abilityGrade = abilityGrade;
    }

    public String getAbilityGradeDesc() {
        return abilityGradeDesc;
    }

    public void setAbilityGradeDesc(String abilityGradeDesc) {
        this.abilityGradeDesc = abilityGradeDesc == null ? null : abilityGradeDesc.trim();
    }
}