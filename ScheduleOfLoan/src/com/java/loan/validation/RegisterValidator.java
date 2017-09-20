package com.java.loan.validation;

import org.springframework.stereotype.Component;

import com.java.loan.model.Message;
import com.java.loan.model.User;


@Component
public class RegisterValidator{
	public void validator(Object obj,Message msg){
		User user = (User) obj;
		msg.setError(false);
		if (user.getUsername().equals("")) {
			msg.setMessage("Please Enter User Name!");
			msg.setError(true);
			return;
		}
		if (user.getPassword().equals("")) {
			msg.setMessage("Please Enter Your Password!");
			msg.setError(true);
			return;
		}
		if (user.getConfirm_password().equals("")) {
			msg.setMessage("Please Enter Your Password!");
			msg.setError(true);
			return;
		}
		if (!user.getPassword().equals(user.getConfirm_password())) {
			msg.setMessage("Please Enter Your Password not match!");
			msg.setError(true);
			return;
		}
	}
}