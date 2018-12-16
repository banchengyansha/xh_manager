package com.xh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.xh.pojo.TbUser;
import com.xh.service.UserService;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;
	
	public void setSellerService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<GrantedAuthority> grantAuths = new ArrayList<GrantedAuthority>();
		grantAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		// 去数据库进行查询:
		TbUser user = userService.findOneByUsername(username);
		if(user != null){
			return new User(username,user.getPassword(),grantAuths );
		}
		return null;
		
	}

}
