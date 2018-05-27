package com.demo.pojo;

//import org.hibernate.validator.constraints.NotEmpty;

public class Team {

	private int teamId;

	private String teamName;

	private String teamDescription;
	
	private int teamUId;
	
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
}