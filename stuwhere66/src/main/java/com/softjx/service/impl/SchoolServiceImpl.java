package com.softjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softjx.dao.SchoolMapper;
import com.softjx.model.School;
import com.softjx.model.SchoolExample;
import com.softjx.service.SchoolService;

@Service("schoolService")
@Transactional
public class SchoolServiceImpl implements SchoolService {

	
	
	
	
	
	@Autowired
	private SchoolMapper schoolMapper;
	
	
	@Transactional(readOnly=true)
	public List<School> getSchool(SchoolExample example) {
	     List<School> schools=schoolMapper.selectByExample(example);
		return schools;
	}

	
	public int addSchool(School school) {
		int count=schoolMapper.insertSelective(school);
		return count;
	}
	
	
	
	
	@Transactional(readOnly=true)
	public School getSchool(Integer schId) {		
		School school=null;
		SchoolExample schoolExample=new SchoolExample();
		SchoolExample.Criteria criteria=schoolExample.createCriteria();
		criteria.andSchIdEqualTo(schId);
		List<School>list=schoolMapper.selectByExample(schoolExample);
		if(list.size()>0){
			school=list.get(list.size()-1);
		}
	    return school;
	}
	
	
	public int updateSchool(School school) {
		SchoolExample schoolExample=new SchoolExample();
		SchoolExample.Criteria criteria=schoolExample.createCriteria();
		criteria.andSchIdEqualTo(school.getSchId());
		School sch=schoolMapper.selectByExample(schoolExample).get(0);
		school.setSchId(sch.getSchId());
		Integer count=schoolMapper.updateByPrimaryKey(school);
		return count;
	}
	
	

	public int deleteSchoolFalse(Integer schId) {
		int count =0;
		School school=null;
		school=schoolMapper.selectByPrimaryKey(schId);
		if(school !=null) {
			school.setSchFlag(true);
		
		 count=schoolMapper.updateByPrimaryKey(school);
		}
		return count;
	
	}


	
	/*//根据对象中不为空的多个属性进行条件查询
		public List<School> selectSchoolByIf(School school){
			SchoolExample example=new SchoolExample();
			com.softjx.model.SchoolExample.Criteria criteria=example.createCriteria();
			if(school.getSchCode()!=null){
				criteria.andSchCodeEqualTo(school.getSchCode());
			}else if(school.getSchName()!=null){
				
				criteria.andSchNameEqualTo(school.getSchName());
			}
			if(school.getCuorseId()!=null){
				
				criteria.andCuorseIdEqualTo(chapter.getCuorseId());
			}
			
			List<School> chapters=chapterMapper.selectByExample(example);
			return chapters;
		}
	
	*/
	
	
	
	
		//根据职务名查询职务
				@Transactional(readOnly=true)
				public School selectSchoolByName(String name) {
					SchoolExample example=new SchoolExample();
					com.softjx.model.SchoolExample.Criteria criteria=example.createCriteria();
					criteria.andSchFlagEqualTo(false);
					criteria.andSchNameEqualTo(name);
					School school=schoolMapper.selectByExample(example).get(0);//将查找到的第一条信息返回
					return school;
				}


		
				

		//根据对象中不为空的多个属性进行条件查询
		public List<School> selectSchoolByIf(School school){
			SchoolExample example=new SchoolExample();
			com.softjx.model.SchoolExample.Criteria criteria=example.createCriteria();
				if(school.getSchId()!=null){
					criteria.andSchIdEqualTo(school.getSchId());
				}else if(school.getSchName()!=null){
					
					criteria.andSchNameEqualTo(school.getSchName());
				}
				if(school.getSchCode()!=null){
					
					criteria.andSchCodeEqualTo(school.getSchCode());
				}
				
				List<School> schools=schoolMapper.selectByExample(example);
				return schools;
			}
	

	
	
}
