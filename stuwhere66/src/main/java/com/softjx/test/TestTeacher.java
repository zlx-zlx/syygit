package com.softjx.test;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softjx.model.Teacher;
import com.softjx.model.TeacherExample;
import com.softjx.service.StudentService;
import com.softjx.service.TeacherService;
import com.softjx.service.WayService;

public class TestTeacher {
	
	
		
		
		private static ApplicationContext context = null;
		private TeacherService teacherService = null;
		private StudentService studentService = null;
		private WayService wayService = null;
		@Before
		public void init() throws Exception {
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			teacherService = (TeacherService) context.getBean("teacherService");
		}

		
		
		
		
		
		
		
		
		@Test
		public void TestAddTeacher() {
			Teacher teacher=new Teacher();
			
			    teacher.setTeaCode("20001");
			    teacher.setTeaName("zou1");
				teacher.setSchCode("0001");
				teacher.setTeaPass("123456");
				teacher.setTeaSex("男");
				teacher.setTeaAge(40);
				teacher.setTeaCreateTime(new Date());
				teacher.setTeaCreateBy("李四");
				teacher.setTeaFlag(Boolean.valueOf("0"));
				
			
			int count=teacherService.addTeacher(teacher);
			System.out.println(count);
			
			
			
			/*
			teacher.setCreateTime(new Date());
			
			teacher.setDeleteFlag(Boolean.valueOf("0"));
			*/
			
			
			
		}
		
		
		@Test
		public void TestAddTeacherMany() {
			
			for(int i=2;i<10;i++)
			{
			Teacher teacher=new Teacher();
			 teacher.setTeaCode("20002");
			    teacher.setTeaName("zou2");
				teacher.setSchCode("0001");
				teacher.setTeaPass("123456");
				teacher.setTeaSex("男");
				teacher.setTeaAge(40);
				teacher.setTeaCreateTime(new Date());
				teacher.setTeaCreateBy("李四");
				teacher.setTeaFlag(Boolean.valueOf("0"));
				
				int count=teacherService.addTeacher(teacher);
			System.out.println(count);
			}
			
		}
		
		
		
		
		@Test
		public void TestGetTeacher() {
			Teacher teacher=teacherService.getTeacher(3);
			
			if (teacher!=null)
			{
				System.out.println(teacher.getTeaPass());
			}
		}
		
		
		
		
		@Test
		public void TestGetTeachers() {
			TeacherExample teacherExample = null;
			List<Teacher> teachers = teacherService.getTeacher(teacherExample);
			for (Teacher teacher : teachers)
				System.out.println(teacher.getTeaId() + "   " + teacher.getTeaCode()
						  + "  " + teacher.getTeaName() + " " + teacher.getSchCode()
						  + "  " + teacher.getTeaPass() + " " + teacher.getTeaSex() + " " + teacher.getTeaAge()
						  + "  " + teacher.getTeaCreateTime()+ " " + teacher.getTeaCreateBy() + " " + teacher.getTeaFlag()   );

		}	
		
		
		
		@Test
		public void TestGetTeachers1() {
			
			TeacherExample teacherExample = new TeacherExample();
			TeacherExample.Criteria criteria =teacherExample.createCriteria();
			//criteria.andCorpCodeLike("%" + 2 + "%");		
			//criteria.andStuFlagEqualTo(Boolean.TRUE);
			criteria.andTeaFlagEqualTo(Boolean.FALSE);
			//criteria.andStuNameLike("%" + "li" + "%");
			criteria.andTeaNameLike("%" + 1 + "%");
			criteria.andTeaCodeEqualTo("20001");
			List<Teacher> teachers = teacherService.getTeacher(teacherExample);
			for (Teacher teacher : teachers)
				System.out.println(teacher.getTeaId() + "   " + teacher.getTeaCode()
						  + "  " + teacher.getTeaName() + " " + teacher.getSchCode()
						  + "  " + teacher.getTeaPass() + " " + teacher.getTeaSex() + " " + teacher.getTeaAge()
						  + "  " + teacher.getTeaCreateTime()+ " " + teacher.getTeaCreateBy() + " " + teacher.getTeaFlag()   );

		}	
		
		
		
		
		@Test
		public void TestGetTeachers2() {
			
			TeacherExample teacherExample = new TeacherExample();
			TeacherExample.Criteria criteria = teacherExample.createCriteria();
			//criteria.andSchCodeLike("%" + 1 + "%");
			//criteria.andStuIdLessThan(5);
			criteria.andTeaAgeGreaterThan(35);
			List<Teacher> teachers = teacherService.getTeacher(teacherExample);
			for (Teacher teacher : teachers)
				System.out.println(teacher.getTeaId() + "   " + teacher.getTeaCode()
						  + "  " + teacher.getTeaName() + " " + teacher.getSchCode()
						  + "  " + teacher.getTeaPass() + " " + teacher.getTeaSex() + " " + teacher.getTeaAge()
						  + "  " + teacher.getTeaCreateTime()+ " " + teacher.getTeaCreateBy() + " " + teacher.getTeaFlag()   );

		}	
		
		
		
		
		@Test
		public void TestGetIdTeachers() {
			Teacher teacher=teacherService.getTeacher(9);
			System.out.println(teacher.getTeaName()+"  " + teacher.getTeaSex());
			//System.out.println(teacher.getStuMajor());
		}
		
		
		
		@Test
		public void TestUpdateTeacher() {
			Teacher teacher=new Teacher();
			    teacher.setTeaId(5);
			    teacher.setTeaCode("20002");
			    teacher.setTeaName("zou4");
				teacher.setSchCode("0001");
				teacher.setTeaPass("123456");
				teacher.setTeaSex("男");
				teacher.setTeaAge(40);
				teacher.setTeaCreateTime(new Date());
				teacher.setTeaCreateBy("李四22");
				teacher.setTeaFlag(Boolean.valueOf("0"));
				
				
				teacherService.updateTeacher(teacher);
			}
		

		
		
		
		@Test
		public void TestDeleteTeachertFlase() {		
			teacherService.deleteTeacherFalse(5);
		}
		
		

}
