package com.demo.dao;

import java.util.List;

//import java.util.List;
//import org.apache.ibatis.annotations.Param;

import com.demo.pojo.Download;
//import com.demo.util.PageCalculate;

public interface DownloadDao {
	
	/**
	 * 插入一条下载信息
	 * @param download
	 * @return
	 */
	public int insertDownload(Download download);
	
}