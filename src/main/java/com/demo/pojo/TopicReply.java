package com.demo.pojo;

public class TopicReply{
	private int topicReplyId;

	private int toCommentId;
	
	private int fromUId;

	private int toUId;
	
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
	
	public int getFromUId() {
		return fromUId;
	}
	public void setFromUId(int fromUId) {
		this.fromUId = fromUId;
	}
	
	public int getToUId() {
		return toUId;
	}
	public void setToUId(int toUId) {
		this.toUId = toUId;
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