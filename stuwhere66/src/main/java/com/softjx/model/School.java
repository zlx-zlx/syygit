package com.softjx.model;

import java.util.Date;

public class School {
    private Integer schId;

    private String schCode;

    private String schName;

    private String schPass;

    private Date schCreateTime;

    private String schCreateBy;

    private Boolean schFlag;
    
   
    public Integer getSchId() {
        return schId;
    }

    public void setSchId(Integer schId) {
        this.schId = schId;
    }

    public String getSchCode() {
        return schCode;
    }

    public void setSchCode(String schCode) {
        this.schCode = schCode == null ? null : schCode.trim();
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName == null ? null : schName.trim();
    }

    public String getSchPass() {
        return schPass;
    }

    public void setSchPass(String schPass) {
        this.schPass = schPass == null ? null : schPass.trim();
    }

    public Date getSchCreateTime() {
        return schCreateTime;
    }

    public void setSchCreateTime(Date schCreateTime) {
        this.schCreateTime = schCreateTime;
    }

    public String getSchCreateBy() {
        return schCreateBy;
    }

    public void setSchCreateBy(String schCreateBy) {
        this.schCreateBy = schCreateBy == null ? null : schCreateBy.trim();
    }

    public Boolean getSchFlag() {
        return schFlag;
    }

    public void setSchFlag(Boolean schFlag) {
        this.schFlag = schFlag;
    }
}