package com.softjx.vo;

import java.util.Date;

public class StudentSchoolVo {

	
	private Integer id;
	private String stNo;
	private String stName;
	
	private String schoolName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStNo() {
		return stNo;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "StudentSchoolVo [id=" + id + ", stNo=" + stNo + ", stName=" + stName + ", schoolName=" + schoolName
				+ "]";
	}
	
	
	
}


