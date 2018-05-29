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

import com.demo.bean.PostBean;
import com.demo.service.PostService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/post")
public class PostController
{
	@Autowired
	private PostService postService;

	@RequestMapping("/selectAllPost")
	@ResponseBody
	public Map<String, Object> selectAllPost()
	{
		List<PostBean> selectAllPostList= postService.selectAllPost();
		return ResponseMapUtil.responseSuccess(selectAllPostList);
	}
	
	@RequestMapping("/queryPostById")
	@ResponseBody
	public Map<String, Object> queryPostById(@RequestParam int postId)
	{
		PostBean queryPostByIdResult = postService.queryPostById(postId);
		return ResponseMapUtil.responseSuccess(queryPostByIdResult);
	}
	

}
