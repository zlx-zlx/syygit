package com.softjx.service;

import java.util.List;

import com.softjx.model.Position;
import com.softjx.model.PositionExample;

public interface PositionService {
	

		// 条件查询所有职务,TeacherExample条件类
		public List<Position> getPosition(PositionExample example);

		// 添加职务
		public int addPosition(Position position);

		//  根据id查询职务
		public Position getPosition(Integer poId);

		//修改职务
		public int updatePosition(Position position);


		// 删除职务,存在
		public int deletePositionFalse(Integer poId);
	

		//根据名字查找职务号
		public Position selectPositionByName(String name);
		
		
		
}

