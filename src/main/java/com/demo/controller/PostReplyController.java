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

import com.demo.bean.PostReplyBean;
import com.demo.service.PostReplyService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/postReply")
public class PostReplyController
{
	@Autowired
	private PostReplyService postReplyService;

	@RequestMapping("/insertPostReply")
	@ResponseBody
	public Map<String, Object> insertPostReply(@RequestParam int toCommentId, @RequestParam int fromUId, @RequestParam int toUId, 
			@RequestParam String postReplyContent, @RequestParam String postReplyDateTime, @RequestParam int postReplyLikeNum)
	{
		int insertPostReplyResult = postReplyService.insertPostReply(toCommentId, fromUId, toUId, postReplyContent, postReplyDateTime, postReplyLikeNum);
		switch(insertPostReplyResult){
			case 0:
				return ResponseMapUtil.responseError("回复失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("回复成功");
			default:
				return ResponseMapUtil.responseError("未知回复错误！");
		}
	}
	
	@RequestMapping("/addPostReplyLikeNum")
	@ResponseBody
	public Map<String, Object> addPostReplyLikeNum(@RequestParam int postReplyId)
	{
		int addPostReplyLikeNumResult = postReplyService.addPostReplyLikeNum(postReplyId);
		switch(addPostReplyLikeNumResult){
			case 0:
				return ResponseMapUtil.responseError("点赞失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("点赞成功");
			default:
				return ResponseMapUtil.responseError("未知点赞错误！");
		}
	}
	

}
