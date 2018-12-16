package com.xh.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xh.mapper.TbUserMapper;
import com.xh.pojo.PageResult;
import com.xh.pojo.TbUser;
import com.xh.pojo.TbUserExample;
import com.xh.pojo.TbUserExample.Criteria;
import com.xh.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private TbUserMapper userMapper;
	
	public TbUser findOneByUsername(String username){
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andStatusEqualTo("1");
		
		List<TbUser> userList = userMapper.selectByExample(example);
		if(userList != null && userList.size()>0){
			return userList.get(0);
		}
		return null;
	}
	
	@Override
	public PageResult<TbUser> findUserByPage(TbUser user,Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbUserExample example = new TbUserExample();
		
		Page<TbUser> page = (Page<TbUser>) userMapper.selectByExample(example);
		return new PageResult<TbUser>(page.getTotal(), page.getResult());
	}
	

	@Override
	public void insertUser(TbUser user) {
		
		user.setCreatetime(new Date());
		user.setUpdatetime(new Date());
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = encoder.encode(user.getPassword());
		
		user.setPassword(password);
		user.setStatus("1");
		
		userMapper.insert(user);
	}

	@Override
	public void updatePassword(String username, String password) {
		
		TbUser user = findOneByUsername(username);
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		password = encoder.encode(password);
		
		user.setPassword(password);
		user.setUpdatetime(new Date());
		
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public void deleteUser(Integer[] ids) {
		if(ids != null){
			for (Integer id : ids) {
				userMapper.deleteByPrimaryKey(id);
			}
		}
	}

	@Override
	public TbUser findOne(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUser(TbUser user) {
		userMapper.updateByPrimaryKey(user);
	}

}
