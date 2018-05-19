package com.demo.service.impl;

import java.io.ByteArrayOutputStream;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import javax.annotation.Resource;
//import org.springframework.stereotype.Service;

import com.demo.bean.PoetryBean;
import com.demo.dao.PoetryDao;
import com.demo.pojo.Poetry;
import com.demo.service.PoetryService;


@Service
public class PoetryServiceImpl implements PoetryService{
	
	@Autowired
	private HttpSession session;

//	@Autowired
//	private UserDao userDao;
	
//	@Override
//	public UserBean loginWithUserName(String userName, String password){
//		UserBean userBean = new UserBean();
//		int res = 0;
//		userBean.setLoginResult(res);
//		System.out.println("userName  " + userName);
//		System.out.println("password  " + password);
//		
//		User user = userDao.selectByUserName(userName);
//		if (user != null && password != null)
//		{
//			if (password.equals(user.getPassword()))
//			{
//				res = loginManager.userRegister(user.getUserId());
//				System.out.println("user.id:  " + user.getUserId());
//
//				userBean.setUserId(user.getUserId());
//				userBean.setUserName(user.getUserName());
//				userBean.setLoginResult(res);
//			}
//		}
//		return userBean;
//	}
	
}