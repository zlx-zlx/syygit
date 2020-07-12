package com.softjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softjx.dao.TeacherMapper;
import com.softjx.model.Teacher;
import com.softjx.model.TeacherExample;
import com.softjx.service.TeacherService;
@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService {

	
	@Autowired
	private TeacherMapper teacherMapper;
	
	
	@Transactional(readOnly=true)
	public List<Teacher> getTeacher(TeacherExample example) {
	     List<Teacher> teachers=teacherMapper.selectByExample(example);
		return teachers;
	}

	
	public int addTeacher(Teacher teacher) {
		int count=teacherMapper.insertSelective(teacher);
		return count;
	}
	
	
	
	
	@Transactional(readOnly=true)
	public Teacher getTeacher(Integer teaId) {		
		Teacher teacher=null;
		TeacherExample teacherExample=new TeacherExample();
		TeacherExample.Criteria criteria=teacherExample.createCriteria();
		criteria.andTeaIdEqualTo(teaId);
		List<Teacher>list=teacherMapper.selectByExample(teacherExample);
		if(list.size()>0){
			teacher=list.get(list.size()-1);
		}
	    return teacher;
	}
	
	
	public int updateTeacher(Teacher teacher) {
		TeacherExample teacherExample=new TeacherExample();
		TeacherExample.Criteria criteria=teacherExample.createCriteria();
		criteria.andTeaIdEqualTo(teacher.getTeaId());
		Teacher tea=teacherMapper.selectByExample(teacherExample).get(0);
		teacher.setTeaId(tea.getTeaId());
		Integer count=teacherMapper.updateByPrimaryKey(teacher);
		return count;
	}
	
	

	public int deleteTeacherFalse(Integer teaId) {
		int count =0;
		Teacher teacher=null;
		teacher=teacherMapper.selectByPrimaryKey(teaId);
		if(teacher !=null) {
			teacher.setTeaFlag(true);
		
		 count=teacherMapper.updateByPrimaryKey(teacher);
		}
		return count;
	
	}

	 
	
	
	
	//根据对象中不为空的多个属性进行条件查询
		public List<Teacher> selectvTeacherByIf(Teacher teacher){
			TeacherExample example=new TeacherExample();
			com.softjx.model.TeacherExample.Criteria criteria=example.createCriteria();
			if(teacher.getTeaId()!=null){
				criteria.andTeaIdEqualTo(teacher.getTeaId());
			}
			if(teacher.getSchCode()!=null){
				
				criteria.andSchCodeEqualTo(teacher.getSchCode());
				criteria.andTeaFlagEqualTo(false);
			}
			
			List<Teacher> teachers=teacherMapper.selectByExample(example);
			return teachers;
		}


}
