package com.demo.dao;

import java.util.List;

//import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.demo.pojo.Collect;
//import com.demo.util.PageCalculate;

public interface CollectDao {
	
	/**
	 * 插入一条收藏消息
	 * @param collect
	 * @return
	 */
	public int insertCollect(Collect collect);
	
	/**
	 * 根据用户id, 诗词id获取某人是否收藏过某诗
	 * @param collectUId
	 * @param collectPoetryId
	 * @return
	 */
	public Collect queryCollectByUIdAndPoetryId(@Param("collectUId") int collectUId, @Param("collectPoetryId") int collectPoetryId);
	
}