package com.demo.pojo;

//import org.hibernate.validator.constraints.NotEmpty;

public class Post {

	private int postId;
	
	private int postUId;

	private String postTitle;

	private String postContent;
	
	private String postDateTime;
	
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
}