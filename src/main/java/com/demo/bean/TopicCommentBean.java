package com.demo.bean;

import java.util.List;

public class TopicCommentBean{
	private int topicCommentId;

	private int topicCommentUId;
	
	private String topicCommentUserName;
	
	private int topicId;
	
	private String topicCommentContent;
	
	private String topicCommentDateTime;
	
	private int topicCommentLikeNum;
	
	private List<TopicReplyBean> topicReplyBeanList;
	
	public int getTopicCommentId() {
		return topicCommentId;
	}
	public void setTopicCommentId(int topicCommentId) {
		this.topicCommentId = topicCommentId;
	}
	
	public int getTopicCommentUId() {
		return topicCommentUId;
	}
	public void setTopicCommentUId(int topicCommentUId) {
		this.topicCommentUId = topicCommentUId;
	}
	
	public String getTopicCommentUserName(){
		return topicCommentUserName;
	}
	public void setTopicCommentUserName(String topicCommentUserName){
		this.topicCommentUserName = topicCommentUserName;
	}
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	public String getTopicCommentContent(){
		return topicCommentContent;
	}
	public void setTopicCommentContent(String topicCommentContent){
		this.topicCommentContent = topicCommentContent;
	}
	
	public String getTopicCommentDateTime(){
		return topicCommentDateTime;
	}
	public void setTopicCommentDateTime(String topicCommentDateTime){
		this.topicCommentDateTime = topicCommentDateTime;
	}
	
	public int getTopicCommentLikeNum() {
		return topicCommentLikeNum;
	}
	public void setTopicCommentLikeNum(int topicCommentLikeNum) {
		this.topicCommentLikeNum = topicCommentLikeNum;
	}
	
	public List<TopicReplyBean> getTopicReplyBeanList() {
		return topicReplyBeanList;
	}
	public void setTopicReplyBeanList(List<TopicReplyBean> topicReplyBeanList) {
		this.topicReplyBeanList = topicReplyBeanList;
	}
}