package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.bean.PoetryBean;

//import java.util.List;

//import com.demo.pojo.User;

/**
 * 诗词搜索接口
 * @content:
 */
public interface PoetryService{
	/**
	 * 根据分类名（朝代，作者，分类）等获取诗词列表
	 * @param leixingming
	 * @param mingcheng
	 * @param pageMaxNum
	 * @param pageNo
	 * @return
	 */
	public List<PoetryBean> queryPoetryByLeixingming(String leixingming, String mingcheng, int pageMaxNum, int pageNo);
	
	/**
	 * 根据诗词id查询诗词原文，注解，译文，赏析，作者, 评论等内容
	 * @param id
	 * @return
	 */
	public Map<String, Object> queryPoetryContentAndCommentsById(int id);
	
	//根据朝代获取诗词列表和分页页数
	public List<PoetryBean> queryPoetryByChaodai(String chaodai, int pageMaxNum, int pageNo);
	public int getPoetryPageNumByChaodai(String chaodai, int pageMaxNum);
	
	//根据作者获取诗词列表和分页页数
	public List<PoetryBean> queryPoetryByZuozhe(String zuozhe, int pageMaxNum, int pageNo);
	public int getPoetryPageNumByZuozhe(String zuozhe, int pageMaxNum);
	
	//根据分类获取诗词列表和分页页数
	public List<PoetryBean> queryPoetryByFenlei(String fenlei, int pageMaxNum, int pageNo);
	public int getPoetryPageNumByFenlei(String fenlei, int pageMaxNum);
	
	//根据用户输入全文搜索
	public List<PoetryBean> queryPoetryByInput(String yuanwen, int pageMaxNum, int pageNo);
	public int getPoetryPageNumByInput(String yuanwen, int pageMaxNum);
}