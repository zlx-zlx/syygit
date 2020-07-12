package com.softjx.test;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softjx.model.School;
import com.softjx.model.SchoolExample;
import com.softjx.service.SchoolService;

public class TestSchool {
	
	
	private static ApplicationContext context = null;
	private SchoolService schoolService = null;
	
	
	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		schoolService = (SchoolService) context.getBean("schoolService");
	}

	
	
	
	@Test
	public void TestAddSchool() {
		School school=new School();
		    school.setSchCode("0002");
			
			school.setSchName("南昌航空大学");
			school.setSchPass("123456");
			
			school.setSchCreateTime(new Date());
			school.setSchCreateBy("徐敏");
			school.setSchFlag(Boolean.valueOf("0"));
			
		
		int count=schoolService.addSchool(school);
		System.out.println(count);
		
		
		
		/*
		school.setCreateTime(new Date());
		
		school.setDeleteFlag(Boolean.valueOf("0"));
		*/
		
		
		
	}
	
	
	@Test
	public void TestAddSchoolMany() {
		
		for(int i=2;i<10;i++)
		{
			School school=new School();
		    school.setSchCode("0003");
			
			school.setSchName("井冈山大学");
			school.setSchPass("123456");
			
			school.setSchCreateTime(new Date());
			school.setSchCreateBy("徐敏");
			school.setSchFlag(Boolean.valueOf("0"));
			
		
		int count=schoolService.addSchool(school);
		System.out.println(count);
		}
		
	}
	
	
	
	
	@Test
	public void TestGetSchool() {
		School school=schoolService.getSchool(3);
		
		if (school!=null)
		{
			System.out.println(school.getSchName());
		}
	}
	
	
	
	
	@Test
	public void TestGetSchools() {
		SchoolExample schoolExample = null;
		List<School> schools = schoolService.getSchool(schoolExample);
		for (School school : schools)
			System.out.println(school.getSchId() + "   " + school.getSchCode()
					  + "  " + school.getSchName()+ "  " + school.getSchPass() + " "  + school.getSchCreateTime()+ " " + school.getSchCreateBy() + " " + school.getSchFlag()   );

	}	
	
	
	
	@Test
	public void TestGetSchools1() {
		
		SchoolExample schoolExample = new SchoolExample();
		SchoolExample.Criteria criteria = schoolExample.createCriteria();
		//criteria.andCorpCodeLike("%" + 2 + "%");		
		//criteria.andschFlagEqualTo(Boolean.TRUE);
		criteria.andSchFlagEqualTo(Boolean.FALSE);
		//criteria.andschNameLike("%" + "li" + "%");
		criteria.andSchNameLike("%" +"大"+ "%");
		criteria.andSchCodeEqualTo("0002");
		List<School> schools = schoolService.getSchool(schoolExample);
		for (School school : schools)
			System.out.println(school.getSchId() + "   " + school.getSchCode()
					  + "  " + school.getSchName()+ "  " + school.getSchPass() + " "  + school.getSchCreateTime()+ " " + school.getSchCreateBy() + " " + school.getSchFlag()   );

	}	
	
	
	
	
	
	
	
	
	
	@Test
	public void TestGetIdSchool() {
		School school=schoolService.getSchool(9);
		System.out.println(school.getSchName()+"  " + school.getSchId()+ "  " +  school.getSchCreateBy());
		//System.out.println(school.getschMajor());
	}
	
	
	
	@Test
	public void TeschpdateSchool() {
		   School school=new School();
		    school.setSchId(5);
		
		    school.setSchCode("0006");
			
			school.setSchName("井冈山11大学");
			school.setSchPass("123456");
			
			school.setSchCreateTime(new Date());
			school.setSchCreateBy("徐敏");
			school.setSchFlag(Boolean.valueOf("0"));
			
			schoolService.updateSchool(school);
		}
	

	
	
	
	@Test
	public void TestDeleteSchoolFlase() {		
			schoolService.deleteSchoolFalse(5);
	}
	
	
	
	
	
	
}
