package com.demo.service.impl;

import java.io.ByteArrayOutputStream;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import javax.annotation.Resource;
//import org.springframework.stereotype.Service;

import com.demo.bean.UserBean;
import com.demo.dao.UserDao;
import com.demo.manager.LoginManager;
import com.demo.pojo.User;
import com.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private LoginManager loginManager;
	
	@Autowired
	private HttpSession session;

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserBean loginWithUserName(String userName, String password){
		UserBean userBean = new UserBean();
		int res = 0;
		userBean.setLoginResult(res);
		System.out.println("userName  " + userName);
		System.out.println("password  " + password);
		
		User user = userDao.selectByUserName(userName);
		if (user != null && password != null)
		{
			if (password.equals(user.getPassword()))
			{
				res = loginManager.userRegister(user.getUserId());
				System.out.println("user.id:  " + user.getUserId());

				userBean.setUserId(user.getUserId());
				userBean.setUserName(user.getUserName());
				userBean.setLoginResult(res);
				


				//HttpServletRequest request;
//				HttpServletResponse response = null;
//				Cookie cookieUserId = new Cookie("userId",String.valueOf(user.getUserId()));
//				Cookie cookieUserName = new Cookie("userName", userName);
//				response.addCookie(cookieUserId);
//				response.addCookie(cookieUserName);
			}
		}
		return userBean;
	}
	
	@Override
	public int register(String userName, String password){
		//如果注册成功， 返回1， 注册失败，返回0
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		try
		{
			userDao.insertUser(user);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}