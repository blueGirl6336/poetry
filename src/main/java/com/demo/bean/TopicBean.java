package com.demo.bean;

import java.util.List;

//import org.hibernate.validator.constraints.NotEmpty;

public class TopicBean implements Comparable<TopicBean>{

	private int topicId;
	
	private int topicTeamId;
	
	private String topicTeamName;

	private String topicTitle;

	private String topicContent;
	
	private String topicDateTime;
	
	private List<TopicCommentBean> topicCommentBeanList;
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	public int getTopicTeamId() {
		return topicTeamId;
	}
	public void setTopicTeamId(int topicTeamId) {
		this.topicTeamId = topicTeamId;
	}
	
	public String getTopicTeamName() {
		return topicTeamName;
	}
	public void setTopicTeamName(String topicTeamName) {
		this.topicTeamName = topicTeamName;
	}
	
	public String getTopicTitle() {
		return topicTitle;
	}
	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}
	
	public String getTopicContent() {
		return topicContent;
	}
	public void setTopicContent(String topicContent) {
		this.topicContent = topicContent;
	}
	
	public String getTopicDateTime() {
		return topicDateTime;
	}
	public void setTopicDateTime(String topicDateTime) {
		this.topicDateTime = topicDateTime;
	}
	
	public List<TopicCommentBean> getTopicCommentBeanList() {
		return topicCommentBeanList;
	}
	public void setTopicCommentBeanList(List<TopicCommentBean> topicCommentBeanList) {
		this.topicCommentBeanList = topicCommentBeanList;
	}
	
	@Override  
    public int compareTo(TopicBean topicBean) { 
		int thisYear = Integer.parseInt(this.getTopicDateTime().split(" ")[0].split("-")[0]);
		int thisMonth = Integer.parseInt(this.getTopicDateTime().split(" ")[0].split("-")[1]);
		int thisDay = Integer.parseInt(this.getTopicDateTime().split(" ")[0].split("-")[2]);
		
		int thisHour = Integer.parseInt(this.getTopicDateTime().split(" ")[1].split(":")[0]);
		int thisMinute = Integer.parseInt(this.getTopicDateTime().split(" ")[1].split(":")[1]);
		int thisSecond = Integer.parseInt(this.getTopicDateTime().split(" ")[1].split(":")[2]);
		
		int commentBeanYear = Integer.parseInt(topicBean.getTopicDateTime().split(" ")[0].split("-")[0]);
		int commentBeanMonth = Integer.parseInt(topicBean.getTopicDateTime().split(" ")[0].split("-")[1]);
		int commentBeanDay = Integer.parseInt(topicBean.getTopicDateTime().split(" ")[0].split("-")[2]);
		
		int commentBeanHour = Integer.parseInt(topicBean.getTopicDateTime().split(" ")[1].split(":")[0]);
		int commentBeanMinute = Integer.parseInt(topicBean.getTopicDateTime().split(" ")[1].split(":")[1]);
		int commentBeanSecond = Integer.parseInt(topicBean.getTopicDateTime().split(" ")[1].split(":")[2]);
        
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