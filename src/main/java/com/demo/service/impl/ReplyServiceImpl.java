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

import com.demo.bean.ReplyBean;
import com.demo.dao.ReplyDao;
import com.demo.dao.UserDao;
import com.demo.pojo.Comment;
import com.demo.pojo.Reply;
import com.demo.service.ReplyService;


@Service
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private HttpSession session;

	@Autowired
	private ReplyDao replyDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<ReplyBean> queryReplyByCommentId(int commentId){
		List<Reply> replyList = replyDao.queryReplyByCommentId(commentId);
		List<ReplyBean> replyBeanList = new ArrayList<ReplyBean>();
		if(replyList == null){
			return null;
		}else{
			for(Reply reply: replyList){
				ReplyBean replyBean = new ReplyBean();
				replyBean.setReplyId(reply.getReplyId());
				replyBean.setFromUserName(userDao.queryUserNameById(reply.getFromUId()));
				replyBean.setToUserName(userDao.queryUserNameById(reply.getToUId()));
				replyBean.setReplyContent(reply.getReplyContent().replaceAll("\n", "<br>"));
				replyBean.setReplyDateTime(reply.getReplyDateTime());
				replyBean.setReplyLikeNum(reply.getReplyLikeNum());
				replyBeanList.add(replyBean);
			}
			return replyBeanList;
		}
	}
	
	@Override
	public int insertReply(int toCommentId, int fromUId, int toUId, 
			String replyContent, String replyDateTime, int replyLikeNum)
	{
		Reply reply = new Reply();
		reply.setToCommentId(toCommentId);
		reply.setFromUId(fromUId);
		reply.setToUId(toUId);
		reply.setReplyContent(replyContent);
		reply.setReplyDateTime(replyDateTime);
		reply.setReplyLikeNum(replyLikeNum);
		try
		{
			replyDao.insertReply(reply);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	@Override
	public int addReplyLikeNum(int replyId)
	{
		try
		{
			replyDao.addReplyLikeNum(replyId);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}