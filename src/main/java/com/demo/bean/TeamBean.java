package com.demo.bean;

import java.util.List;

import com.demo.pojo.User;

//import org.hibernate.validator.constraints.NotEmpty;

public class TeamBean {

	private int teamId;

	private String teamName;

	private String teamDescription;
	
	private int teamUId;
	
	private String teamUserName;
	
	private List<User> userList;
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getTeamDescription() {
		return teamDescription;
	}
	public void setTeamDescription(String teamDescription) {
		this.teamDescription = teamDescription;
	}
	
	public int getTeamUId() {
		return teamUId;
	}
	public void setTeamUId(int teamUId) {
		this.teamUId = teamUId;
	}
	
	public String getTeamUserName() {
		return teamUserName;
	}
	public void setTeamUserName(String teamUserName) {
		this.teamUserName = teamUserName;
	}
	
	public List<User> getUserBeanList() {
		return userList;
	}
	public void setUserBeanList(List<User> userList) {
		this.userList = userList;
	}
}