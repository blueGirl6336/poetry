package com.demo.service.impl;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import javax.annotation.Resource;
//import org.springframework.stereotype.Service;

import com.demo.bean.PoetryBean;
import com.demo.bean.CommentBean;
import com.demo.dao.PoetryDao;
import com.demo.pojo.Poetry;
import com.demo.service.PoetryService;
import com.demo.service.CommentService;
import com.demo.util.PageCalculate;


@Service
public class PoetryServiceImpl implements PoetryService{
	
	@Autowired
	private HttpSession session;

	@Autowired
	private PoetryDao poetryDao;
	
	@Autowired
	private CommentService commentService;
	
	@Override
	public List<PoetryBean> queryPoetryByLeixingming(String leixingming, String mingcheng, int pageMaxNum, int pageNo){
		List<Poetry> poetryList = new ArrayList<Poetry>();
		List<PoetryBean> poetryBeanList = new ArrayList<PoetryBean>();
		switch(leixingming){
			case "chaodai" : 
				return queryPoetryByChaodai(mingcheng, pageMaxNum, pageNo);
			case "zuozhe" :
				return queryPoetryByZuozhe(mingcheng, pageMaxNum, pageNo);
			case "fenlei" :
				return queryPoetryByFenlei(mingcheng, pageMaxNum, pageNo);
			default: return poetryBeanList;
		}
	}
	
	@Override
	public Map<String, Object> queryPoetryContentAndCommentsById(int id)
	{
		System.out.println("enter impl class");
		Map<String, Object> poetryContent = new HashMap<String, Object>();
		poetryContent.put("id", id);
		Poetry poetry = poetryDao.queryPoetryById(id);
		PoetryBean poetryBean = new PoetryBean();
		poetryBean.setId(poetry.get_Id());
		poetryBean.setMingcheng(poetry.getMingcheng());
		poetryBean.setChaodai(poetry.getChaodai());
		poetryBean.setZuozhe(poetry.getZuozhe());
		poetryBean.setYuanwen(poetry.getYuanwen().replaceAll("\n","<br>"));
		poetryContent.put("poetry", poetryBean);
//		System.out.println("the result of queryPoetryById: " + poetryBean.getId());
//		System.out.println("the result of queryZhujieById: " + poetryDao.queryZhujieById(id));
		if(poetryDao.queryZhujieById(id) != null){
			poetryContent.put("zhujie", poetryDao.queryZhujieById(id).replaceAll("\n","<br>"));
		}else{
			poetryContent.put("zhujie", "null");
		}
		if(poetryDao.queryYiwenById(id) != null){
			poetryContent.put("yiwen", poetryDao.queryYiwenById(id).replaceAll("\n","<br>"));
		}else{
			poetryContent.put("yiwen", "null");
		}
		if(poetryDao.queryShangxiById(id) != null){
			poetryContent.put("shangxi", poetryDao.queryShangxiById(id).replaceAll("\n","<br>"));
		}else{
			poetryContent.put("shangxi", "null");
		}
		if(poetryDao.queryAuthorById(poetry.getZuozhe()) == null || (poetry.getZuozhe().equals("佚名"))){
			poetryContent.put("zuozhe", "null");
			System.out.println("the result of queryZuozhe(null): " + poetryDao.queryAuthorById(poetry.getZuozhe()));
		}else{
			System.out.println("the result of queryZuozhe: " + poetryDao.queryAuthorById(poetry.getZuozhe()));
			poetryContent.put("zuozhe", poetryDao.queryAuthorById(poetry.getZuozhe()).replaceAll("\n","<br>"));
		}
		List <CommentBean> commentBeanList = commentService.queryCommentByPoetryId(id);
		if(commentBeanList == null){
			poetryContent.put("comment", "null");
		}else{
			poetryContent.put("comment", commentBeanList);
		}
		return poetryContent;
	}
	
	
	@Override
	public List<PoetryBean> queryPoetryByChaodai(String chaodai, int pageMaxNum, int pageNo)
	{
		int pageNum = getPoetryPageNumByChaodai(chaodai, pageMaxNum);
		List<Poetry> poetryList = poetryDao.queryPoetryByChaodai(chaodai);
		List<PoetryBean> poetryBeanList = new ArrayList<PoetryBean>();
		// 若想查看页数大于总页数则返回null
		if (pageNum < pageNo)
		{
			return null;
		} else {
			int start = pageMaxNum * (pageNo - 1);
			int end = pageMaxNum * pageNo - 1;
			if (end > poetryList.size() - 1)
			{
				end = poetryList.size() - 1;
			}
			for(int i = start; i <= end; i++){
				PoetryBean poetryBean = new PoetryBean();
				poetryBean.setId(poetryList.get(i).get_Id());
				poetryBean.setMingcheng(poetryList.get(i).getMingcheng());
				poetryBean.setChaodai(poetryList.get(i).getChaodai());
				poetryBean.setZuozhe(poetryList.get(i).getZuozhe());
				poetryBean.setYuanwen(poetryList.get(i).getYuanwen());
				poetryBeanList.add(poetryBean);
			}
			return poetryBeanList;
		}
	}
	@Override
	public int getPoetryPageNumByChaodai(String chaodai, int pageMaxNum)
	{
		int poetryNum = poetryDao.countPoetryByChaodai(chaodai);
		return poetryNum % pageMaxNum == 0 ? poetryNum / pageMaxNum : poetryNum / pageMaxNum + 1;
	}
	
