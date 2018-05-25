package com.demo.service;

import java.util.List;

import com.demo.bean.ReplyBean;

public interface ReplyService{
	/**
	 * 根据 诗词id 查询该诗词的评论
	 * @param poetryId
	 * @return
	 */
	public List<ReplyBean> queryReplyByCommentId(int commentId);
	
	/**
	 * 插入新的回复
	 * @param toCommentId
	 * @param fromUId
	 * @param toUId
	 * @param replyContent
	 * @param replyDateTime
	 * @param replyLikeNum
	 * @return
	 */
	public int insertReply(int toCommentId, int fromUId, int toUId, String replyContent, 
			String replyDateTime, int replyLikeNum);
	
	/**
	 * 增加回复点赞数
	 * @param replyId
	 * @return
	 */
	public int addReplyLikeNum(int replyId);


}