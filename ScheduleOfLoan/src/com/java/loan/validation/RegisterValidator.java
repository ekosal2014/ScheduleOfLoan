package com.java.loan.validation;

import org.springframework.stereotype.Component;
import com.java.loan.modal.Message;


@Component
public class RegisterValidator{
	public Message validator(Object obj,Message msg){
		return msg;
	}
}