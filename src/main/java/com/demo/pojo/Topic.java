package com.demo.pojo;

//import org.hibernate.validator.constraints.NotEmpty;

public class Topic {

	private int topicId;
	
	private int topicTeamId;

	private String topicTitle;

	private String topicContent;
	
	private String topicDateTime;
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	public int getTopicTeamId() {
		return topicTeamId;
	}
	public void setTopicTeamId(int topicTeamId) {
		this.topicTeamId = topicTeamId;
	}
	
	public String getTopicTitle() {
		return topicTitle;
	}
	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}
	
	public String getTopicContent() {
		return topicContent;
	}
	public void setTopicContent(String topicContent) {
		this.topicContent = topicContent;
	}
	
	public String getTopicDateTime() {
		return topicDateTime;
	}
	public void setTopicDateTime(String topicDateTime) {
		this.topicDateTime = topicDateTime;
	}
}