package com.demo.service;

import java.util.List;

import com.demo.bean.PostReplyBean;

public interface PostReplyService{
	/**
	 * 根据 评论id 查询该诗词的回复
	 * @param postCommentId
	 * @return
	 */
	public List<PostReplyBean> queryPostReplyByCommentId(int postCommentId);
	
	/**
	 * 插入新的回复
	 * @param toCommentId
	 * @param fromUId
	 * @param toUId
	 * @param postReplyContent
	 * @param postReplyDateTime
	 * @param postReplyLikeNum
	 * @return
	 */
	int insertPostReply(int toCommentId, int fromUId, int toUId, String postReplyContent, 
			String postReplyDateTime, int postReplyLikeNum);
	
	/**
	 * 增加点赞回复数
	 * @param postReplyId
	 * @return
	 */
	public int addPostReplyLikeNum(int postReplyId);


}