package com.demo.service;

import java.util.List;

import com.demo.bean.DownloadBean;
import com.demo.pojo.Download;

//import java.util.List;

/**
 * 用户登入登出接口
 * @content:
 */
public interface DownloadService{
	
	/**
	 * 新增一条下载信息
	 * @param downloadUId
	 * @param downloadPoetryId
	 * @return
	 */
	public int insertDownload(int downloadUId, int downloadPoetryId);
	

}