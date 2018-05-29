package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.TopicComment;
//import com.demo.util.PageCalculate;

public interface TopicCommentDao {
	/**
	 * 根据话题id获取对应的评论信息
	 * @param poetryId
	 * @return
	 */
	public List<TopicComment> queryTopicCommentByTopicId(int topicId);
	
	/**
	 * 插入comment
	 * @param poetryId
	 */
	public int insertTopicComment(TopicComment topicComment);
	
	/**
	 * 增加点赞数
	 * @param likeNum
	 * @return
	 */
	public int addTopicCommentLikeNum(int topicCommentId);
	
	/**
	 * 获取所有评论
	 * @return
	 */
	//public List<topicComment> selectAllComment();
	
}