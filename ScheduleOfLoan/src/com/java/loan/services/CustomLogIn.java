package com.java.loan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.java.loan.mapper.UserMapper;
import com.java.loan.model.User;

@Service("customLogIn")
public class CustomLogIn implements UserDetailsService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = new User();
		try{
			user = userMapper.getUserNameExit(username);
		}catch(Exception e){
			
		}
		return null;
	}

}
