package com.softjx.model;

public class Status {
    

	
		public String stuStatus;
		public Integer count;
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
			return "Status [stuStatus=" + stuStatus + ", count=" + count + "]";
		}
		
}