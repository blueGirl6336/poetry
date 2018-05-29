package com.demo.bean;

import java.util.List;

//import org.hibernate.validator.constraints.NotEmpty;

public class PostBean implements Comparable<PostBean>{

	private int postId;
	
	private int postUId;
	
	private String postUserName;

	private String postTitle;

	private String postContent;
	
	private String postDateTime;
	
	private List<PostCommentBean> postCommentBeanList;
	
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	public int getPostUId() {
		return postUId;
	}
	public void setPostUId(int postUId) {
		this.postUId = postUId;
	}
	
	public String getPostUserName() {
		return postUserName;
	}
	public void setPostUserName(String postUserName) {
		this.postUserName = postUserName;
	}
	
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	
	public String getPostDateTime() {
		return postDateTime;
	}
	public void setPostDateTime(String postDateTime) {
		this.postDateTime = postDateTime;
	}
	
	public List<PostCommentBean> getPostCommentBeanList() {
		return postCommentBeanList;
	}
	public void setPostCommentBeanList(List<PostCommentBean> postCommentBeanList) {
		this.postCommentBeanList = postCommentBeanList;
	}
	
	@Override  
    public int compareTo(PostBean postBean) { 
		int thisYear = Integer.parseInt(this.getPostDateTime().split(" ")[0].split("-")[0]);
		int thisMonth = Integer.parseInt(this.getPostDateTime().split(" ")[0].split("-")[1]);
		int thisDay = Integer.parseInt(this.getPostDateTime().split(" ")[0].split("-")[2]);
		
		int thisHour = Integer.parseInt(this.getPostDateTime().split(" ")[1].split(":")[0]);
		int thisMinute = Integer.parseInt(this.getPostDateTime().split(" ")[1].split(":")[1]);
		int thisSecond = Integer.parseInt(this.getPostDateTime().split(" ")[1].split(":")[2]);
		
		int commentBeanYear = Integer.parseInt(postBean.getPostDateTime().split(" ")[0].split("-")[0]);
		int commentBeanMonth = Integer.parseInt(postBean.getPostDateTime().split(" ")[0].split("-")[1]);
		int commentBeanDay = Integer.parseInt(postBean.getPostDateTime().split(" ")[0].split("-")[2]);
		
		int commentBeanHour = Integer.parseInt(postBean.getPostDateTime().split(" ")[1].split(":")[0]);
		int commentBeanMinute = Integer.parseInt(postBean.getPostDateTime().split(" ")[1].split(":")[1]);
		int commentBeanSecond = Integer.parseInt(postBean.getPostDateTime().split(" ")[1].split(":")[2]);
        
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