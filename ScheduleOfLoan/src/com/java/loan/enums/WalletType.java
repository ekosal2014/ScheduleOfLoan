package com.java.loan.enums;

public enum WalletType {
		SPAND("0"),
		INCOME("1")
		;
	    private String value;
	    private WalletType(String value){
			this.value = value;
		}
	    public String getValue(){
			return this.value;
		}
	    public WalletType fromValue (String value){
	    	for(WalletType type : WalletType.values()){
	    		if (type.value == value){
	    			return type;
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
