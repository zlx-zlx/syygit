package com.softjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softjx.dao.AdminMapper;
import com.softjx.model.Admin;
import com.softjx.model.AdminExample;
import com.softjx.service.AdminService;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

	
	@Autowired
	private AdminMapper adminMapper;
	
	
	@Transactional(readOnly=true)
	public List<Admin> getAdmin(AdminExample example) {
	     List<Admin> admins=adminMapper.selectByExample(example);
		return admins;
	}

	
	public int addAdmin(Admin admin) {
		int count=adminMapper.insertSelective(admin);
		return count;
	}
	
	
	
	
	@Transactional(readOnly=true)
	public Admin getAdmin(Integer id) {		
		Admin admin=null;
		AdminExample adminExample=new AdminExample();
		AdminExample.Criteria criteria=adminExample.createCriteria();
		criteria.andIdEqualTo(id);
		List<Admin>list=adminMapper.selectByExample(adminExample);
		if(list.size()>0){
			admin=list.get(list.size()-1);
		}
	    return admin;
	}
	
	
	public int updateAdmin(Admin admin) {
		AdminExample adminExample=new AdminExample();
		AdminExample.Criteria criteria=adminExample.createCriteria();
		criteria.andIdEqualTo(admin.getId());
		Admin ad=adminMapper.selectByExample(adminExample).get(0);
		admin.setId(ad.getId());
		Integer count=adminMapper.updateByPrimaryKey(admin);
		return count;
	}
	
	

   public int deleteAdmin(Integer id) {
		
		int count=adminMapper.deleteByPrimaryKey(id);
		return count;
	}



	

	
	
}
