package com.java.loan.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.java.loan.enums.UserSts;
import com.java.loan.mapper.UserMapper;
import com.java.loan.model.Message;
import com.java.loan.model.User;
import com.java.loan.utils.LoanException;
import com.java.loan.utils.PaginationUtils;
import com.java.loan.utils.SessionUtils;
import com.java.loan.utils.StringUtil;
import com.java.loan.validation.Validation;

@Service
public class UserSerive {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;
	 /* ****************************************
     * Register New Into Database
     * E Kosal
     * 13-09-2017
     */
	public Message registerUser(User user) throws LoanException{
		User obj = new User();
		int max = 0;
		String userCode = "";
		System.out.println(" Hello  ========");
		max = userMapper.getMaxUserId();
		System.err.println("  Hello ============"+ max);
		try{
			obj = userMapper.getUserNameExit(user.getUsername());
			if (obj != null){
				return new Message("1111", "User Name Already Exits!");
			}else{
				max = userMapper.getMaxUserId() + 1;
				userCode = "EMP-"+ StringUtil.leftPad(String.valueOf(max), 10, "0");
				user.setUser_code(userCode);
				user.setPassword(passwordEncoder.encode(user.getPassword()));
				if (userMapper.registerUser(user) > 0){
					return new Message("0000", "Insert completed!");
				}else{
					return new Message("9999", "Insert fails");
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
			throw new LoanException("9999", "Insert fails");
			
		}
	}
	/* ****************************************
     * getLogIn Into Database
     * E Kosal
     * 13-09-2017
     */
	public Message getLogIn(String username,String password,HttpSession session) throws LoanException {
		User user = new User();
		try {
			user = userMapper.getUserNameExit(username);
			if ( user == null ) {
				return new Message("1111", "User not Exits!");
			}else {
				if (!passwordEncoder.matches(password, user.getPassword())) {
					return new Message("1111", "Password not match!");
				}else if (user.getSts().equals("2")){
					return new Message("1111", "User can not use this system now. Pleas contect to Admin.");
				}else {
					SessionUtils.setSessionLoan(session, user);
					return new Message("0000", "Login completed!");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw new LoanException("1111", "Something wrong!");
			
		}
	}
	
	public HashMap<String, Object> userList(Map<String, String> params){
		HashMap<String, Object> map = new HashMap<>();
		try{
			PaginationUtils.perPage = Integer.valueOf(params.get("perPage"));
			PaginationUtils.currentPage = Integer.valueOf(params.get("currentPage"));		
			System.out.println("  =========== start ========="+PaginationUtils.getStart());
			map.put("start", PaginationUtils.getStart());
			map.put("perPage", PaginationUtils.perPage);
			map.put("txtName", map.get("txtName"));
			map.put("list", userMapper.userList(map));		
			PaginationUtils.total = Long.valueOf(userMapper.userCount());
			map.put("total", PaginationUtils.total);
			map.put("totalPage", PaginationUtils.totalPage());
			return map;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public Message userEditBasic(HashMap<String, Object> map) throws LoanException{
		Validation.isBlank((String)map.get("fullName"), "Full Name can not Blank!");
		Validation.isEnum((String)map.get("gender"), " gender is not valid");
		Validation.isBlank((String)map.get("email"), "email can not Blank!");
		Validation.isBlank((String)map.get("phone"), "Phone can not Blank!");
		Validation.isBlank((String)map.get("address"), "address can not Blank!");
		Validation.isEnum((String)map.get("txt"), " Permission is not valid");
		Validation.isEnum((String)map.get("sts"), " Sitaution is not valid");
		if ((String)map.get("photo") != ""){
			map.put("photo", "default.png");
		}
		try{
			map.put("createdate", StringUtil.getCurrentDate());
			return new Message("0000", "User Edit Successfull");
		}catch(Exception e){
			throw new LoanException("9999", "User Edit fails");
		}
	}

}
