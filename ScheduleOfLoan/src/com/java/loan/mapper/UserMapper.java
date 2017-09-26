package com.java.loan.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public User getUserNameExit(@Param("username") String username);
	/*
	 * Get User One Record To Edit User
	 * ekosa 14-09-20417
	 * */
	public User getUserById(@Param("Id") int id);
	/*
	 * Get User One Record To Edit User
	 * ekosa 14-09-20417
	 * */
	public int  userEditById(User user);
	
	public List<User>  userList(HashMap<String, Object> map);
	public int userCount();
	public int userEditBasic(HashMap<String, Object> map);
	
}
