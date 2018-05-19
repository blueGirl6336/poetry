package com.demo.controller;

import java.io.ByteArrayOutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.UserBean;
import com.demo.service.UserService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userService;

	/**
	 * 用户登陆（使用用户名）
	 *
	 * @Title: loginWithUserName
	 * 
	 * @param userName用户名
	 * @param password密码
	 * @return
	 */
	@RequestMapping("/loginWithUserName")
	@ResponseBody
	public Map<String, Object> loginWithUserName(@RequestParam String userName, @RequestParam String password)
	{
		UserBean userBean = userService.loginWithUserName(userName, password);
		System.out.println("enter map controller  " );
		switch (userBean.getLoginResult())
		{
		case 0:
			return ResponseMapUtil.responseError("用户名/密码错误！");
		case 1: return ResponseMapUtil.responseSuccess(userBean);
		default:
			return ResponseMapUtil.responseError("未知登录错误！");
		}
	}
	
	@RequestMapping("/register")
	@ResponseBody
	public Map<String, Object> register(@RequestParam String userName, @RequestParam String password)
	{
		int registerResult = userService.register(userName, password);
		switch(registerResult){
			case 0:
				return ResponseMapUtil.responseError("注册失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("注册成功");
			default:
				return ResponseMapUtil.responseError("未知注册错误！");
		}
	}

	/**
	 * 用户登出
	 *
	 * @Title: logout
	 * 
	 * @return
	 */
//	@RequestMapping("/logout")
//	@ResponseBody
//	public Map<String, Object> logout()
//	{
//		boolean res = userService.logout();
//		if (!res)
//			return ResponseMapUtil.responseError("登出失败");
//		else
//			return ResponseMapUtil.responseSuccess(res);
//	}

}
