package com.demo.pojo;

public class PostReply{
	private int postReplyId;

	private int toCommentId;
	
	private int fromUId;

	private int toUId;
	
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