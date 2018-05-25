package com.demo.controller;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.ReplyBean;
import com.demo.service.ReplyService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/reply")
public class ReplyController
{
	@Autowired
	private ReplyService replyService;

	@RequestMapping("/insertReply")
	@ResponseBody
	public Map<String, Object> insertReply(@RequestParam int toCommentId, @RequestParam int fromUId, @RequestParam int toUId, 
			@RequestParam String replyContent, @RequestParam String replyDateTime, @RequestParam int replyLikeNum)
	{
		int insertReplyResult = replyService.insertReply(toCommentId, fromUId, toUId, replyContent, replyDateTime, replyLikeNum);
		switch(insertReplyResult){
			case 0:
				return ResponseMapUtil.responseError("回复失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("回复成功");
			default:
				return ResponseMapUtil.responseError("未知回复错误！");
		}
	}
	
	@RequestMapping("/addReplyLikeNum")
	@ResponseBody
	public Map<String, Object> addReplyLikeNum(@RequestParam int replyId)
	{
		int addReplyLikeNumResult = replyService.addReplyLikeNum(replyId);
		switch(addReplyLikeNumResult){
			case 0:
				return ResponseMapUtil.responseError("点赞失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("点赞成功");
			default:
				return ResponseMapUtil.responseError("未知点赞错误！");
		}
	}
	
//	@RequestMapping("/addCommentLikeNum")
//	@ResponseBody
//	public Map<String, Object> addCommentLikeNum(@RequestParam int commentId)
//	{
//		int addCommentLikeNumResult = commentService.addCommentLikeNum(commentId);
//		switch(addCommentLikeNumResult){
//			case 0:
//				return ResponseMapUtil.responseError("点赞失败！");
//			case 1:
//				return ResponseMapUtil.responseSuccess("点赞成功");
//			default:
//				return ResponseMapUtil.responseError("未知点赞错误！");
//		}
//	}
	
}
