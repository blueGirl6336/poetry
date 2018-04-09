package com.demo.service.impl;

import java.io.ByteArrayOutputStream;
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
		
		User user = userDao.selectByUserName(userName);
		if (user != null && password != null)
		{
			if (password.equals(user.getPassword()))
			{
				res = loginManager.userRegister(user.getUserId());

				userBean.setUserId(user.getUserId());
				userBean.setUserName(user.getUserName());
				userBean.setLoginResult(res);
			}
		}
		return userBean;
	}
	
}