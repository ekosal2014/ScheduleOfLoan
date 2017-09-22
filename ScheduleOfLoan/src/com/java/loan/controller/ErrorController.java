package com.java.loan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.loan.model.Message;
import com.java.loan.utils.LoanException;
import com.java.loan.utils.SessionException;

@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(SessionException.class)
	public @ResponseBody Message sessionException(HttpServletRequest request,SessionException e,HttpServletResponse response) {
		return new Message(e.getCode(), e.getMessage());
	}
	
	@ExceptionHandler(LoanException.class)
	public @ResponseBody Message messageException(LoanException e) {
		return new Message(e.getCode(), e.getMessage());
	}
}
