package com.softjx.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softjx.model.Admin;
import com.softjx.model.AdminExample;
import com.softjx.service.AdminService;

public class TestAdmin {
	
	
	private static ApplicationContext context = null;
	private AdminService adminService = null;
	
	
	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adminService = (AdminService) context.getBean("adminService");
	}

	
	
	
	@Test
	public void TestAddAdmin() {
		Admin admin=new Admin();
		
			admin.setAdName("zhao1");
			admin.setAdPass("123456");
		
		
		int count=adminService.addAdmin(admin);
		System.out.println(count);
		
		
		
		/*
		admin.setCreateTime(new Date());
		
		admin.setDeleteFlag(Boolean.valueOf("0"));
		*/
		
		
		
	}
	
	
	@Test
	public void TestAddAdminMany() {
		
		for(int i=2;i<10;i++)
		{
			Admin admin=new Admin();
			admin.setAdName("zhao2");
			admin.setAdPass("123456");
		
		
		 int count=adminService.addAdmin(admin);
		 System.out.println(count);
		
		
		
		}
		
	}
	
	
	
	
	@Test
	public void TestGetAdmin() {
		Admin admin=adminService.getAdmin(3);
		
		if (admin!=null)
		{
			System.out.println(admin.getAdPass());
		}
	}
	
	
	
	
	@Test
	public void TestGetAdmins() {
		AdminExample adminExample = null;
		List<Admin> admins = adminService.getAdmin(adminExample);
		for (Admin admin : admins)
			System.out.println(admin.getId() + "   " + admin.getAdName()
					  + "  " + admin.getAdPass()
					    );

	}	
	
	
	
	@Test
	public void TestGetAdmins1() {
		
		AdminExample adminExample = new AdminExample();
		AdminExample.Criteria criteria = adminExample.createCriteria();
		//criteria.andCorpCodeLike("%" + 2 + "%");		
		//criteria.andStuFlagEqualTo(Boolean.TRUE);
		
		//criteria.andStuNameLike("%" + "li" + "%");
		criteria.andAdNameLike("%" + 1 + "%");
		criteria.andAdPassEqualTo("123456");
		List<Admin> admins = adminService.getAdmin(adminExample);
		for (Admin admin : admins)
			System.out.println(admin.getId() + "   " + admin.getAdName()
					  + "  " + admin.getAdPass()
					    );

	}	
	
	
	
	
	
	@Test
	public void TestGetAdmins2() {
		
		AdminExample adminExample = new AdminExample();
		AdminExample.Criteria criteria = adminExample.createCriteria();
		//criteria.andSchCodeLike("%" + 1 + "%");
		//criteria.andStuIdLessThan(5);
		criteria.andIdGreaterThan(4);
		List<Admin> admins = adminService.getAdmin(adminExample);
		for (Admin admin : admins)
			System.out.println(admin.getId() + "   " + admin.getAdName()
					  + "  " + admin.getAdPass()
					    );

	}	
	
	
	
	
	
	@Test
	public void TestGetIdAdmin() {
		Admin admin=adminService.getAdmin(9);
		System.out.println(admin.getAdName()+"  " + admin.getAdPass());
		//System.out.println(student.getStuMajor());
	}
	
	
	
	@Test
	public void TestUpdateAdmin() {
		Admin admin=new Admin();
		admin.setId(4);
		admin.setAdName("zhao22");
		admin.setAdPass("123456");
	
	
		adminService.updateAdmin(admin);
		}
	

	
	
	
	@Test
	public void TestDeleteadmin() {		
		adminService.deleteAdmin(5);
	}
	
	
	
	
	
	
}
