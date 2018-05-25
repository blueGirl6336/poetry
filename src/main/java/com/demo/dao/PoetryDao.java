package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.Poetry;
//import com.demo.util.PageCalculate;

public interface PoetryDao {
	
	/**
	 * 根据 朝代名称 查找诗词
	 * @param fenlei
	 * @return
	 */
	public List<Poetry> queryPoetryByChaodai(String chaodai);
	/**
	 * 获取 朝代名称 诗词数
	 * @param chaodai
	 * @return
	 */
	public int countPoetryByChaodai(String chaodai);
	
	
	/**
	 * 根据 作者名称 查找诗词
	 * @param zuozhe
	 * @return
	 */
	public List<Poetry> queryPoetryByZuozhe(String zuozhe);
	/**
	 * 获取 作者名称 诗词数
	 * @param zuozhe
	 * @return
	 */
	public int countPoetryByZuozhe(String zuozhe);
	
	
	/**
	 * 根据 分类名称  查找诗词
	 * @param fenlei
	 * @return
	 */
	public List<Poetry> queryPoetryByFenlei(String fenlei);
	/**
	 * 获取 分类名称 诗词数
	 * @param zuozhe
	 * @return
	 */
	public int countPoetryByFenlei(String fenlei);
	
	
	/**
	 * 根据 输入文字  查找诗词
	 * @param fenlei
	 * @return
	 */
	public List<Poetry> queryPoetryByInput(String yuanwen);
	/**
	 * 获取 输入文字诗词数
	 * @param zuozhe
	 * @return
	 */
	public int countPoetryByInput(String yuanwen);
	
	/**
	 * 根据诗词id获取诗词
	 * @param _id
	 * @return
	 */
	public Poetry queryPoetryById(int _id);
	
	/**
	 * 根据诗词id获取诗词注解
	 * @param _id
	 * @return
	 */
	public String queryZhujieById(int _id);
	
	/**
	 * 根据诗词id获取诗词译文
	 * @param _id
	 * @return
	 */
	public String queryYiwenById(int _id);
	
	/**
	 * 根据诗词id获取诗词赏析
	 * @param _id
	 * @return
	 */
	public String queryShangxiById(int _id);
	
	/**
	 * 根据作者名称获取诗词作者简介
	 * @param _id
	 * @return
	 */
	public String queryAuthorById(String author);
	
}