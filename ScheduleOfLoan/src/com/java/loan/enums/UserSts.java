package com.java.loan.enums;


public enum UserSts {
	DELETE("9"),
	INACTIVE("2"),
	ACTIVE("1")
	;
	
	private String value;
	private UserSts(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	
	public UserSts fromValue(String value){
		for(UserSts my: UserSts.values()){
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
			label = "INACTIVE";
		}else{
			label = "DELETE";
		}
		
		return label;
	}
	
}
