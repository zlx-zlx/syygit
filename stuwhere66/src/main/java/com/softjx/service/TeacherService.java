package com.softjx.service;

import java.util.List;

import com.softjx.model.Teacher;
import com.softjx.model.TeacherExample;

public interface TeacherService {
	

	// 条件查询所有老师,TeacherExample条件类
	public List<Teacher> getTeacher(TeacherExample example);

	// 添加老师
	public int addTeacher(Teacher teacher);

	// 根据id查询老师
	public Teacher getTeacher(Integer teaId);

	// 修改老师
	public int updateTeacher(Teacher teacher);

	// 删除老师,存在
	public int deleteTeacherFalse(Integer teaId);

	//根据对象中不为空的多个属性进行条件查询
		public List<Teacher> selectvTeacherByIf(Teacher teacher);

}
