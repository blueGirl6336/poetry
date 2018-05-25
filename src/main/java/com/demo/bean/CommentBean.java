package com.demo.bean;

import java.util.List;

import com.demo.bean.ReplyBean;

public class CommentBean{
	private int commentId;

	private int poetryId;
	
	private int commentUId;
	
	private String commentUserName;
	
	private String commentContent;
	
	private String commentDateTime;
	
	private int commentLikeNum;
	
	private List <ReplyBean> replyBeanList;
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	
	public int getPoetryId() {
		return poetryId;
	}
	public void setPoetryId(int poetryId) {
		this.poetryId = poetryId;
	}
	
	public int getCommentUId() {
		return commentUId;
	}
	public void setCommentUId(int commentUId) {
		this.commentUId = commentUId;
	}
	
	public String getCommentUserName(){
		return commentUserName;
	}
	public void setCommentUserName(String commentUserName){
		this.commentUserName = commentUserName;
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
	
	public List<ReplyBean> getReplyBeanList() {
		return replyBeanList;
	}
	public void setReplyBeanList(List<ReplyBean> replyBeanList) {
		this.replyBeanList = replyBeanList;
	}
}