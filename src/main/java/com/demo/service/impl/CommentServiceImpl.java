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

import com.demo.bean.CommentBean;
import com.demo.bean.ReplyBean;
import com.demo.dao.UserDao;
import com.demo.dao.CommentDao;
import com.demo.dao.PoetryDao;
import com.demo.pojo.Comment;
import com.demo.service.CommentService;
import com.demo.service.ReplyService;


@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private HttpSession session;

	@Autowired
	private CommentDao commentDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PoetryDao poetryDao;
	
	@Autowired
	private ReplyService replyService;
	
	@Override
	public List<CommentBean> queryCommentByPoetryId(int poetryId){
		List<Comment> commentList = commentDao.queryCommentByPoetryId(poetryId);
		List<CommentBean> commentBeanList = new ArrayList<CommentBean>();
		if(commentList == null){
			return null;
		}else{
			for(Comment comment: commentList){
				CommentBean commentBean = new CommentBean();
				commentBean.setCommentId(comment.getCommentId());
				commentBean.setPoetryId(comment.getPoetryId());
				commentBean.setCommentUId(comment.getCommentUId());
				commentBean.setCommentUserName(userDao.queryUserNameById(comment.getCommentUId()));
				commentBean.setCommentContent(comment.getCommentContent().replaceAll("\n", "<br>"));
				commentBean.setCommentDateTime(comment.getCommentDateTime());
				commentBean.setCommentLikeNum(comment.getCommentLikeNum());
				commentBean.setReplyBeanList(replyService.queryReplyByCommentId(comment.getCommentId()));
				commentBeanList.add(commentBean);
			}
			return commentBeanList;
		}
	}
	
	@Override
	public int insertComment(int poetryId, int commentUId, String commentContent, 
			String commentDateTime, int commentLikeNum)
	{
		Comment comment = new Comment();
		comment.setPoetryId(poetryId);
		comment.setCommentUId(commentUId);
		comment.setCommentContent(commentContent);
		comment.setCommentDateTime(commentDateTime);
		comment.setCommentLikeNum(commentLikeNum);
		try
		{
			commentDao.insertComment(comment);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	@Override
	public int addCommentLikeNum(int commentId)
	{
		try
		{
			commentDao.addCommentLikeNum(commentId);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	@Override
	public List<CommentBean> getCommentSortByDatetime()
	{
		List <Comment> commentList = commentDao.selectAllComment();
		List<CommentBean> commentBeanList = new ArrayList<CommentBean>();
		for(Comment comment : commentList){
			CommentBean commentBean = new CommentBean();
			commentBean.setCommentId(comment.getCommentId());
			commentBean.setPoetryId(comment.getPoetryId());
			commentBean.setPoetryName(poetryDao.queryPoetryById(comment.getPoetryId()).getMingcheng());
			commentBean.setCommentUId(comment.getCommentUId());
			commentBean.setCommentUserName(userDao.queryUserNameById(comment.getCommentUId()));
			commentBean.setCommentContent(comment.getCommentContent().replaceAll("\n", "<br>"));
			commentBean.setCommentDateTime(comment.getCommentDateTime());
			commentBean.setCommentLikeNum(comment.getCommentLikeNum());
			commentBean.setReplyBeanList(replyService.queryReplyByCommentId(comment.getCommentId()));
			commentBeanList.add(commentBean);
		}
		Collections.sort(commentBeanList);
		return commentBeanList;
	}
}