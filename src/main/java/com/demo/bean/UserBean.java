package com.demo.bean;

public class UserBean
{
	private Integer userId;

	private String userName;

	private int loginResult;

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public int getLoginResult()
	{
		return loginResult;
	}

	public void setLoginResult(int loginResult)
	{
		this.loginResult = loginResult;
	}
}