package com.java.loan.utils;

public class SessionException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String message;
	
	public SessionException() {
		// TODO Auto-generated constructor stub
		super();
	}
	public SessionException(String code){
		super(code);
		this.code = code;
	}
	
	public SessionException(String code, String message){
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
