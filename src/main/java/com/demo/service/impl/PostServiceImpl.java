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

import com.demo.bean.PostBean;
import com.demo.dao.PostDao;
import com.demo.dao.UserDao;
import com.demo.pojo.Post;
import com.demo.service.PostService;
import com.demo.service.PostCommentService;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostDao postDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PostCommentService postCommentService;
	
	@Override
	public List<PostBean> selectAllPost(){
		List<Post> postList = postDao.selectAllPost();
		List<PostBean> postBeanList = new ArrayList<PostBean>();
		if(postList == null){
			return null;
		}else{
			for(Post post: postList){
				PostBean postBean = new PostBean();
				postBean.setPostId(post.getPostId());
				postBean.setPostUId(post.getPostUId());
				postBean.setPostUserName(userDao.queryUserNameById(post.getPostUId()));
				postBean.setPostTitle(post.getPostTitle());
				postBean.setPostContent(post.getPostContent().replaceAll("\n", "<br>"));
				postBean.setPostDateTime(post.getPostDateTime());
				postBean.setPostCommentBeanList(postCommentService.queryPostCommentByPostId(post.getPostId()));
				postBeanList.add(postBean);
			}
			return postBeanList;
		}
	}
	
	@Override
	public PostBean queryPostById(int postId)
	{
		Post post = postDao.queryPostById(postId);
		PostBean postBean = new PostBean();
		postBean.setPostId(post.getPostId());
		postBean.setPostUId(post.getPostUId());
		postBean.setPostUserName(userDao.queryUserNameById(post.getPostUId()));
		postBean.setPostTitle(post.getPostTitle());
		postBean.setPostContent(post.getPostContent().replaceAll("\n", "<br>"));
		postBean.setPostDateTime(post.getPostDateTime());
		postBean.setPostCommentBeanList(postCommentService.queryPostCommentByPostId(post.getPostId()));
		System.out.println("commentList length" + postBean.getPostCommentBeanList().size());
		return postBean;
	}
}