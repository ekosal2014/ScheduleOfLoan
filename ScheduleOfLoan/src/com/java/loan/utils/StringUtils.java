package com.java.loan.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils {
	private static String dtst = "yyyyMMdd";
	private String stdt = "dd-mm-yyyy";
	public static String leftPad(String str,int number,String symbol){
		String pad= "";
		while(number > 0){
			pad += symbol;
			number--;
		}
		pad = pad.substring(str.length()) + str;
		return pad;
	}
	
	public static String getCurrentDate(){
		SimpleDateFormat df = new SimpleDateFormat(dtst);
		Date dt = new Date();
		return df.format(dt).toString();
	}
}
