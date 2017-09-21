package com.java.loan.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.loan.model.User;

public class SessionUtils {

	public static final String SESSION_LOAN = "LOAN_INFO";
	
	public static void setSessionLoan(HttpSession session,User user) {
		session.setAttribute(SESSION_LOAN, user);
		session.setMaxInactiveInterval(60*5);
	}
	
	public static void removeSessionLoan(HttpSession session) {
		session.removeAttribute(SESSION_LOAN);
	}
	
	public static User getSessionLoan(HttpServletRequest request,HttpServletResponse respone) throws Exception{
		HttpSession session = request.getSession(false);
		
		if (session != null){
			if (session.getAttribute(SESSION_LOAN) == null){
				throw new SessionException("0001","សិទ្ធិរបស់អ្នកត្រូវបានផ្ដាច់សូមធ្វើការចូលប្រព័ន្ធម្ដងទៀត");
			}else{
				try{
					return (User) session.getAttribute(SESSION_LOAN);
				}catch(Exception e){
					throw new SessionException("0001","សិទ្ធិរបស់អ្នកត្រូវបានផ្ដាច់សូមធ្វើការចូលប្រព័ន្ធម្ដងទៀត");
				}				
			}
		}else{
			throw new SessionException("0001","សិទ្ធិរបស់អ្នកត្រូវបានផ្ដាច់សូមធ្វើការចូលប្រព័ន្ធម្ដងទៀត");
		}
	}
	
	public static User getSessionLoanView(HttpServletRequest request){
		try{
			HttpSession session = request.getSession(false);
			return (User) session.getAttribute(SESSION_LOAN);
		}catch(Exception e){
			e.printStackTrace();
			return new User();
		}
	}
	
}
