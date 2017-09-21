package com.java.loan.validation;

import org.apache.commons.lang.StringUtils;

import com.java.loan.utils.LoanException;

public class Validation {
	public static void isNumber(String str,String message) throws LoanException {
		if (!StringUtils.isNumeric(str)) throw new LoanException("9999",message);
	}

}
