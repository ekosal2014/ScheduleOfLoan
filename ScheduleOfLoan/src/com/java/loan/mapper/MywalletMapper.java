package com.java.loan.mapper;


import java.util.List;

import com.java.loan.model.Mywallet;

public interface MywalletMapper {
	/********************************
	 * Get Max Record of MyWallet
	 * e kosal
	 * */
	public Mywallet myWalletGetMaxRecord();
	/********************************
	 * insert new record into MyWallet
	 * e kosal
	 * */
	public int myWalletInsert(Mywallet mywallet);
	/********************************
	 * select list from MyWallet
	 * e kosal
	 * */
	public List<Mywallet> myWalletList();
}
