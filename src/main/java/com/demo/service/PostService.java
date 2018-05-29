package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.bean.PostBean;
import com.demo.pojo.Post;

//import java.util.List;

//import com.demo.pojo.User;

public interface PostService{
	/**
	 * 获取所有帖子，并按时间由近及远排序
	 * @return
	 */
	public List<PostBean> selectAllPost();
	
	/**
	 * 根据帖子id获取帖子内容
	 * @param id
	 * @return
	 */
	public PostBean queryPostById(int postId);

}