	@Override
	public List<PoetryBean> queryPoetryByZuozhe(String zuozhe, int pageMaxNum, int pageNo)
	{
		int pageNum = getPoetryPageNumByZuozhe(zuozhe, pageMaxNum);
		List<Poetry> poetryList = poetryDao.queryPoetryByZuozhe(zuozhe);
		List<PoetryBean> poetryBeanList = new ArrayList<PoetryBean>();
		// 若想查看页数大于总页数则返回null
		if (pageNum < pageNo)
		{
			return null;
		} else {
			int start = pageMaxNum * (pageNo - 1);
			int end = pageMaxNum * pageNo - 1;
			if (end > poetryList.size() - 1)
			{
				end = poetryList.size() - 1;
			}
			for(int i = start; i <= end; i++){
				PoetryBean poetryBean = new PoetryBean();
				poetryBean.setId(poetryList.get(i).get_Id());
				poetryBean.setMingcheng(poetryList.get(i).getMingcheng());
				poetryBean.setChaodai(poetryList.get(i).getChaodai());
				poetryBean.setZuozhe(poetryList.get(i).getZuozhe());
				poetryBean.setYuanwen(poetryList.get(i).getYuanwen());
				poetryBeanList.add(poetryBean);
			}
			return poetryBeanList;
		}
	}
	@Override
	public int getPoetryPageNumByZuozhe(String zuozhe, int pageMaxNum)
	{
		int poetryNum = poetryDao.countPoetryByZuozhe(zuozhe);
		return poetryNum % pageMaxNum == 0 ? poetryNum / pageMaxNum : poetryNum / pageMaxNum + 1;
	}
	
	@Override
	public List<PoetryBean> queryPoetryByFenlei(String fenlei, int pageMaxNum, int pageNo)
	{
		int pageNum = getPoetryPageNumByFenlei(fenlei, pageMaxNum);
		List<Poetry> poetryList = poetryDao.queryPoetryByFenlei(fenlei);
		List<PoetryBean> poetryBeanList = new ArrayList<PoetryBean>();
		// 若想查看页数大于总页数则返回null
		if (pageNum < pageNo)
		{
			return null;
		} else {
			int start = pageMaxNum * (pageNo - 1);
			int end = pageMaxNum * pageNo - 1;
			if (end > poetryList.size() - 1)
			{
				end = poetryList.size() - 1;
			}
			for(int i = start; i <= end; i++){
				PoetryBean poetryBean = new PoetryBean();
				poetryBean.setId(poetryList.get(i).get_Id());
				poetryBean.setMingcheng(poetryList.get(i).getMingcheng());
				poetryBean.setChaodai(poetryList.get(i).getChaodai());
				poetryBean.setZuozhe(poetryList.get(i).getZuozhe());
				poetryBean.setYuanwen(poetryList.get(i).getYuanwen());
				poetryBeanList.add(poetryBean);
			}
			return poetryBeanList;
		}
	}
	@Override
	public int getPoetryPageNumByFenlei(String fenlei, int pageMaxNum)
	{
		int poetryNum = poetryDao.countPoetryByFenlei(fenlei);
		return poetryNum % pageMaxNum == 0 ? poetryNum / pageMaxNum : poetryNum / pageMaxNum + 1;
	}
	
	
	@Override
	public List<PoetryBean> queryPoetryByInput(String yuanwen, int pageMaxNum, int pageNo)
	{
		int pageNum = getPoetryPageNumByInput(yuanwen, pageMaxNum);
		List<Poetry> poetryList = poetryDao.queryPoetryByInput(yuanwen);
		List<PoetryBean> poetryBeanList = new ArrayList<PoetryBean>();
		// 若想查看页数大于总页数则返回null
		if (pageNum < pageNo)
		{
			return null;
		} else {
			int start = pageMaxNum * (pageNo - 1);
			int end = pageMaxNum * pageNo - 1;
			if (end > poetryList.size() - 1)
			{
				end = poetryList.size() - 1;
			}
			for(int i = start; i <= end; i++){
				PoetryBean poetryBean = new PoetryBean();
				poetryBean.setId(poetryList.get(i).get_Id());
				poetryBean.setMingcheng(poetryList.get(i).getMingcheng());
				poetryBean.setChaodai(poetryList.get(i).getChaodai());
				poetryBean.setZuozhe(poetryList.get(i).getZuozhe());
				poetryBean.setYuanwen(poetryList.get(i).getYuanwen());
				poetryBeanList.add(poetryBean);
			}
			return poetryBeanList;
		}
	}
	@Override
	public int getPoetryPageNumByInput(String yuanwen, int pageMaxNum)
	{
		int poetryNum = poetryDao.countPoetryByInput(yuanwen);
		return poetryNum % pageMaxNum == 0 ? poetryNum / pageMaxNum : poetryNum / pageMaxNum + 1;
	}

	
//	@Override
//	public UserBean loginWithUserName(String userName, String password){
//		UserBean userBean = new UserBean();
//		int res = 0;
//		userBean.setLoginResult(res);
//		System.out.println("userName  " + userName);
//		System.out.println("password  " + password);
//		
//		User user = userDao.selectByUserName(userName);
//		if (user != null && password != null)
//		{
//			if (password.equals(user.getPassword()))
//			{
//				res = loginManager.userRegister(user.getUserId());
//				System.out.println("user.id:  " + user.getUserId());
//
//				userBean.setUserId(user.getUserId());
//				userBean.setUserName(user.getUserName());
//				userBean.setLoginResult(res);
//			}
//		}
//		return userBean;
//	}
	
}