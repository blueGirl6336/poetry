package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.PostComment;
//import com.demo.util.PageCalculate;

public interface PostCommentDao {
	/**
	 * 根据帖子id获取对应的评论信息
	 * @param poetryId
	 * @return
	 */
	public List<PostComment> queryPostCommentByPostId(int postId);
	
	/**
	 * 插入comment
	 * @param poetryId
	 */
	public int insertPostComment(PostComment postComment);
	
	/**
	 * 增加点赞数
	 * @param likeNum
	 * @return
	 */
	public int addPostCommentLikeNum(int postCommentId);
	
	/**
	 * 获取所有评论
	 * @return
	 */
	//public List<PostComment> selectAllComment();
	
}