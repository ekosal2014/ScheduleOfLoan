package com.java.loan.validation;

import org.springframework.stereotype.Component;
import com.java.loan.modal.Message;
import com.java.loan.modal.User;


@Component
public class RegisterValidator{
	public void validator(Object obj,Message msg){
		User user = (User) obj;
		msg.setError(false);
		if (user.getUsername().equals("")) {
			msg.setMsg("Please Enter User Name!");
			msg.setError(true);
			return;
		}
		if (user.getPassword().equals("")) {
			msg.setMsg("Please Enter Your Password!");
			msg.setError(true);
			return;
		}
		if (user.getConfirm_password().equals("")) {
			msg.setMsg("Please Enter Your Password!");
			msg.setError(true);
			return;
		}
		if (!user.getPassword().equals(user.getConfirm_password())) {
			msg.setMsg("Please Enter Your Password not match!");
			msg.setError(true);
			return;
		}
	}
}