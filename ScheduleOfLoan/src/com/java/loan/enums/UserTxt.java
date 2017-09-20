package com.java.loan.enums;



public enum UserTxt {
	USER("1"),
	ADMIN("2"),
	;
	private String value;
	private UserTxt (String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	public UserTxt fromValue(String value){
		for(UserTxt my: UserTxt.values()){
			if (my.value == value){
				return my;
			}
		}
		return null;
	}
	
	public String getLabel(){
		
		String label = "";
		if ("1".equals(value)){
			label = "ACTIVE";
		}else if ("2".equals(value)){
			label = "LOCK";
		}else if ("3".equals(value)){
			label = "INACTIVE";
		}else{
			label = "DELETE";
		}
		
		return label;
	}
}
