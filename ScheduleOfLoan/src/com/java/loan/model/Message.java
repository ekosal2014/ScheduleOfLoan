package com.java.loan.model;

public class Message {
	private boolean error;
	private String code;
	private String msg;
	public Message(){};
	public Message(String code){
		this.code = code;
	}
	public Message(String code,String message){
		this.code = code;
		this.msg  = message;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
