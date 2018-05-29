package com.demo.pojo;

public class PostComment{
	private int postCommentId;

	private int postCommentUId;
	
	private int postId;
	
	private String postCommentContent;
	
	private String postCommentDateTime;
	
	private int postCommentLikeNum;
	
	public int getPostCommentId() {
		return postCommentId;
	}
	public void setPostCommentId(int postCommentId) {
		this.postCommentId = postCommentId;
	}
	
	public int getPostCommentUId() {
		return postCommentUId;
	}
	public void setPostCommentUId(int postCommentUId) {
		this.postCommentUId = postCommentUId;
	}
	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	public String getPostCommentContent(){
		return postCommentContent;
	}
	public void setPostCommentContent(String postCommentContent){
		this.postCommentContent = postCommentContent;
	}
	
	public String getPostCommentDateTime(){
		return postCommentDateTime;
	}
	public void setPostCommentDateTime(String postCommentDateTime){
		this.postCommentDateTime = postCommentDateTime;
	}
	
	public int getPostCommentLikeNum() {
		return postCommentLikeNum;
	}
	public void setPostCommentLikeNum(int postCommentLikeNum) {
		this.postCommentLikeNum = postCommentLikeNum;
	}
}