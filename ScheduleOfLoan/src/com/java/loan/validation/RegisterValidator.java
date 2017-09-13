package com.java.loan.validation;

import org.springframework.stereotype.Component;
import com.java.loan.modal.Status;


@Component
public class RegisterValidator{
	public Status validator(Object obj,Status msg){
		return msg;
	}
}