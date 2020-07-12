package com.softjx.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softjx.model.Position;
import com.softjx.model.PositionExample;
import com.softjx.service.PositionService;

public class TestPosition {
	
	
	private static ApplicationContext context = null;
	private PositionService positionService = null;
	
	
	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		positionService = (PositionService) context.getBean("positionService");
	}

	
	
	
	@Test
	public void TestAddPosition() {
		Position position=new Position();
		
			position.setPoCode("30001");
			
			position.setPoName("开发部主管");
			
			position.setPoFlag(Boolean.valueOf("0"));
			
		
		int count=positionService.addPosition(position);
		System.out.println(count);
		
		
		
		/*
		position.setCreateTime(new Date());
		
		position.setDeleteFlag(Boolean.valueOf("0"));
		*/
		
		
		
	}
	
	
	@Test
	public void TestAddPositionMany() {
		
		for(int i=2;i<10;i++)
		{
			Position position=new Position();
			
			position.setPoCode("300011");
			
			position.setPoName("开发部主管11");
			
			position.setPoFlag(Boolean.valueOf("0"));
			
		
		int count=positionService.addPosition(position);
		System.out.println(count);
		}
		
	}
	
	
	
	
	@Test
	public void TestGetPosition() {
		Position position=positionService.getPosition(3);
		
		if (position!=null)
		{
			System.out.println(position.getPoName());
		}
	}
	
	
	
	
	@Test
	public void TestGetPositions() {
		PositionExample positionExample = null;
		List<Position> positions = positionService.getPosition(positionExample);
		for (Position position : positions)
			System.out.println(position.getPoId() + "   " + position.getPoCode()
					  + "  " + position.getPoName()+ "   " + position.getPoFlag()
				  );

	}	
	
	
	
	@Test
	public void TestGetPositions1() {
		
		PositionExample positionExample = new PositionExample();
		PositionExample.Criteria criteria = positionExample.createCriteria();
		//criteria.andCorpCodeLike("%" + 2 + "%");		
		//criteria.andStuFlagEqualTo(Boolean.TRUE);
		criteria.andPoFlagEqualTo(Boolean.FALSE);
		//criteria.andStuNameLike("%" + "li" + "%");
		criteria.andPoNameLike("%" + "开" + "%");
		criteria.andPoCodeEqualTo("30001");
		List<Position> positions = positionService.getPosition(positionExample);
		for (Position position : positions)
			System.out.println(position.getPoId() + "   " + position.getPoCode()
					  + "  " + position.getPoName()+ "   " + position.getPoFlag()
				  );
	}	
	
	
	
	
	
	@Test
	public void TestGetIdPosition() {
		Position position=positionService.getPosition(9);
		System.out.println(position.getPoName()+"  " + position.getPoCode());
		//System.out.println(position.getStuMajor());
	}
	
	
	
	@Test
	public void TestUpdatePosition() {
		   Position position=new Position();
		    position.setPoId(5);
		    
			
			position.setPoCode("300012");
			
			position.setPoName("技术部主任");
			
			position.setPoFlag(Boolean.valueOf("0"));
			
		
		
			positionService.updatePosition(position);
		}
	

	
	
	
	@Test
	public void TestDeletePositionFlase() {		
			positionService.deletePositionFalse(5);
	}
	
	
	
	
	
	
}
