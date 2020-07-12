package com.softjx.vo;

import java.util.Date;

public class StudentSchoolAreaVo {

	
	private Long id;
	private String name;
	private Integer age;
	private Date enterDate;
	
	private String schoolName;
	
	
	private String areaName;
	
	
	@Override
	public String toString() {
		return "StudentSchoolAreaVo [id=" + id + ", name=" + name + ", age=" + age + ", enterDate=" + enterDate
				+ ", schoolName=" + schoolName + ", areaName=" + areaName + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	
}


