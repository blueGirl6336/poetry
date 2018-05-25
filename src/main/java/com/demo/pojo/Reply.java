package com.demo.pojo;

public class Reply{
	private int replyId;

	private int toCommentId;
	
	private int fromUId;

	private int toUId;
	
	private String replyContent;
	
	private String replyDateTime;
	
	private int replyLikeNum;
	
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
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