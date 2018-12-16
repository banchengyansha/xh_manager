package com.xh.service;

import com.xh.pojo.PageResult;
import com.xh.pojo.TbUser;

public interface UserService {
	
	public TbUser findOneByUsername(String username);
	
	public PageResult<TbUser> findUserByPage(TbUser user, Integer pageNum, Integer pageSize);
	
	public void insertUser(TbUser user);
	
	public void updatePassword(String username , String password);
	
	public void deleteUser(Integer[] ids);

	public TbUser findOne(Integer id);

	public void updateUser(TbUser user);
	
}
