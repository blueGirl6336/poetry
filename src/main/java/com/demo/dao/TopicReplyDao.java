package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.TopicReply;
//import com.demo.util.PageCalculate;

public interface TopicReplyDao {
	/**
	 * 根据 评论id 获取回复列表
	 * @param commentId
	 * @return
	 */
	public List<TopicReply> queryTopicReplyByCommentId(int topicCommentId);
	
	/**
	 * 增加回复
	 * @param poetryId
	 * @return
	 */
	public int insertTopicReply(TopicReply topicReply);
	
	/**
	 * 增加回复点赞数
	 * @param replyId
	 * @return
	 */
	public int addTopicReplyLikeNum(int topicReplyId);
}