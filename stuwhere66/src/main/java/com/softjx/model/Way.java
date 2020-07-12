package com.softjx.model;

import java.util.Date;

public class Way {
    private Integer wayId;

    private String stuNo;

    private String schCode;

    private String wayCompany;

    private String poCode;

    private Double waySalary;

    private String wayTime;

    private String wayAddrss;

    private String wayPhone;

    private String wayEvaluate;

    private Date wayCreateTime;

    private String wayCreateBy;

    private String wayCompanor;

    private Boolean wayFlag;
    
  //关联字段
    private Position position;
    
    public Position getPosition() {
		return position;
	}

    public void setPosition(Position position) {
		this.position = position;
	}

    
  /*---------------------------------------*/

    
    
    

    public Integer getWayId() {
        return wayId;
    }

    public void setWayId(Integer wayId) {
        this.wayId = wayId;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo == null ? null : stuNo.trim();
    }

    public String getSchCode() {
        return schCode;
    }

    public void setSchCode(String schCode) {
        this.schCode = schCode == null ? null : schCode.trim();
    }

    public String getWayCompany() {
        return wayCompany;
    }

    public void setWayCompany(String wayCompany) {
        this.wayCompany = wayCompany == null ? null : wayCompany.trim();
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
    }

    public Double getWaySalary() {
        return waySalary;
    }

    public void setWaySalary(Double waySalary) {
        this.waySalary = waySalary;
    }

    public String getWayTime() {
        return wayTime;
    }

    public void setWayTime(String wayTime) {
        this.wayTime = wayTime == null ? null : wayTime.trim();
    }

    public String getWayAddrss() {
        return wayAddrss;
    }

    public void setWayAddrss(String wayAddrss) {
        this.wayAddrss = wayAddrss == null ? null : wayAddrss.trim();
    }

    public String getWayPhone() {
        return wayPhone;
    }

    public void setWayPhone(String wayPhone) {
        this.wayPhone = wayPhone == null ? null : wayPhone.trim();
    }

    public String getWayEvaluate() {
        return wayEvaluate;
    }

    public void setWayEvaluate(String wayEvaluate) {
        this.wayEvaluate = wayEvaluate == null ? null : wayEvaluate.trim();
    }

    public Date getWayCreateTime() {
        return wayCreateTime;
    }

    public void setWayCreateTime(Date wayCreateTime) {
        this.wayCreateTime = wayCreateTime;
    }

    public String getWayCreateBy() {
        return wayCreateBy;
    }

    public void setWayCreateBy(String wayCreateBy) {
        this.wayCreateBy = wayCreateBy == null ? null : wayCreateBy.trim();
    }

    public String getWayCompanor() {
        return wayCompanor;
    }

    public void setWayCompanor(String wayCompanor) {
        this.wayCompanor = wayCompanor == null ? null : wayCompanor.trim();
    }

    public Boolean getWayFlag() {
        return wayFlag;
    }

    public void setWayFlag(Boolean wayFlag) {
        this.wayFlag = wayFlag;
    }

	@Override
	public String toString() {
		return "Way [wayId=" + wayId + ", stuNo=" + stuNo + ", schCode=" + schCode + ", wayCompany=" + wayCompany
				+ ", poCode=" + poCode + ", waySalary=" + waySalary + ", wayTime=" + wayTime + ", wayAddrss="
				+ wayAddrss + ", wayPhone=" + wayPhone + ", wayEvaluate=" + wayEvaluate + ", wayCreateTime="
				+ wayCreateTime + ", wayCreateBy=" + wayCreateBy + ", wayCompanor=" + wayCompanor + ", wayFlag="
				+ wayFlag + ", position=" + position + "]";
	}
    
    
    
    
   
    
}