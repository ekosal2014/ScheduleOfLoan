package com.java.loan.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.loan.model.User;

public class SessionUtils {

	public static final String SESSION_LOAN = "LOAN_INFO";
	
	public static void setSessionLoan(HttpSession session,User user) {
		session.setAttribute(SESSION_LOAN, user);
		session.setMaxInactiveInterval(60*60*60);
	}
	
	public static void removeSessionLoan(HttpServletRequest request,User user) {
		request.removeAttribute(SESSION_LOAN);
	}
	
	
}
