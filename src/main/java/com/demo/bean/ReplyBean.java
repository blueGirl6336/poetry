package com.demo.bean;

public class ReplyBean{
	private int replyId;

	private String fromUserName;
	
	private String toUserName;
	
	private String replyContent;
	
	private String replyDateTime;
	
	private int replyLikeNum;
	
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
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
	
	public String getReplyContent(){
		return replyContent;
	}
	public void setReplyContent(String replyContent){
		this.replyContent = replyContent;
	}
	
	public String getReplyDateTime(){
		return replyDateTime;
	}
	public void setReplyDateTime(String replyDateTime){
		this.replyDateTime = replyDateTime;
	}
	
	public int getReplyLikeNum() {
		return replyLikeNum;
	}
	public void setReplyLikeNum(int replyLikeNum) {
		this.replyLikeNum = replyLikeNum;
	}
}