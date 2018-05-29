package com.demo.pojo;

public class TopicComment{
	private int topicCommentId;

	private int topicCommentUId;
	
	private int topicId;
	
	private String topicCommentContent;
	
	private String topicCommentDateTime;
	
	private int topicCommentLikeNum;
	
	public int getTopicCommentId() {
		return topicCommentId;
	}
	public void setTopicCommentId(int topicCommentId) {
		this.topicCommentId = topicCommentId;
	}
	
	public int getTopicCommentUId() {
		return topicCommentUId;
	}
	public void setTopicCommentUId(int topicCommentUId) {
		this.topicCommentUId = topicCommentUId;
	}
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	public String getTopicCommentContent(){
		return topicCommentContent;
	}
	public void setTopicCommentContent(String topicCommentContent){
		this.topicCommentContent = topicCommentContent;
	}
	
	public String getTopicCommentDateTime(){
		return topicCommentDateTime;
	}
	public void setTopicCommentDateTime(String topicCommentDateTime){
		this.topicCommentDateTime = topicCommentDateTime;
	}
	
	public int getTopicCommentLikeNum() {
		return topicCommentLikeNum;
	}
	public void setTopicCommentLikeNum(int topicCommentLikeNum) {
		this.topicCommentLikeNum = topicCommentLikeNum;
	}
}