package com.demo.bean;

public class TopicReplyBean{
	private int topicReplyId;

	private int toCommentId;
	
	private String fromUserName;
	
	private String toUserName;
	
	private String topicReplyContent;
	
	private String topicReplyDateTime;
	
	private int topicReplyLikeNum;
	
	public int getTopicReplyId() {
		return topicReplyId;
	}
	public void setTopicReplyId(int topicReplyId) {
		this.topicReplyId = topicReplyId;
	}
	
	public int getToCommentId() {
		return toCommentId;
	}
	public void setToCommentId(int toCommentId) {
		this.toCommentId = toCommentId;
	}
	
	public String getFromUserName(){
		return fromUserName;
	}
	public void setFromUserName(String fromUserName){
		this.fromUserName = fromUserName;
	}
	
	public String getToUserName(){
		return toUserName;
	}
	public void setToUserName(String toUserName){
		this.toUserName = toUserName;
	}
	
	public String getTopicReplyContent(){
		return topicReplyContent;
	}
	public void setTopicReplyContent(String topicReplyContent){
		this.topicReplyContent = topicReplyContent;
	}
	
	public String getTopicReplyDateTime(){
		return topicReplyDateTime;
	}
	public void setTopicReplyDateTime(String topicReplyDateTime){
		this.topicReplyDateTime = topicReplyDateTime;
	}
	
	public int getTopicReplyLikeNum() {
		return topicReplyLikeNum;
	}
	public void setTopicReplyLikeNum(int topicReplyLikeNum) {
		this.topicReplyLikeNum = topicReplyLikeNum;
	}
}