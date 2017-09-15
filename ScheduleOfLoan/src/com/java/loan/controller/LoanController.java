package com.java.loan.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.loan.model.Message;
import com.java.loan.model.User;
import com.java.loan.services.UserSerive;
import com.java.loan.utils.LoanException;
import com.java.loan.utils.SessionUtils;
import com.java.loan.validation.RegisterValidator;


@Controller
public class LoanController {
	
	@Autowired
	UserSerive userSerive;
	
	@Autowired
	RegisterValidator registerValidator;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage(){
		return "redirect:/login";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHomePages(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		return "index";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(){
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody Message getLogIn(@RequestParam String username,@RequestParam String password,HttpSession session) throws Exception{
		Message message = new Message();
/*		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		SessionUtils.setSessionLoan(session, user);*/
		message = userSerive.getLogIn(username, password, session);
		return message;
	}
	
	@ExceptionHandler(LoanException.class)
	public void exceptionMsg(LoanException e,HttpServletResponse respone) throws IOException{
		/*Message msg = new Message();
		msg.setCode(e.getCode());
		msg.setMsg(e.getMessage());
		return msg;*/
		respone.sendRedirect("./login");
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getRegisterPage(){
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	
	public @ResponseBody Message getRegister(@ModelAttribute User user){
		Message msg = new Message();
		registerValidator.validator(user, msg);
		if (msg.isError()){
			return msg;
		}
		System.out.println(" =======================");
		msg = (Message)userSerive.registerUser(user);
		return msg;
	}

}
