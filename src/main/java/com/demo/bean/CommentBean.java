package com.demo.bean;

import java.util.List;

import com.demo.bean.ReplyBean;

public class CommentBean implements Comparable<CommentBean>{
	private int commentId;

	private int poetryId;
	
	private String poetryName;
	
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
	
	public String getPoetryName(){
		return poetryName;
	}
	public void setPoetryName(String poetryName){
		this.poetryName = poetryName;
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
	
	@Override  
    public int compareTo(CommentBean commentBean) { 
		int thisYear = Integer.parseInt(this.getCommentDateTime().split(" ")[0].split("-")[0]);
		int thisMonth = Integer.parseInt(this.getCommentDateTime().split(" ")[0].split("-")[1]);
		int thisDay = Integer.parseInt(this.getCommentDateTime().split(" ")[0].split("-")[2]);
		
		int thisHour = Integer.parseInt(this.getCommentDateTime().split(" ")[1].split(":")[0]);
		int thisMinute = Integer.parseInt(this.getCommentDateTime().split(" ")[1].split(":")[1]);
		int thisSecond = Integer.parseInt(this.getCommentDateTime().split(" ")[1].split(":")[2]);
		
		int commentBeanYear = Integer.parseInt(commentBean.getCommentDateTime().split(" ")[0].split("-")[0]);
		int commentBeanMonth = Integer.parseInt(commentBean.getCommentDateTime().split(" ")[0].split("-")[1]);
		int commentBeanDay = Integer.parseInt(commentBean.getCommentDateTime().split(" ")[0].split("-")[2]);
		
		int commentBeanHour = Integer.parseInt(commentBean.getCommentDateTime().split(" ")[1].split(":")[0]);
		int commentBeanMinute = Integer.parseInt(commentBean.getCommentDateTime().split(" ")[1].split(":")[1]);
		int commentBeanSecond = Integer.parseInt(commentBean.getCommentDateTime().split(" ")[1].split(":")[2]);
        
		int i = commentBeanYear - thisYear;//先按照年份  
        if(i == 0){  
            i = 0 - (commentBeanMonth - thisMonth);
            if(i == 0){
            	i = commentBeanDay - thisDay;
            	if(i == 0){
            		i = commentBeanHour - thisHour;
            		if(i == 0){
            			i = commentBeanMinute - thisMinute;
            			if(i == 0){
            				i = commentBeanSecond - thisSecond;
            				return i;
            			}
            			return i;
            		}
            		return i;
            	}
            	return i;
            }
            return i;
        }  
        return i;  
    }  
}