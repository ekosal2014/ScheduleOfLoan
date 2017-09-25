package com.java.loan.controller;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String getHomePages(HttpServletRequest request,HttpServletResponse respone,ModelMap map) throws Exception{
		map.addAttribute("user", SessionUtils.getSessionLoanView(request));
		return "main-layout";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getIndexPages(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		return "index";
	}	
	
	@RequestMapping(value = "/borrower", method = RequestMethod.GET)
	public String getBorrowerPage(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		return "borrower";
	}
	
	@RequestMapping(value = "/loans", method = RequestMethod.GET)
	public String getLoanPage(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		return "loans";
	}
	
	@RequestMapping(value = "/missed-payment", method = RequestMethod.GET)
	public String getMissedPaymentPage(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		return "missedpayment";
	}
	
	@RequestMapping(value = "/payments", method = RequestMethod.GET)
	public String getPaymentsPage(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		return "payments";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String getEmployeePage(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		return "employee";
	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getEmployeeList(@RequestParam Map<String, String> params,HttpServletRequest request,HttpServletResponse respone) throws Exception{
		User user = (User)SessionUtils.getSessionLoan(request, respone);
		return userSerive.userList(params);
	}
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(ModelMap map){
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody Message getLogIn(@RequestParam String username,@RequestParam String password,HttpSession session) throws Exception{
		return userSerive.getLogIn(username, password, session);
	}
		
	/************************************
	 * My Wallet Popup Forms
	 * **********************************/
	@RequestMapping(value="/borrowerpopup", method = RequestMethod.GET)
	public String getPopupBorrower(){
		return "popup/borrower_popup";
	}	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getRegisterPage(){
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	
	public @ResponseBody Message getRegister(@ModelAttribute User user) throws LoanException{
		Message msg = new Message();
		registerValidator.validator(user, msg);
		if (msg.isError()){
			return msg;
		}
		System.out.println(" ==================");
		return userSerive.registerUser(user);
	}

}
