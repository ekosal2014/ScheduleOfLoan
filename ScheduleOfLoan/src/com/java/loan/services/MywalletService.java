package com.java.loan.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.loan.mapper.MywalletMapper;
import com.java.loan.model.Message;
import com.java.loan.model.Mywallet;
import com.java.loan.model.User;
import com.java.loan.utils.LoanException;

@Service
public class MywalletService {

	@Autowired
	private MywalletMapper mywalletMapper;
	/********************************
	 * insert new record into MyWallet
	 * e kosal
	 * */
	public Message myWalletInsert(Mywallet wallet,User user) throws LoanException{
		Mywallet mywallet = mywalletMapper.myWalletGetMaxRecord();
		try{
			wallet.setBalance_old(mywallet.getBalance_new());
			wallet.setReg_user(user.getUser_id());
			if (wallet.getAmout_type().equals("0")){
				wallet.setBalance_new(mywallet.getBalance_new() - wallet.getAmount());
			}else {
				wallet.setBalance_new(mywallet.getBalance_new() + wallet.getAmount());
			}
			mywalletMapper.myWalletInsert(wallet);
			return new Message("0000","ប្រតិបត្ដិការរបស់លោកអ្នកទទួលបានជោគជ័យ");
		}catch(Exception e){
			throw new LoanException("9999","ប្រតិបត្ដិការរបស់លោកអ្នកទទួលបរាជ័យ");
		}
		
	}
	/***************************************************************
	 * select list from MyWallet
	 * e kosal
	 * *************************************************************/
	public List<Mywallet> myWalletList(){
		try{
			return new ArrayList<Mywallet>(mywalletMapper.myWalletList()) ;
		}catch(Exception e){
			return null;
		}
	}
	public Message myWalletDeleteById(int walletId) throws LoanException{
		try{
			mywalletMapper.myWalletDeleteById(walletId);
			return new Message("0000", "ប្រតិបត្ដិការរបស់លោកអ្នកទទួលបានជោគជ័យ");
		}catch(Exception e){
			throw new LoanException("9999", "ប្រតិបត្ដិការរបស់លោកអ្នកទទួលបរាជ័យ");
		}
		
	}
	
}
