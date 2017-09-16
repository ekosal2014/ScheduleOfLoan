package com.java.loan.services;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.loan.mapper.UserMapper;
import com.java.loan.model.Message;
import com.java.loan.model.User;
import com.java.loan.utils.SessionUtils;
import com.java.loan.utils.StringUtils;

@Service
public class UserSerive {
	
	@Autowired
	private UserMapper userMapper;
	 /* ****************************************
     * Register New Into Database
     * E Kosal
     * 13-09-2017
     */
	public Message registerUser(User user){
		StringUtils util = new StringUtils();
		Message message = new Message();
		User obj = new User();
		int max = 0;
		String userCode = "";
		try{
			obj = userMapper.getUserNameExit(user.getUsername());
			if (obj != null){
				message.setCode("1111");
				message.setMsg("User Name Already Exits!");
			}else{
				max = userMapper.getMaxUserId() + 1;
				userCode = "EMP-"+ util.leftPad(String.valueOf(max), 10, "0");
				user.setUser_code(userCode);
				if (userMapper.registerUser(user) > 0){
					message.setCode("0000");
					message.setMsg("Insert completed!");
				}else{
					message.setCode("9999");
					message.setMsg("Insert fails");
				}
			}
			
		}catch(Exception e){
			message.setCode("9999");
			message.setMsg("Insert fails");
			e.printStackTrace();
		}
		return message;
	}
	
	public Message getLogIn(String username,String password,HttpSession session) {
		Message message = new Message();
		User user = new User();
		try {
			user = userMapper.getUserNameExit(username);
			if ( user == null ) {
				message.setCode("1111");
				message.setMsg("User not Exits!");
			}else {
				if (!user.getPassword().equals(password)) {
					message.setCode("1111");
					message.setMsg("Password not match!");
				}else {
					SessionUtils.setSessionLoan(session, user);
					message.setCode("0000");
					message.setMsg("Login completed!");
				}
			}
		}catch(Exception e) {
			message.setCode("1111");
			message.setMsg("Something wrong!");
			e.printStackTrace();
		}
		return message;
	}

}
