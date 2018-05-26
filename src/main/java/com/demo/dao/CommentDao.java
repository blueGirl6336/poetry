package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.Comment;
//import com.demo.util.PageCalculate;

public interface CommentDao {
	/**
	 * 根据诗词id获取对应的评论信息
	 * @param poetryId
	 * @return
	 */
	public List<Comment> queryCommentByPoetryId(int poetryId);
	
	/**
	 * 插入comment
	 * @param poetryId
	 */
	public int insertComment(Comment comment);
	
	/**
	 * 增加点赞数
	 * @param likeNum
	 * @return
	 */
	public int addCommentLikeNum(int commentId);
	
	/**
	 * 获取所有评论
	 * @return
	 */
	public List<Comment> selectAllComment();
	
}