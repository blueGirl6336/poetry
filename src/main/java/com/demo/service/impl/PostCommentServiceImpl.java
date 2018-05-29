package com.demo.service.impl;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import javax.annotation.Resource;
//import org.springframework.stereotype.Service;

import com.demo.bean.PostCommentBean;
import com.demo.bean.PostReplyBean;
import com.demo.dao.UserDao;
import com.demo.dao.PostCommentDao;
import com.demo.dao.PostDao;
import com.demo.pojo.PostComment;
import com.demo.service.PostCommentService;
import com.demo.service.PostReplyService;


@Service
public class PostCommentServiceImpl implements PostCommentService{
	@Autowired
	private PostCommentDao postCommentDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PostDao postDao;
	
	@Autowired
	private PostReplyService postReplyService;
	
	@Override
	public List<PostCommentBean> queryPostCommentByPostId(int postId){
		List<PostComment> postCommentList = postCommentDao.queryPostCommentByPostId(postId);
		List<PostCommentBean> postCommentBeanList = new ArrayList<PostCommentBean>();
		System.out.println("enter get comment");
		if(postCommentList == null){
			return null;
		}else{
			for(PostComment postComment: postCommentList){
				PostCommentBean postCommentBean = new PostCommentBean();
				postCommentBean.setPostCommentId(postComment.getPostCommentId());
				postCommentBean.setPostId(postComment.getPostId());
				postCommentBean.setPostCommentUId(postComment.getPostCommentUId());
				postCommentBean.setPostCommentUserName(userDao.queryUserNameById(postComment.getPostCommentUId()));
				postCommentBean.setPostCommentContent(postComment.getPostCommentContent().replaceAll("\n", "<br>"));
				postCommentBean.setPostCommentDateTime(postComment.getPostCommentDateTime());
				postCommentBean.setPostCommentLikeNum(postComment.getPostCommentLikeNum());
				postCommentBean.setReplyBeanList(postReplyService.queryPostReplyByCommentId(postComment.getPostCommentId()));
				postCommentBeanList.add(postCommentBean);
				System.out.println("replyList length" + postCommentBean.getPostReplyBeanList().size());
			}
			return postCommentBeanList;
		}
	}
	
	@Override
	public int insertPostComment(int postId, int postCommentUId, String postCommentContent,
			String postCommentDateTime, int postCommentLikeNum)
	{
		PostComment postComment = new PostComment();
		postComment.setPostId(postId);
		postComment.setPostCommentUId(postCommentUId);
		postComment.setPostCommentContent(postCommentContent);
		postComment.setPostCommentDateTime(postCommentDateTime);
		postComment.setPostCommentLikeNum(postCommentLikeNum);
		try
		{
			postCommentDao.insertPostComment(postComment);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	@Override
	public int addPostCommentLikeNum(int postCommentId)
	{
		try
		{
			postCommentDao.addPostCommentLikeNum(postCommentId);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}