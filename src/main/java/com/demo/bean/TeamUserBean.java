package com.demo.bean;

//import org.hibernate.validator.constraints.NotEmpty;

public class TeamUserBean {
	private int teamUserId;

	private int teamId;
	
	private int userId;
	
	public int getTeamUserId() {
		return teamUserId;
	}
	public void setTeamUserId(int teamUserId) {
		this.teamUserId = teamUserId;
	}
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}