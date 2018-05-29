package com.demo.bean;

public class PostReplyBean{
	private int postReplyId;

	private int toCommentId;
	
	private String fromUserName;
	
	private String toUserName;
	
	private String postReplyContent;
	
	private String postReplyDateTime;
	
	private int postReplyLikeNum;
	
	public int getPostReplyId() {
		return postReplyId;
	}
	public void setPostReplyId(int postReplyId) {
		this.postReplyId = postReplyId;
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
	
	public String getPostReplyContent(){
		return postReplyContent;
	}
	public void setPostReplyContent(String postReplyContent){
		this.postReplyContent = postReplyContent;
	}
	
	public String getPostReplyDateTime(){
		return postReplyDateTime;
	}
	public void setPostReplyDateTime(String postReplyDateTime){
		this.postReplyDateTime = postReplyDateTime;
	}
	
	public int getPostReplyLikeNum() {
		return postReplyLikeNum;
	}
	public void setPostReplyLikeNum(int postReplyLikeNum) {
		this.postReplyLikeNum = postReplyLikeNum;
	}
}