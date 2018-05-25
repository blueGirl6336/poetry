package com.demo.pojo;

public class Comment{
	private int commentId;

	private int commentUId;
	
	private int poetryId;
	
	private String commentContent;
	
	private String commentDateTime;
	
	private int commentLikeNum;
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	
	public int getCommentUId() {
		return commentUId;
	}
	public void setCommentUId(int commentUId) {
		this.commentUId = commentUId;
	}
	
	public int getPoetryId() {
		return poetryId;
	}
	public void setPoetryId(int poetryId) {
		this.poetryId = poetryId;
	}
	
	public String getCommentContent(){
		return commentContent;
	}
	public void setCommentContent(String commentContent){
		this.commentContent = commentContent;
	}
	
	public String getCommentDateTime(){
		return commentDateTime;
	}
	public void setCommentDateTime(String commentDateTime){
		this.commentDateTime = commentDateTime;
	}
	
	public int getCommentLikeNum() {
		return commentLikeNum;
	}
	public void setCommentLikeNum(int commentLikeNum) {
		this.commentLikeNum = commentLikeNum;
	}
}