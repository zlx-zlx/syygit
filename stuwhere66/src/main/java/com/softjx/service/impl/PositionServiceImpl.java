package com.softjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softjx.dao.PositionMapper;
import com.softjx.model.Position;
import com.softjx.model.PositionExample;
import com.softjx.service.PositionService;

@Service("positionService")
@Transactional
public class PositionServiceImpl implements PositionService {

	
	@Autowired
	private PositionMapper positionMapper;
	
	
	@Transactional(readOnly=true)
	public List<Position> getPosition(PositionExample example) {
	     List<Position> positions=positionMapper.selectByExample(example);
		return positions;
	}

	
	public int addPosition(Position position) {
		int count=positionMapper.insertSelective(position);
		return count;
	}
	
	
	
	
	@Transactional(readOnly=true)
	public Position getPosition(Integer poId) {		
		Position position=null;
		PositionExample positionExample=new PositionExample();
		PositionExample.Criteria criteria=positionExample.createCriteria();
		criteria.andPoIdEqualTo(poId);
		List<Position>list=positionMapper.selectByExample(positionExample);
		if(list.size()>0){
			position=list.get(list.size()-1);
		}
	    return position;
	}
	
	
	public int updatePosition(Position position) {
		PositionExample positionExample=new PositionExample();
		PositionExample.Criteria criteria=positionExample.createCriteria();
		criteria.andPoIdEqualTo(position.getPoId());
		Position po=positionMapper.selectByExample(positionExample).get(0);
		position.setPoId(po.getPoId());
		Integer count=positionMapper.updateByPrimaryKey(position);
		return count;
	}
	
	

	public int deletePositionFalse(Integer poId) {
		int count =0;
		Position position=null;
		position=positionMapper.selectByPrimaryKey(poId);
		if(position !=null) {
			position.setPoFlag(true);
		
		 count=positionMapper.updateByPrimaryKey(position);
		}
		return count;
	
	}


	
	//根据职务名查询职务
		@Transactional(readOnly=true)
		public Position selectPositionByName(String name) {
			PositionExample example=new PositionExample();
			com.softjx.model.PositionExample.Criteria criteria=example.createCriteria();
			criteria.andPoFlagEqualTo(false);
			criteria.andPoNameEqualTo(name);
			Position Position1=positionMapper.selectByExample(example).get(0);//将查找到的第一条信息返回
			return Position1;
		}


	

	
	
}
