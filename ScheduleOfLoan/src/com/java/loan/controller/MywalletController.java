package com.java.loan.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.loan.model.Message;
import com.java.loan.model.Mywallet;
import com.java.loan.model.User;
import com.java.loan.services.MywalletService;
import com.java.loan.utils.SessionUtils;



@Controller
public class MywalletController {	
	
	@Autowired 
	MywalletService mywalletService;
	
	@RequestMapping(value = "/mywallet", method = RequestMethod.GET)
	public String getMyWalletPage(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		return "mywallet";
	}
	/************************************
	 * Open Popup Form
	 * My Wallet Popup Forms
	 * **********************************/
	@RequestMapping(value="/mywalletadd", method = RequestMethod.GET)
	public String getPopupMywallet(){
		return "popup/mywallet_add";
	}
	
	@RequestMapping(value = "/mywalletAdd", method = RequestMethod.POST)
	public @ResponseBody Message mywalletAddAction(@ModelAttribute Mywallet wallet,HttpServletRequest request,HttpServletResponse respone) throws Exception {
		User user = SessionUtils.getSessionLoan(request, respone);	
		return mywalletService.myWalletInsert(wallet, user);		
	}
	
	@RequestMapping(value = "/mywalletlist" , method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> mywalletList(@RequestParam Map<String, String> params){
		return mywalletService.myWalletList(params);
	}
	
}
