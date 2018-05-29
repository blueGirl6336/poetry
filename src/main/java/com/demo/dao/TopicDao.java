package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.Topic;
//import com.demo.util.PageCalculate;

public interface TopicDao {
	
	/**
	 * 获取所有话题
	 * @return
	 */
	public List<Topic> selectAllTopic();
	
	
	/**
	 * 根据话题id获取话题
	 * @param topicId
	 * @return
	 */
	public Topic queryTopicById(int topicId);

}