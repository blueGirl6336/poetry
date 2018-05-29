package com.demo.service.impl;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.PostReplyBean;
import com.demo.dao.PostReplyDao;
import com.demo.dao.UserDao;
import com.demo.pojo.PostComment;
import com.demo.pojo.PostReply;
import com.demo.service.PostReplyService;


@Service
public class PostReplyServiceImpl implements PostReplyService{

	@Autowired
	private PostReplyDao postReplyDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<PostReplyBean> queryPostReplyByCommentId(int postCommentId){
		List<PostReply> postReplyList = postReplyDao.queryPostReplyByCommentId(postCommentId);
		List<PostReplyBean> postreplyBeanList = new ArrayList<PostReplyBean>();
		System.out.println("renter get reply");
		if(postReplyList == null){
			System.out.println("replyList length: 0");
			return null;
		}else{
			for(PostReply postReply: postReplyList){
				PostReplyBean postReplyBean = new PostReplyBean();
				postReplyBean.setPostReplyId(postReply.getPostReplyId());
				postReplyBean.setFromUserName(userDao.queryUserNameById(postReply.getFromUId()));
				postReplyBean.setToUserName(userDao.queryUserNameById(postReply.getToUId()));
				postReplyBean.setPostReplyContent(postReply.getPostReplyContent().replaceAll("\n", "<br>"));
				postReplyBean.setPostReplyDateTime(postReply.getPostReplyDateTime());
				postReplyBean.setPostReplyLikeNum(postReply.getPostReplyLikeNum());
				postreplyBeanList.add(postReplyBean);
			}
			return postreplyBeanList;
		}
	}
	
	@Override
	public int insertPostReply(int toCommentId, int fromUId, int toUId, 
			String postReplyContent, String postReplyDateTime, int postReplyLikeNum)
	{
		PostReply postReply = new PostReply();
		postReply.setToCommentId(toCommentId);
		postReply.setFromUId(fromUId);
		postReply.setToUId(toUId);
		postReply.setPostReplyContent(postReplyContent);
		postReply.setPostReplyDateTime(postReplyDateTime);
		postReply.setPostReplyLikeNum(postReplyLikeNum);
		try
		{
			postReplyDao.insertPostReply(postReply);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	@Override
	public int addPostReplyLikeNum(int postReplyId)
	{
		try
		{
			postReplyDao.addPostReplyLikeNum(postReplyId);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}