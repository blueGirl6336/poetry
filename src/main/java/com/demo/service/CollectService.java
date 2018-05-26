package com.demo.service;

import java.util.List;

import com.demo.bean.CollectBean;
import com.demo.pojo.Collect;

//import java.util.List;
public interface CollectService{
	
	/**
	 * 插入一条收藏信息
	 * @param collectUId
	 * @param collectPoetryId
	 * @return
	 */
	public int insertCollect(int collectUId, int collectPoetryId);
	

}