package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.Reply;
//import com.demo.util.PageCalculate;

public interface ReplyDao {
	/**
	 * 根据 评论id 获取回复列表
	 * @param commentId
	 * @return
	 */
	public List<Reply> queryReplyByCommentId(int commentId);
	
	/**
	 * 根据 诗词id 获取回复列表
	 * @param poetryId
	 * @return
	 */
	public List<Reply> queryReplyByPoetryId(int poetryId);
	
	/**
	 * 增加回复
	 * @param poetryId
	 * @return
	 */
	public int insertReply(Reply reply);
	
	/**
	 * 增加回复点赞数
	 * @param replyId
	 * @return
	 */
	public int addReplyLikeNum(int replyId);
}