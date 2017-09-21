package com.java.loan.mapper;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.java.loan.model.Mywallet;

public interface MywalletMapper {
	/********************************
	 * Get Max Record from table tblMyWallet
	 * e kosal
	 * *****************************/
	public Mywallet myWalletGetMaxRecord();
	/********************************
	 * insert new record into MyWallet
	 * e kosal
	 * *****************************/
	public int myWalletInsert(Mywallet mywallet);
	/********************************
	 * select list from MyWallet
	 * e kosal
	 * *****************************/
	public List<Mywallet> myWalletList(HashMap map);
	/********************************
	 * delete record from table MyWallet
	 * e kosal
	 * ******************************/
	public Long myWalletCount(HashMap map);
	/********************************
	 * Get Row  from table MyWallet where by wallet id
	 * e kosal
	 * *****************************/
	public Mywallet myWalletRecord(@Param("walletId") int walletId);
}
