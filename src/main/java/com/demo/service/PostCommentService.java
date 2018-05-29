package com.demo.service;

import java.util.List;

import com.demo.bean.PostCommentBean;
import com.demo.pojo.PostComment;

//import java.util.List;

/**
 * 用户登入登出接口
 * @content:
 */
public interface PostCommentService{
	/**
	 * 根据帖子id查找帖子评论
	 * @param postId
	 * @return
	 */
	public List<PostCommentBean> queryPostCommentByPostId(int postId);

	/**
	 * 插入一条新评论
	 * @param postId
	 * @param postCommentUId
	 * @param postCommentContent
	 * @param postCommentDateTime
	 * @param postCommentLikeNum
	 * @return
	 */
	public int insertPostComment(int postId, int postCommentUId, String postCommentContent,
			String postCommentDateTime, int postCommentLikeNum);
	
	/**
	 * 给某评论的点赞数+1
	 * @param postCommentId
	 * @return
	 */
	public int addPostCommentLikeNum(int postCommentId);

}