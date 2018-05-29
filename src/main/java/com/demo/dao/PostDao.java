package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.Post;
//import com.demo.util.PageCalculate;

public interface PostDao {
	
	/**
	 * 获取所有帖子
	 * @return
	 */
	public List<Post> selectAllPost();
	
	
	/**
	 * 根据帖子id获取帖子
	 * @param postId
	 * @return
	 */
	public Post queryPostById(int postId);

}