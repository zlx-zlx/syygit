package com.softjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softjx.dao.WayMapper;
import com.softjx.model.Way;
import com.softjx.model.WayExample;
import com.softjx.service.WayService;

@Service("wayService")
@Transactional
public class WayServiceImpl implements WayService {

	
	@Autowired
	private WayMapper wayMapper;
	
	
	@Transactional(readOnly=true)
	public List<Way> getWay(WayExample example) {
	     List<Way> ways=wayMapper.selectByExample(example);
		return ways;
	}

	
	public int addWay(Way way) {
		int count=wayMapper.insertSelective(way);
		return count;
	}
	
	
	
	
	@Transactional(readOnly=true)
	public Way getWay(Integer wayId) {		
		Way way=null;
		WayExample wayExample=new WayExample();
		WayExample.Criteria criteria=wayExample.createCriteria();
		criteria.andWayIdEqualTo(wayId);
		List<Way>list=wayMapper.selectByExample(wayExample);
		if(list.size()>0){
			way=list.get(list.size()-1);
		}
	    return way;
	}
	
	
	public int updateWay(Way way) {
		WayExample wayExample=new WayExample();
		WayExample.Criteria criteria=wayExample.createCriteria();
		criteria.andWayIdEqualTo(way.getWayId());
		Way wa=wayMapper.selectByExample(wayExample).get(0);
		way.setWayId(wa.getWayId());
		Integer count=wayMapper.updateByPrimaryKey(way);
		return count;
	}
	
	

	public int deleteWayFalse(Integer wayId) {
		int count =0;
		Way way=null;
		way=wayMapper.selectByPrimaryKey(wayId);
		if(way !=null) {
			way.setWayFlag(true);
		
		 count=wayMapper.updateByPrimaryKey(way);
		}
		return count;
	
	}


	


	@Transactional(readOnly=true)
	public List<Way> getWayWithPo(WayExample wayExample) {
		List<Way> lists=wayMapper.selectByExampleWithPo(wayExample);
		return lists;
	}


	
	
}
