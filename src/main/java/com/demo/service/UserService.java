package com.demo.service;

import com.demo.bean.UserBean;

//import java.util.List;

//import com.demo.pojo.User;

/**
 * 用户登入登出接口
 * @content:
 */
public interface UserService{
	/**
	 * 根据用户id 查询用户
	 * @param userId
	 * @return
	 */
	//public User queryUserById(int userId);
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	//public int insertUser(User user);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	//public int updateUser(User user);
	
	/**
	 * 根据用户名，密码登录
	 * @param userName
	 * @param password
	 * @return
	 */
	public UserBean loginWithUserName(String userName, String password);
}