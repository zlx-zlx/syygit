package com.softjx.test;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softjx.dao.SchoolMapper;
import com.softjx.model.SchoolExample;
import com.softjx.model.Status;
import com.softjx.model.Student;
import com.softjx.model.StudentExample;
import com.softjx.model.Teacher;
import com.softjx.model.TeacherExample;
import com.softjx.model.StudentExample.Criteria;
import com.softjx.service.StudentService;
import com.softjx.vo.StuVo;
import com.softjx.vo.StudentSchoolVo;

public class TestStudent {
	
	
	private static ApplicationContext context = null;
	private StudentService studentService = null;
	
	
	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		studentService = (StudentService) context.getBean("studentService");
	}

	
	
	
	
	
	@Test
	public void TestGetStudent22() {
		
		 StudentExample studentExample = new StudentExample();
		 Criteria criteria = studentExample.createCriteria();
			criteria.andSchCodeEqualTo("0001");		
		
			criteria.andStuFlagEqualTo(Boolean.FALSE);
		List<Status> status1=studentService.getStatus1(studentExample);
		
		System.out.println(status1);
	}
	
	
	
	
	@Test
	public void TestGetstatus()
	{
		
		 StudentExample studentExample = new StudentExample();
			
		
		
		List<Status> lists=studentService.getStatus(studentExample);
		//System.out.println(lists.size());
		
		System.out.println(lists);
		/*for(StudentSchoolAreaVo student:lists)
		{
			System.out.println(student.getAreaName());
			System.out.println(student.getSchoolName());
			System.out.println("********");
		}*/
	}
	
	
	
	
	@Test
	public void TestAddStudent() {
		Student student=new Student();
		
			student.setStuNo("10004");
			student.setStuPass("123456");
			student.setStuName("lisi11");
			student.setSchCode("0001");
			student.setStuSex("男");
			student.setStuBirth("2019年六月");
			student.setStuPhone("15399996666");
			student.setStuStatus("已就业");
			student.setStuYear(2016);
			student.setStuEducation("本科");
			student.setStuClass("1682073");
			student.setStuMajor("软件工程");
			student.setStuAddress("江西南昌");
			student.setStuCreateTime(new Date());
			student.setStuCreateBy("李四");
			student.setStuFlag(Boolean.valueOf("0"));
			
		
		int count=studentService.addStudent(student);
		System.out.println(count);
		
		
		
		/*
		student.setCreateTime(new Date());
		
		student.setDeleteFlag(Boolean.valueOf("0"));
		*/
		
		
		
	}
	
	
	@Test
	public void TestAddStudentMany() {
		
		for(int i=2;i<10;i++)
		{
		Student student=new Student();
		student.setStuNo("1001");
		student.setStuPass("123456");
		student.setStuName("lisi");
		student.setSchCode("0001");
		student.setStuSex("男");
		student.setStuBirth("2019年六月");
		student.setStuPhone("15399996666");
		student.setStuStatus("已就业");
		student.setStuYear(2016);
		student.setStuEducation("本科");
		student.setStuClass("1682073");
		student.setStuMajor("软件工程");
		student.setStuAddress("江西南昌");
		student.setStuCreateTime(new Date());
		student.setStuCreateBy("李四");
		student.setStuFlag(Boolean.valueOf("0"));
		
		int count=studentService.addStudent(student);
		System.out.println(count);
		}
		
	}
	
	
	
	
	@Test
	public void TestGetStudent() {
		Student student=studentService.getStudent(3);
		
		if (student!=null)
		{
			System.out.println(student.getStuAddress());
		}
	}
	
	
	
	
	@Test
	public void TestGetStudent2() {
		
		
		
		StudentExample studentExample = new StudentExample();
		Criteria criteria = studentExample.createCriteria();
		//criteria.andCorpCodeLike("%" + 2 + "%");		
		//criteria.andStuFlagEqualTo(Boolean.TRUE);
		criteria.andStuFlagEqualTo(Boolean.FALSE);
		//criteria.andStuNameLike("%" + "li" + "%");
		//criteria.andStuNameLike("%" + 11 + "%");
		criteria.andSchCodeEqualTo("0006");
		List<Status> students = studentService.getStatus1(studentExample);
		System.out.println(students);
	}
	
	
	
	
	
	
	@Test
	public void TestGetStudents() {
		StudentExample studentExample = null;
		List<Student> students = studentService.getStudent(studentExample);
		for (Student student : students)
			System.out.println(student.getStuId() + "   " + student.getStuNo()
					  + "  " + student.getStuPass()+ "  " + student.getStuName() + " " + student.getSchCode()
					  + "  " + student.getStuSex() + " " + student.getStuBirth() + " " + student.getStuPhone()
					  + "  " + student.getStuStatus() + " " + student.getStuYear() + " " + student.getStuEducation()
					  + "  " + student.getStuClass()+ " " + student.getStuMajor() + " " + student.getStuAddress()
					  + "  " + student.getStuCreateTime()+ " " + student.getStuCreateBy() + " " + student.getStuFlag()   );

	}	
	
	
	
	@Test
	public void TestGetStudents1() {
		
		StudentExample studentExample = new StudentExample();
		Criteria criteria = studentExample.createCriteria();
		//criteria.andCorpCodeLike("%" + 2 + "%");		
		//criteria.andStuFlagEqualTo(Boolean.TRUE);
		criteria.andStuFlagEqualTo(Boolean.FALSE);
		//criteria.andStuNameLike("%" + "li" + "%");
		//criteria.andStuNameLike("%" + 11 + "%");
		criteria.andStuNoEqualTo("10001");
		List<Student> students = studentService.getStudent(studentExample);
		for (Student student : students)
			System.out.println(student.getStuId() + "   " + student.getStuNo()
			  + "  " + student.getStuPass()+ "  " + student.getStuName() + " " + student.getSchCode()
			  + "  " + student.getStuSex() + " " + student.getStuBirth() + " " + student.getStuPhone()
			  + "  " + student.getStuStatus() + " " + student.getStuYear() + " " + student.getStuEducation()
			  + "  " + student.getStuClass()+ " " + student.getStuMajor() + " " + student.getStuAddress()
			  + "  " + student.getStuCreateTime()+ " " + student.getStuCreateBy() + " " + student.getStuFlag()   );

	}	
	
	
	
	
	@Test
	public void TestGetStudents2() {
		
		StudentExample studentExample = new StudentExample();
		Criteria criteria = studentExample.createCriteria();
		//criteria.andSchCodeLike("%" + 1 + "%");
		//criteria.andStuIdLessThan(5);
		criteria.andStuYearGreaterThan(2012);
		List<Student> students = studentService.getStudent(studentExample);
		for (Student student : students)
			System.out.println(student.getStuId() + "   " + student.getStuNo()
			  + "  " + student.getStuPass()+ "  " + student.getStuName() + " " + student.getSchCode()
			  + "  " + student.getStuSex() + " " + student.getStuBirth() + " " + student.getStuPhone()
			  + "  " + student.getStuStatus() + " " + student.getStuYear() + " " + student.getStuEducation()
			  + "  " + student.getStuClass()+ " " + student.getStuMajor() + " " + student.getStuAddress()
			  + "  " + student.getStuCreateTime()+ " " + student.getStuCreateBy() + " " + student.getStuFlag()   );

	}	
	
	
	
	
	@Test
	public void TestGetIdStudent() {
		Student student=studentService.getStudent(9);
		System.out.println(student.getStuName()+"  " + student.getStuMajor()+ "  " +  student.getStuClass());
		//System.out.println(student.getStuMajor());
	}
	
	
	
	@Test
	public void TestUpdateStudent() {
		   Student student=new Student();
		    student.setStuId(1);
		    student.setStuNo("1001");
			student.setStuPass("123456");
			student.setStuName("lisi22");
			student.setSchCode("0002");
			student.setStuSex("男");
			student.setStuBirth("2019年六月");
			student.setStuPhone("15399496666");
			student.setStuStatus("未就业");
			student.setStuYear(2016);
			student.setStuEducation("专科");
			student.setStuClass("1682072");
			student.setStuMajor("土木工程");
			student.setStuAddress("江西九江");
			student.setStuCreateTime(new Date());
			student.setStuCreateBy("王二");
			student.setStuFlag(Boolean.valueOf("0"));
			studentService.updateStudent(student);
		}
	

	
	
	
	@Test
	public void TestDeleteStudentFlase() {		
			studentService.deleteStudentFalse(5);
	}
	
	
	
	@Test
	public void TestGetStudentWithSchool()
	{
		
		StudentExample studentExample = new StudentExample();
		
		Criteria criteria = studentExample.createCriteria();
		//criteria.andTNameEqualTo("%" + "wu40"+ "%");//多个表使用不同自定义		
		
		
     	//criteria.andTAgeGreaterThan(Byte.valueOf("21"));
     	
     	criteria.andStuIdEqualTo(12);
		
		List<Student> lists=studentService.getStudentWithSchool(studentExample);
		System.out.println(lists.size());
		for(Student student:lists)
		{
			System.out.println(student.getStuName());
			System.out.println(student.getSchool().getSchName());
			System.out.println("********");
		}
		
	}
	
	
	
	
	
	@Test
	public void testGet2() {
		List<Student> students = studentService.getStudentByCourseId("0001");
		for (Student student : students) {
			System.out.println(student.getStuNo());
		}
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void TestGetStudentSchoolAreaSqlVo()
	{
		
		 StudentExample studentExample = new StudentExample();
		 
		 
		List<StudentSchoolVo> lists=studentService.getStudentSchoolSqlVo();
		//System.out.println(lists.size());
		
		System.out.println(lists);
		/*for(StudentSchoolAreaVo student:lists)
		{
			System.out.println(student.getAreaName());
			System.out.println(student.getSchoolName());
			System.out.println("********");
		}*/
	}
	
	
	
	@Test
	public void testGet22() {
		List<StuVo> students = studentService.selectBy("20002");
		System.out.println(students);
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void TestGetStulVo()
	{
     TeacherExample teacherExample = new TeacherExample();
		
		//List<StuVo> lists=studentService.getStuVo();
		
		//StudentExample studentExample = new StudentExample();
		
		//com.softjx.model.StudentExample.Criteria criteria = studentExample.createCriteria();
		

	com.softjx.model.TeacherExample.Criteria criteria = teacherExample.createCriteria();
		
     	criteria.andTeaCodeEqualTo("20002");
		
		TeacherExample teaCode = null;
		List<Status> stuVos = studentService.getSta(teaCode);
		System.out.println(stuVos);
		
		
		 //StudentExample studentExample = new StudentExample();
			
		//TeacherExample teacherExample = new TeacherExample();
		
		//List<StuVo> lists=studentService.getStuVo();
		//System.out.println(lists.size());

		/*com.softjx.model.TeacherExample.Criteria criteria = teacherExample.createCriteria();
		
     	criteria.andTeaCodeEqualTo("20002");
     	List<StuVo> lists=studentService.getStuVo();
		System.out.println(lists);*/
		
	}

	
	
	
	
	
	
	
	
	@Test
	public void TestGetStudentSchoolSqlVo1()
	{
		
        StudentExample studentExample = new StudentExample();
        
		//com.softjx.model.SchoolExample.Criteria criteria = schoolExample.createCriteria();
        
        com.softjx.model.StudentExample.Criteria criteria = studentExample.createCriteria();
		
		/*criteria.andTNameLike("%" + 8 + "%");
		
     	criteria.andTAgeGreaterThan(Byte.valueOf("21"));*/
     	
     	//criteria.andStuIdEqualTo(6);
     	criteria.andStuNoEqualTo("1003");
		
		List<StudentSchoolVo> lists=studentService.getStudentSchoolVo(studentExample);
		System.out.println(lists);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void TestGetStuVo()
	{
		
        StudentExample studentExample = new StudentExample();
        
		//com.softjx.model.SchoolExample.Criteria criteria = schoolExample.createCriteria();
        
        com.softjx.model.StudentExample.Criteria criteria = studentExample.createCriteria();
		
		/*criteria.andTNameLike("%" + 8 + "%");
		
     	criteria.andTAgeGreaterThan(Byte.valueOf("21"));*/
     	
     	//criteria.andStuIdEqualTo(6);
     	criteria.andSchCodeEqualTo("0006");
		
		List<StuVo> lists=studentService.getStuVo(studentExample);
		System.out.println(lists);
	}
	
	
	
	
	
	
	/*@Test
	public void TestGetStu1()
	{
		
        StudentExample studentExample = new StudentExample();
		
		Criteria criteria = studentExample.createCriteria();
		criteria.andTNameLike("%" + 8 + "%");
		
     	criteria.andTAgeGreaterThan(Byte.valueOf("21"));
     	
     	criteria.andStuIdEqualTo(6);
		
		
		List<StuVo> lists=studentService.getStudentSchoolVo(studentExample);
		System.out.println(lists);
	}*/
	
	
}
