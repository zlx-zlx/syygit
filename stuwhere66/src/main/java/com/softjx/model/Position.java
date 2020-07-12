package com.softjx.model;

public class Position {
    private Integer poId;

    private String poCode;

    private String poName;

    private Boolean poFlag;

    public Integer getPoId() {
        return poId;
    }

    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
    }

    public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName == null ? null : poName.trim();
    }

    public Boolean getPoFlag() {
        return poFlag;
    }

    public void setPoFlag(Boolean poFlag) {
        this.poFlag = poFlag;
    }
}