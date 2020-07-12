package com.softjx.test;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softjx.model.Way;
import com.softjx.model.WayExample;
import com.softjx.model.WayExample.Criteria;
import com.softjx.service.WayService;

public class TestWay {
	
	
	private static ApplicationContext context = null;
	private WayService wayService = null;
	
	
	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		wayService = (WayService) context.getBean("wayService");
	}

	
	
	
	@Test
	public void TestAddWay() {
		Way way=new Way();
		
			way.setStuNo("1001");
			way.setWayCompany("深圳腾讯科技有限公司");
			way.setPoCode("300011");
			way.setWaySalary(3800.0);
			way.setWayTime("2019年八月底");
			way.setWayAddrss("深圳市");
			way.setWayPhone("15299996666");
			way.setWayEvaluate("满意");
			
			way.setWayCompanor("莉莉");
			way.setWayCreateTime(new Date());
			way.setWayCreateBy("李四");
			way.setWayFlag(Boolean.valueOf("0"));
			
		
		int count=wayService.addWay(way);
		System.out.println(count);
		
		
		
		/*
		way.setCreateTime(new Date());
		
		way.setDeleteFlag(Boolean.valueOf("0"));
		*/
		
		
		
	}
	
	
	@Test
	public void TestAddWayMany() {
		
		for(int i=2;i<10;i++)
		{
			Way way=new Way();
			
			way.setStuNo("10011");
			way.setWayCompany("深圳腾讯科技有限公司11");
			way.setPoCode("300011");
			way.setWaySalary(3800.0);
			way.setWayTime("2019年八月底");
			way.setWayAddrss("深圳市");
			way.setWayPhone("15299996666");
			way.setWayEvaluate("满意");
			
			way.setWayCompanor("莉莉");
			way.setWayCreateTime(new Date());
			way.setWayCreateBy("李四");
			way.setWayFlag(Boolean.valueOf("0"));
			
		
		int count=wayService.addWay(way);
		System.out.println(count);
		}
		
	}
	
	
	
	
	@Test
	public void TestGetWay() {
		Way way=wayService.getWay(3);
		
		if (way!=null)
		{
			System.out.println(way.getWayAddrss());
		}
	}
	
	
	
	
	@Test
	public void TestGetWays() {
		WayExample wayExample = null;
		List<Way> ways = wayService.getWay(wayExample);
		for (Way way : ways)
			System.out.println(way.getWayId() + "   " + way.getStuNo()
					  + "  " + way.getWayCompany()+ "  " + way.getPoCode() + " " + way.getWaySalary()
					  + "  " + way.getWayTime() + " " + way.getWayAddrss() + " " + way.getWayPhone()
					  + "  " + way.getWayEvaluate() +"  " + way.getWayCreateTime()
					  + " " + way.getWayCreateBy() + " " +way.getWayCompanor() + " " +  way.getWayFlag()   );

	}	
	
	
	
	@Test
	public void TestGetWays1() {
		
		WayExample wayExample = new WayExample();
		Criteria criteria = wayExample.createCriteria();
		//criteria.andCorpCodeLike("%" + 2 + "%");		
		//criteria.andStuFlagEqualTo(Boolean.TRUE);
		criteria.andWayFlagEqualTo(Boolean.FALSE);
		//criteria.andStuNameLike("%" + "li" + "%");
		criteria.andStuNoLike("%" + 1 + "%");
		criteria.andStuNoEqualTo("10011");
		List<Way> ways = wayService.getWay(wayExample);
		for (Way way : ways)
			System.out.println(way.getWayId() + "   " + way.getStuNo()
					  + "  " + way.getWayCompany()+ "  " + way.getPoCode() + " " + way.getWaySalary()
					  + "  " + way.getWayTime() + " " + way.getWayAddrss() + " " + way.getWayPhone()
					  + "  " + way.getWayEvaluate() +"  " + way.getWayCreateTime()
					  + " " + way.getWayCreateBy() + " " +way.getWayCompanor() + " " +  way.getWayFlag()   );

	}	
	
	
	
	
	
	@Test
	public void TestGetIdway() {
		Way way=wayService.getWay(9);
		System.out.println(way.getWayPhone()+"  " + way.getWaySalary()+ "  " +  way.getWayAddrss());
		//System.out.println(way.getStuMajor());
	}
	
	
	
	@Test
	public void TestUpdateWay() {
		   Way way=new Way();
		    way.setWayId(5);

			
			way.setStuNo("10011");
			way.setWayCompany("广东海尔科技有限公司11");
			way.setPoCode("300011");
			way.setWaySalary(3800.0);
			way.setWayTime("2019年八月底");
			way.setWayAddrss("深圳市");
			way.setWayPhone("15299996666");
			way.setWayEvaluate("满意");
			
			way.setWayCompanor("莉莉");
			way.setWayCreateTime(new Date());
			way.setWayCreateBy("李四");
			way.setWayFlag(Boolean.valueOf("0"));
			wayService.updateWay(way);
		}
	

	
	
	
	@Test
	public void TestDeleteWayFlase() {		
			wayService.deleteWayFalse(5);
	}
	
	
	
	
	
	
	@Test
	public void TestGetStudentWithPo()
	{
		
		WayExample wayExample = new 	WayExample();
		
		Criteria criteria = wayExample.createCriteria();
		//criteria.andTNameEqualTo("%" + "wu40"+ "%");//多个表使用不同自定义		
		
		
     	//criteria.andTAgeGreaterThan(Byte.valueOf("21"));
     	
     	criteria.andWayIdEqualTo(4);
		
		List<Way> lists=wayService.getWayWithPo(wayExample);
		System.out.println(lists.size());
		for(	Way way:lists)
		{
			System.out.println(way.getStuNo());
			System.out.println(way.getPosition().getPoName());
			System.out.println("********");
		}
		
	}
	
	
	
	
	
}
