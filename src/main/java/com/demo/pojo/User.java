package com.demo.pojo;

//import org.hibernate.validator.constraints.NotEmpty;

public class User {
	//用户id
	private int userId;
	//用户名
	private String userName;
	//用户密码
	private String password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}