package com.softjx.model;

import java.util.Date;

public class Teacher {
    private Integer teaId;

    private String teaCode;

    private String teaName;

    private String schCode;

    private String teaPass;

    private String teaSex;

    private Integer teaAge;

    private Date teaCreateTime;

    private String teaCreateBy;

    private Boolean teaFlag;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaCode() {
        return teaCode;
    }

    public void setTeaCode(String teaCode) {
        this.teaCode = teaCode == null ? null : teaCode.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getSchCode() {
        return schCode;
    }

    public void setSchCode(String schCode) {
        this.schCode = schCode == null ? null : schCode.trim();
    }

    public String getTeaPass() {
        return teaPass;
    }

    public void setTeaPass(String teaPass) {
        this.teaPass = teaPass == null ? null : teaPass.trim();
    }

    public String getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex == null ? null : teaSex.trim();
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    public Date getTeaCreateTime() {
        return teaCreateTime;
    }

    public void setTeaCreateTime(Date teaCreateTime) {
        this.teaCreateTime = teaCreateTime;
    }

    public String getTeaCreateBy() {
        return teaCreateBy;
    }

    public void setTeaCreateBy(String teaCreateBy) {
        this.teaCreateBy = teaCreateBy == null ? null : teaCreateBy.trim();
    }

    public Boolean getTeaFlag() {
        return teaFlag;
    }

    public void setTeaFlag(Boolean teaFlag) {
        this.teaFlag = teaFlag;
    }
}