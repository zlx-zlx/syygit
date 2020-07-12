package com.softjx.vo;

public class StuVo {

	
	
	private String stuStatus;
	private Integer count;
	public String getStuStatus() {
		return stuStatus;
	}
	public void setStuStatus(String stuStatus) {
		this.stuStatus = stuStatus;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "StuVo [stuStatus=" + stuStatus + ", count=" + count + "]";
	}
	
	
	
	
	
}


