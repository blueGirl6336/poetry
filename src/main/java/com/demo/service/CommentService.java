package com.demo.service;

import java.util.List;

import com.demo.bean.CommentBean;
import com.demo.pojo.Comment;

//import java.util.List;

/**
 * 用户登入登出接口
 * @content:
 */
public interface CommentService{
	/**
	 * 根据 诗词id 查询该诗词的评论
	 * @param poetryId
	 * @return
	 */
	public List<CommentBean> queryCommentByPoetryId(int poetryId);

	/**
	 * 插入新评论
	 * @param poetryId
	 * @return
	 */
	public int insertComment(int poetryId, int commentUId, String commentContent,
			String commentDateTime, int commentLikeNum);
	
	/**
	 * 给某评论的点赞数+1
	 * @param commentId
	 * @return
	 */
	public int addCommentLikeNum(int commentId);

}