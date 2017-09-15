package com.java.loan.utils;

public class LoanException extends Exception{
	private String code;
	private String message;
	
	public LoanException() {
		// TODO Auto-generated constructor stub
		super();
	}
	public LoanException(String code){
		super(code);
		this.code = code;
	}
	
	public LoanException(String code, String message){
		super(message);
		this.code = code;
		this.message = message;
	}
	
	public String getCode(){
		return code;
	}
	
	public String getMessage(){
		return message;
	}
}
