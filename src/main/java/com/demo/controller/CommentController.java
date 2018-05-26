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

import com.demo.bean.CommentBean;
import com.demo.service.CommentService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/comment")
public class CommentController
{
	@Autowired
	private CommentService commentService;

	
	@RequestMapping("/queryCommentByPoetryId")
	@ResponseBody
	public Map<String, Object> queryCommentByPoetryId(@RequestParam int poetryId)
	{
		List<CommentBean> commentBeanList = commentService.queryCommentByPoetryId(poetryId);
		if(commentBeanList == null){
			return ResponseMapUtil.responseSuccess("null");
		}else{
			return ResponseMapUtil.responseSuccess(commentBeanList);
		}
		
	}
	
	@RequestMapping("/insertComment")
	@ResponseBody
	public Map<String, Object> insertComment(@RequestParam int poetryId, @RequestParam int commentUId, 
			@RequestParam String commentContent,@RequestParam String commentDateTime, @RequestParam int commentLikeNum)
	{
		int insertCommentResult = commentService.insertComment(poetryId, commentUId, commentContent, commentDateTime, commentLikeNum);
		switch(insertCommentResult){
			case 0:
				return ResponseMapUtil.responseError("评论失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("评论成功");
			default:
				return ResponseMapUtil.responseError("未知评论错误！");
		}
	}
	
	@RequestMapping("/addCommentLikeNum")
	@ResponseBody
	public Map<String, Object> addCommentLikeNum(@RequestParam int commentId)
	{
		int addCommentLikeNumResult = commentService.addCommentLikeNum(commentId);
		switch(addCommentLikeNumResult){
			case 0:
				return ResponseMapUtil.responseError("点赞失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("点赞成功");
			default:
				return ResponseMapUtil.responseError("未知点赞错误！");
		}
	}
	
	@RequestMapping("/getCommentSortByDatetime")
	@ResponseBody
	public Map<String, Object> getCommentSortByDatetime()
	{
		List<CommentBean> getCommentSortByDatetimeResult = commentService.getCommentSortByDatetime();
		return ResponseMapUtil.responseSuccess(getCommentSortByDatetimeResult);
	}
	
}
