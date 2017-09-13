package com.java.loan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.loan.modal.Message;
import com.java.loan.modal.User;
import com.java.loan.validation.RegisterValidator;


@Controller
public class LoanController {
	
	@Autowired
	RegisterValidator registerValidator;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage(){
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin(){
		return "login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getRegisterPage(){
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public @ResponseBody Message getRegister(@ModelAttribute User user){
		System.out.println(" =============== Hello ==========="  );
		Message msg = new Message();
		user.setUsername("");
		msg.setCode("lksadfjlsaf");
		msg.setMsg("asdlkfasd");
		msg.setError(true);
		
		if (msg.isError()){
			System.out.println(" =============== Hello =========== error"  );
		}
		System.out.println(" =============== Hello ==========="  );
		return registerValidator.validator(user, msg);
	}

}
