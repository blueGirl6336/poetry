package com.demo.manager;

import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.util.Md5Util;

@Component
public class LoginManager
{
	@Autowired
	private HttpSession session;
	// 已登录的用户放在这个map里面
	private Map<String, String> loginMap = new ConcurrentHashMap<String, String>();

	/**
	 * 用户登录注册
	 *
	 * @Title: userRegister
	 * @version:
	 * @param id
	 *            唯一的用户id，为保证兼容使用String
	 * @return 0：注册失败，1：注册成功
	 */
	public int userRegister(int id)
	{
		System.out.println("enter manager userRegister  ");
		StringBuffer stringBuffer = new StringBuffer("token");
		stringBuffer.append(String.valueOf(id));
		stringBuffer.append(String.valueOf(System.currentTimeMillis()));
		String token = null;
		try
		{
			token = Md5Util.encrypt(stringBuffer.toString());
			System.out.println("token  " + token);
		} catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
			return 0;
		}
		session.setAttribute("token", token);
		session.setAttribute("userId", id);
		loginMap.put(String.valueOf(id), token);
		System.out.println("session.token:  " + session.getAttribute("token"));
		System.out.println("session.id  " + session.getAttribute("userId"));
		return 1;
	}

	/**
	 * 检查用户是否登录
	 *
	 * @Title: checkRegister
	 * 
	 * @return boolean
	 */
	public boolean checkRegister()
	{
		boolean res = false;
		Object id = session.getAttribute("userId");
		Object token = session.getAttribute("token");
		if ((token != null) && (id != null))
		{
			res = token.toString().equals(loginMap.get(id));
		}
		System.out.println(loginMap.values());
		return res;
	}

	/**
	 * 用户登出
	 *
	 * @Title: userUnRegister
	 * 
	 * @return boolean
	 */
	public boolean userUnRegister()
	{
		Object token = session.getAttribute("token");
		Object id = session.getAttribute("userId");
		boolean res = false;
		if ((token != null) && (id != null))
		{
			res = loginMap.remove(id) != null ? true : false;
			session.invalidate();
		}

		return res;
	}
}
