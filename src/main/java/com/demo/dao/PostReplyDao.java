package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.PostReply;
//import com.demo.util.PageCalculate;

public interface PostReplyDao {
	/**
	 * 根据 评论id 获取回复列表
	 * @param commentId
	 * @return
	 */
	public List<PostReply> queryPostReplyByCommentId(int postCommentId);
	
	/**
	 * 增加回复
	 * @param poetryId
	 * @return
	 */
	public int insertPostReply(PostReply postReply);
	
	/**
	 * 增加回复点赞数
	 * @param replyId
	 * @return
	 */
	public int addPostReplyLikeNum(int postReplyId);
}