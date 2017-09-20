package com.java.loan.utils;

public class StringUtils {

	public static String leftPad(String str,int number,String symbol){
		String pad= "";
		while(number > 0){
			pad += symbol;
			number--;
		}
		pad = pad.substring(str.length()) + str;
		return pad;
	}
}
