package com.softjx.service;

import java.util.List;

import com.softjx.model.Admin;

import com.softjx.model.AdminExample;

public interface AdminService {


	// 条件查询所有管理员,TeacherExample条件类
	public List<Admin> getAdmin(AdminExample example);

	// 添加管理员
	public int addAdmin(Admin admin);

	// 根据id查询管理员
	public Admin getAdmin(Integer id);

	//修改管理员
	public int updateAdmin(Admin admin);

	//删除管理员
	public int deleteAdmin(Integer id);




}
