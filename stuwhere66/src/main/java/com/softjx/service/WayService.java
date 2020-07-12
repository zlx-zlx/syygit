package com.softjx.service;

import java.util.List;

import com.softjx.model.Way;
import com.softjx.model.WayExample;

public interface WayService {
	

	// 条件查询所有去向,TeacherExample条件类
		public List<Way> getWay(WayExample example);

		// 添加去向
		public int addWay(Way way);

		// 根据id查询去向
		public Way getWay(Integer wayId);

		// 修改去向
		public int updateWay(Way way);

		// 删除去向,存在
		public int deleteWayFalse(Integer wayId);
	

		
		//自定义
		//多表查询，连接查询，表多时，性能低
		 public List<Way> getWayWithPo(WayExample wayExample);

		
		
		
}