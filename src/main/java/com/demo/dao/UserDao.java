package com.demo.dao;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.User;
//import com.demo.util.PageCalculate;

public interface UserDao {
	/**
	 * 根据 userId 查找用户
	 * @param userId
	 * @return
	 */
	public User queryUserById(int userId);
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	
}