package com.xh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.pojo.PageResult;
import com.xh.pojo.Result;
import com.xh.pojo.TbUser;
import com.xh.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showName")
	public Map<String,String> showName(){
		Map<String,String> map = new HashMap<String,String>();
		
		// 获得用户名信息:
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		
		TbUser user = userService.findOneByUsername(username);
		map.put("username", user.getRealname());
		
		return map;
	}
	
	@RequestMapping("/addUser")
	public Result addUser(@RequestBody TbUser user){
		TbUser _user = userService.findOneByUsername(user.getUsername());
		if(_user != null){
			return new Result(false,"用户名已存在, 请尝试其他用户名");
		}
		try {
			userService.insertUser(user);
			return new Result(true,"操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"操作失败");
		}
	}
	
	
	@RequestMapping("/search")
	public PageResult<TbUser> findList(@RequestBody TbUser user , Integer pageNum , Integer pageSize){
		PageResult<TbUser> page = userService.findUserByPage(user,pageNum,pageSize);
		return page;
	}
	
	@RequestMapping("/findOne")
	public TbUser findOne(Integer id){
		return userService.findOne(id);
	}
	
	
	@RequestMapping("/updateUser")
	public Result updateUser(@RequestBody TbUser user){
		try {
			userService.updateUser(user);
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
	
	@RequestMapping("/delete")
	public Result deleteUser(Integer[] ids){
		try {
			userService.deleteUser(ids);
			return new Result(true, "操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
	
	@RequestMapping("/updatePassword")
	public Result updatePassword(String newpassword , String oldpassword){
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		try {
			TbUser user = userService.findOneByUsername(username);
			
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			boolean matches = encoder.matches(oldpassword, user.getPassword());
			System.out.println("matchers: " + matches);
			
			if(matches){
				userService.updatePassword(username, newpassword);
				return new Result(true, "操作成功");
			}else{
				return new Result(false, "原始密码不正确 !");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "操作失败");
		}
	}
}
