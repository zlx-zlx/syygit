package com.softjx.service;

import java.util.List;

import com.softjx.model.School;
import com.softjx.model.SchoolExample;

public interface SchoolService {
	
	
	    //// 条件查询所有学校,TeacherExample条件类
		public List<School> getSchool(SchoolExample example);

		// 添加学校
		public int addSchool(School school);

		// 根据id查询学校
		public School getSchool(Integer schId);

		// 修改学校
		public int updateSchool(School school);

		// 删除学校,存在
		public int deleteSchoolFalse(Integer schId);

		//根据对象中不为空的多个属性进行条件查询
		public List<School> selectSchoolByIf(School school);
		
		
		
		
		//public List<Student> selectSchool(int schCode);
		
		//根据名字查找学校号
				public School selectSchoolByName(String name);
				

}
