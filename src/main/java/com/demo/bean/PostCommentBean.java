package com.demo.bean;

import java.util.List;

public class PostCommentBean{
	private int postCommentId;

	private int postCommentUId;
	
	private String postCommentUserName;
	
	private int postId;
	
	private String postCommentContent;
	
	private String postCommentDateTime;
	
	private int postCommentLikeNum;
	
	private List<PostReplyBean> postReplyBeanList;
	
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
	
	public String getPostCommentUserName(){
		return postCommentUserName;
	}
	public void setPostCommentUserName(String postCommentUserName){
		this.postCommentUserName = postCommentUserName;
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
	
	public List<PostReplyBean> getPostReplyBeanList() {
		return postReplyBeanList;
	}
	public void setPostReplyBeanList(List<PostReplyBean> postReplyBeanList) {
		this.postReplyBeanList = postReplyBeanList;
	}
}