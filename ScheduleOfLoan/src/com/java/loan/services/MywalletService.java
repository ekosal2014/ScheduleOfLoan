package com.java.loan.services;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.loan.enums.WalletType;
import com.java.loan.mapper.MywalletMapper;
import com.java.loan.model.Message;
import com.java.loan.model.Mywallet;
import com.java.loan.utils.LoanException;
import com.java.loan.utils.PaginationUtils;
import com.java.loan.utils.StringUtil;
import com.java.loan.validation.Validation;

@Service
public class MywalletService {

	@Autowired
	private MywalletMapper mywalletMapper;
	/********************************
	 * insert new record into MyWallet
	 * e kosal
	 * ******************************/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Message myWalletInsert(Map map) throws LoanException{
		Mywallet mywallet = mywalletMapper.myWalletGetMaxRecord();
		Validation.isNumber((String)map.get("amount"), "Amount is allow only number ");		
		if (EnumUtils.isValidEnum(WalletType.class, (String)map.get("amout_type"))) {throw new LoanException("1111", "Wallel Type not Valid.");}
		Validation.isBlank((String)map.get("description"), "Decription is not Blank");
		Validation.isLengthCheck((String)map.get("description"), 250, "Decription is too long.");
		try{
			map.put("BalenceOld", mywallet.getBalance_new());
			map.put("regDate", StringUtil.getCurrentDate());
			if (map.get("amoutType").equals(WalletType.SPAND.getValue())){
				map.put("BalenceNew", mywallet.getBalance_new() - Long.valueOf((String)map.get("amount")));
			}else {
				map.put("BalenceNew", mywallet.getBalance_new() + Long.valueOf((String)map.get("amount")));
			}
			mywalletMapper.myWalletInsert(map);
			return new Message("0000","ប្រតិបត្ដិការរបស់លោកអ្នកទទួលបានជោគជ័យ");
		}catch(Exception e){
			e.printStackTrace();
			throw new LoanException("9999","ប្រតិបត្ដិការរបស់លោកអ្នកទទួលបរាជ័យ");
		}
		
	}
	/***************************************************************
	 * select list from MyWallet
	 * e kosal
	 * *************************************************************/
	public HashMap<String, Object> myWalletList(Map<String, String> params){
		try{
			HashMap<String, Object> map = new HashMap<>();
			PaginationUtils.perPage = Integer.valueOf(params.get("perPage"));
			PaginationUtils.currentPage = Integer.valueOf(params.get("currentPage"));			
			map.put("dtStart"  , (String)params.get("dtStart"));
			map.put("dtEnd"    , (String)params.get("dtEnd"));			
			map.put("start"    , PaginationUtils.getStart());
			map.put("perPage"  , PaginationUtils.perPage);
			PaginationUtils.total = mywalletMapper.myWalletCount(map);
			map.put("list"     , mywalletMapper.myWalletList(map));
			map.put("total"    , PaginationUtils.total);
			map.put("Balance"  , mywalletMapper.myWalletGetMaxRecord().getBalance_new());
			map.put("totalPage", PaginationUtils.totalPage());		
			return map;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	
}
