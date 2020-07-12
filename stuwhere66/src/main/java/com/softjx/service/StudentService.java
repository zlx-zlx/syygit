package com.softjx.service;

import java.util.List;

import com.softjx.model.Status;
import com.softjx.model.Student;
import com.softjx.model.Student2;
import com.softjx.model.StudentExample;
import com.softjx.model.StudentExample2;
import com.softjx.model.TeacherExample;
import com.softjx.vo.StuVo;
import com.softjx.vo.StudentSchoolVo;

public interface StudentService {
	
	// 条件查询所有学生,TeacherExample条件类
			public List<Student2> getStudent2(StudentExample2 example2);
		// 条件查询所有学生,TeacherExample条件类
		public List<Student> getStudent(StudentExample example);

		// 添加学生
		public int addStudent(Student student);

		// 根据id查询学生
		public Student getStudent(Integer stuId);

		// 修改学生
		public int updateStudent(Student student);

		//删除学生,存在
		public int deleteStudentFalse(Integer stuId);

		//根据对象中不为空的多个属性进行条件查询
			public List<Student> selectvStudentByIf(Student student);

		
		//自定义
				//多表查询，连接查询，表多时，性能低
				 public List<Student> getStudentWithSchool(StudentExample studentExample);
				
				

				

				 //多表查询,自定义的vo，连接查询，表多时，性能低
				 public  List<StudentSchoolVo> getStudentSchoolSqlVo();
				    
				    
				 //多表查询,自定义的vo ,单表查询,表多时，性能高
				 public List<StudentSchoolVo> getStudentSchoolVo(StudentExample example);
				 
		
				//删除学生,存在
					public int deleteStudentFalse11(String schCode);

				 
				 /**
					 * 查询一个课程的所有章节
					 * 
					 * @param courseId
					 * @return
					 */
					List<Student> getStudentByCourseId(String schCode);

					
					//多表查询,自定义的vo，连接查询，表多时，性能低
					 public  List<StuVo> getStuVo(StudentExample example);
					    
					public List<Status> getStatus(StudentExample example);	
					List<StuVo> selectBy(String teaCode);
					public List<Status> getStatus1(StudentExample example);	
					
					public List<Status> getSta(TeacherExample example);
					
					//多表查询,自定义的vo ,单表查询,表多时，性能高
					 public List<StuVo> getVo(StudentExample example);
					 
}






