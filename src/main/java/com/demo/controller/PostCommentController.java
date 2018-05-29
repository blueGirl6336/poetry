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

import com.demo.bean.PostCommentBean;
import com.demo.service.PostCommentService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/postComment")
public class PostCommentController
{
	@Autowired
	private PostCommentService postCommentService;

	
//	@RequestMapping("/queryPostCommentByPostId")
//	@ResponseBody
//	public Map<String, Object> queryPostCommentByPostId(@RequestParam int poetryId)
//	{
//		List<CommentBean> commentBeanList = commentService.queryCommentByPoetryId(poetryId);
//		if(commentBeanList == null){
//			return ResponseMapUtil.responseSuccess("null");
//		}else{
//			return ResponseMapUtil.responseSuccess(commentBeanList);
//		}
//		
//	}
	
	@RequestMapping("/insertPostComment")
	@ResponseBody
	public Map<String, Object> insertPostComment(@RequestParam int postId, @RequestParam int postCommentUId, 
			@RequestParam String postCommentContent,@RequestParam String postCommentDateTime, @RequestParam int postCommentLikeNum)
	{
		int insertPostCommentResult = postCommentService.insertPostComment(postId, postCommentUId, postCommentContent, postCommentDateTime, postCommentLikeNum);
		switch(insertPostCommentResult){
			case 0:
				return ResponseMapUtil.responseError("评论失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("评论成功");
			default:
				return ResponseMapUtil.responseError("未知评论错误！");
		}
	}
	
	@RequestMapping("/addPostCommentLikeNum")
	@ResponseBody
	public Map<String, Object> addPostCommentLikeNum(@RequestParam int postCommentId)
	{
		int addPostCommentLikeNumResult = postCommentService.addPostCommentLikeNum(postCommentId);
		switch(addPostCommentLikeNumResult){
			case 0:
				return ResponseMapUtil.responseError("点赞失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("点赞成功");
			default:
				return ResponseMapUtil.responseError("未知点赞错误！");
		}
	}
	
}
