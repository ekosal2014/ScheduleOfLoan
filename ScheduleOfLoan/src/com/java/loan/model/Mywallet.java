package com.java.loan.model;

import java.util.Date;

public class Mywallet {
	private int wallet_id;
	private long balance_old;
	private long amount;
	private String amout_type;
	private long balance_new;
	private String descriptions;
	private Date reg_date;
	private int reg_user;
	public int getWallet_id() {
		return wallet_id;
	}
	public void setWallet_id(int wallet_id) {
		this.wallet_id = wallet_id;
	}
	public long getBalance_old() {
		return balance_old;
	}
	public void setBalance_old(long balance_old) {
		this.balance_old = balance_old;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public String getAmout_type() {
		return amout_type;
	}
	public void setAmout_type(String amout_type) {
		this.amout_type = amout_type;
	}
	public long getBalance_new() {
		return balance_new;
	}
	public void setBalance_new(long balance_new) {
		this.balance_new = balance_new;
	}
	public String getDescription() {
		return descriptions;
	}
	public void setDescription(String description) {
		this.descriptions = description;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public int getReg_user() {
		return reg_user;
	}
	public void setReg_user(int reg_user) {
		this.reg_user = reg_user;
	}
	
	
}
