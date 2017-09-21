package com.java.loan.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.loan.mapper.MywalletMapper;
import com.java.loan.model.Message;
import com.java.loan.model.Mywallet;
import com.java.loan.model.User;
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
	@SuppressWarnings("rawtypes")
	public Message myWalletInsert(Map map) throws LoanException{
		Mywallet mywallet = mywalletMapper.myWalletGetMaxRecord();
		Validation.isNumber((String)map.get("amount"), "Amount is allow only number ");		
		try{
			wallet.setBalance_old(mywallet.getBalance_new());
			wallet.setReg_user(user.getUser_id());
			wallet.setReg_date(StringUtil.getCurrentDate());
			if (wallet.getAmout_type().equals("0")){
				wallet.setBalance_new(mywallet.getBalance_new() - wallet.getAmount());
			}else {
				wallet.setBalance_new(mywallet.getBalance_new() + wallet.getAmount());
			}
			mywalletMapper.myWalletInsert(wallet);
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
