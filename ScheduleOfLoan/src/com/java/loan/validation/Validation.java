package com.java.loan.validation;



import org.apache.commons.lang3.StringUtils;

import com.java.loan.utils.LoanException;

public class Validation {
	public static void isNumber(String str,String message) throws LoanException {
		if (!StringUtils.isNumeric(str)) throw new LoanException("9999",message);
	}
	public static void isBlank(String str,String message) throws LoanException{
		if (StringUtils.isBlank(str)) throw new LoanException("9999", message);
	}
	public static void isLengthCheck(String str,int number,String message) throws LoanException{
		if (str.length() > number){
			throw new LoanException("9999",message);
		}
	}
	
}
