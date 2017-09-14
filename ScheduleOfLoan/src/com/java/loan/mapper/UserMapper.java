package com.java.loan.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.java.loan.model.User;

 public interface UserMapper {
    /* ****************************************
     * Register New Into Database
     * E Kosal
     * 13-09-2017
     */
	public int registerUser(User user);
   /* *****************************************
    * Retrieve max id from table user
	* e kosal
	* 14-09-2017
	**/
	public int getMaxUserId();
	/*
	 * Check User Name Already Exit Or Not
	 * ekosa 14-09-20417
	 * */
	public int getUserNameExit(@Param("username") String username);
}
