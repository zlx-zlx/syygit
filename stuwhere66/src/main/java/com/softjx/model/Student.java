package com.softjx.model;

import java.util.Date;

public class Student {
    private Integer stuId;

    private String stuNo;

    private String stuPass;

    private String stuName;

    private String schCode;

    private String stuSex;

    private String stuBirth;

    private String stuPhone;

    private String stuStatus;

    private Integer stuYear;

    private String stuEducation;

    private String stuClass;

    private String stuMajor;

    private String stuAddress;

    private Date stuCreateTime;

    private String stuCreateBy;

    private Boolean stuFlag;
    
    
    
    
    //关联字段
      private School school;
      
      public School getSchool() {
  		return school;
  	}

      public void setSchool(School school) {
  		this.school = school;
  	}

      
    /*---------------------------------------*/

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo == null ? null : stuNo.trim();
    }

    public String getStuPass() {
        return stuPass;
    }

    public void setStuPass(String stuPass) {
        this.stuPass = stuPass == null ? null : stuPass.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getSchCode() {
        return schCode;
    }

    public void setSchCode(String schCode) {
        this.schCode = schCode == null ? null : schCode.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuBirth() {
        return stuBirth;
    }

    public void setStuBirth(String stuBirth) {
        this.stuBirth = stuBirth == null ? null : stuBirth.trim();
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus == null ? null : stuStatus.trim();
    }

    public Integer getStuYear() {
        return stuYear;
    }

    public void setStuYear(Integer stuYear) {
        this.stuYear = stuYear;
    }

    public String getStuEducation() {
        return stuEducation;
    }

    public void setStuEducation(String stuEducation) {
        this.stuEducation = stuEducation == null ? null : stuEducation.trim();
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass == null ? null : stuClass.trim();
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor == null ? null : stuMajor.trim();
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress == null ? null : stuAddress.trim();
    }

    public Date getStuCreateTime() {
        return stuCreateTime;
    }

    public void setStuCreateTime(Date stuCreateTime) {
        this.stuCreateTime = stuCreateTime;
    }

    public String getStuCreateBy() {
        return stuCreateBy;
    }

    public void setStuCreateBy(String stuCreateBy) {
        this.stuCreateBy = stuCreateBy == null ? null : stuCreateBy.trim();
    }

    public Boolean getStuFlag() {
        return stuFlag;
    }

    public void setStuFlag(Boolean stuFlag) {
        this.stuFlag = stuFlag;
        
     
    }
    
    
    
  //多表  
    
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuNo=" + stuNo + ", stuPass=" + stuPass + ", stuName=" + stuName
				+ ", schCode=" + schCode + ", stuSex=" + stuSex + ", stuBirth=" + stuBirth + ", stuPhone=" + stuPhone
				+ ", stuStatus=" + stuStatus + ", stuYear=" + stuYear + ", stuEducation=" + stuEducation + ", stuClass="
				+ stuClass + ", stuMajor=" + stuMajor + ", stuAddress=" + stuAddress + ", stuCreateTime="
				+ stuCreateTime + ", stuCreateBy=" + stuCreateBy + ", stuFlag=" + stuFlag + ", school=" + school + "]";
	}
    
    
    
    
    
}