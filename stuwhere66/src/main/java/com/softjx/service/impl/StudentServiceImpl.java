package com.softjx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softjx.dao.SchoolMapper;
import com.softjx.dao.StudentMapper;
import com.softjx.dao.StudentMapper2;
import com.softjx.model.School;
import com.softjx.model.Status;
import com.softjx.model.Student;
import com.softjx.model.Student2;
import com.softjx.model.StudentExample;
import com.softjx.model.StudentExample2;
import com.softjx.model.TeacherExample;
import com.softjx.service.StudentService;
import com.softjx.vo.StuVo;
import com.softjx.vo.StudentSchoolVo;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private StudentMapper2 studentMapper2;
	
	@Autowired
	private SchoolMapper  schoolMapper;
	
	
	@Transactional(readOnly=true)
	public List<Status> getStatus1(StudentExample example) {
	     List<Status> status=studentMapper2.getStatus();
		return status;
	}

	
	
	
	
	@Transactional(readOnly=true)
	public List<Status> getStatus() {
		List<Status> lists=studentMapper2.getStatus();
		return lists;
	}

	

	
	
	
	
	
	
	
	
	
	@Transactional(readOnly=true)
	public List<Student2> getStudent2(StudentExample2 example2) {
	     List<Student2> students=studentMapper2.selectByExample2(example2);
		return students;
	}

	
	@Transactional(readOnly=true)
	public List<Student> getStudent(StudentExample example) {
	     List<Student> students=studentMapper.selectByExample(example);
		return students;
	}

	
	public int addStudent(Student student) {
		int count=studentMapper.insertSelective(student);
		return count;
	}
	
	
	
	
	@Transactional(readOnly=true)
	public Student getStudent(Integer stuId) {		
		Student student=null;
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andStuIdEqualTo(stuId);
		List<Student>list=studentMapper.selectByExample(studentExample);
		if(list.size()>0){
			student=list.get(list.size()-1);
		}
	    return student;
	}
	
	
	public int updateStudent(Student student) {
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andStuIdEqualTo(student.getStuId());
		Student stu=studentMapper.selectByExample(studentExample).get(0);
		student.setStuId(stu.getStuId());
		Integer count=studentMapper.updateByPrimaryKey(student);
		return count;
	}
	
	

	public int deleteStudentFalse(Integer stuId) {
		int count =0;
		Student student=null;
		student=studentMapper.selectByPrimaryKey(stuId);
		if(student !=null) {
			student.setStuFlag(true);
		
		 count=studentMapper.updateByPrimaryKey(student);
		}
		return count;
	
	}

	
	public int deleteStudentFalse11(String schCode) {
		int count =0;
		Student student=null;
		student=studentMapper.selectByPrimaryKe(schCode);
		if(student !=null) {
			student.setStuFlag(true);
		
		 count=studentMapper.updateByPrimaryKey(student);
		}
		return count;
	
	}
	
	//根据对象中不为空的多个属性进行条件查询
	public List<Student> selectvStudentByIf(Student student) {
				StudentExample example=new StudentExample();
				com.softjx.model.StudentExample.Criteria criteria=example.createCriteria();
				if(student.getStuId()!=null){
					criteria.andStuIdEqualTo(student.getStuId());
				}
				if(student.getSchCode()!=null){
					
					criteria.andSchCodeEqualTo(student.getSchCode());
					criteria.andStuFlagEqualTo(false);
				}
				
				List<Student> students=studentMapper.selectByExample(example);
				return students;
			}



	

	@Transactional(readOnly=true)
	public List<Student> getStudentWithSchool(StudentExample studentExample) {
		List<Student> lists=studentMapper.selectByExampleWithSchool(studentExample);
		return lists;
	}

	
	
	
	
	
	
	
	
	@Transactional(readOnly=true)
	public List<StudentSchoolVo> getStudentSchoolSqlVo() {
		List<StudentSchoolVo> lists=studentMapper.getStudentSchoolSqlVo();
		return lists;
	}

	@Transactional(readOnly=true)
	public List<StudentSchoolVo> getStudentSchoolVo(StudentExample example)
	{
		
		List<StudentSchoolVo> list=new ArrayList<StudentSchoolVo>();
		
		List<Student>  listStudents=  getStudent(example);
		 
		for(Student student:listStudents)
		{
			StudentSchoolVo studentSchoolVo=new StudentSchoolVo();
			
			studentSchoolVo.setId(student.getStuId());
			studentSchoolVo.setStNo(student.getStuNo());
			studentSchoolVo.setStName(student.getStuName());
		
			
			School school=schoolMapper.selectByPrimaryKey(student.getStuId());
			studentSchoolVo.setSchoolName(school.getSchName());
			
			
			
			list.add(studentSchoolVo);
		}
		
		return list;
	}


	

		
		
		
		
		




	@Override
	@Transactional(readOnly=true)
	public List<Student> getStudentByCourseId(String schCode) {
		StudentExample example=new StudentExample();
		com.softjx.model.StudentExample.Criteria criteria=example.createCriteria();
		criteria.andSchCodeEqualTo(schCode);
		criteria.andStuFlagNotEqualTo(true);
		List<Student> students=studentMapper.selectByExample(example);
		return students;
	}





	





	@Transactional(readOnly=true)
	public List<StuVo> getStuVo(StudentExample example) {
		List<StuVo> lists=studentMapper2.getStuVo(example);
		return lists;
	}





	@Override
	public List<Status> getStatus(StudentExample example) {
		
		List<Status> lists=studentMapper2.getStatus();
		return lists;
	}

	
	
	
	
	
	@Override
	public List<Status> getSta(TeacherExample example) {
		TeacherExample example1=new TeacherExample();
		com.softjx.model.TeacherExample.Criteria criteria=example1.createCriteria();
		
		List<Status> lists=studentMapper2.getSta(example1);
		return lists;
	}

	
	
		
		
		
	
	
	

   
	@Override
	@Transactional(readOnly=true)
	public List<StuVo> selectBy(String teaCode) {
		
		TeacherExample example=new TeacherExample();
		com.softjx.model.TeacherExample.Criteria criteria=example.createCriteria();
		/*StudentExample example=new StudentExample();
		com.softjx.model.StudentExample.Criteria criteria=example.createCriteria();*/
		criteria.andTeaCodeEqualTo(teaCode);
		
		List<StuVo> lists=studentMapper2.selectBy(teaCode);
		return lists;



	
	}





	
	
	
	@Transactional(readOnly=true)
	public List<StuVo> getVo(StudentExample example)
	{
		
		List<StuVo> list=new ArrayList<StuVo>();
		
		List<Student>  listStudents=  getStudent(example);
		 
		for(Student student:listStudents)
		{
			StuVo stuVo=new StuVo();
			
			stuVo.setStuStatus(student.getStuStatus());
			
			stuVo.setCount(null);
			
		
			
			
			list.add(stuVo);
		}
		
		return list;
	}

	
	
}
