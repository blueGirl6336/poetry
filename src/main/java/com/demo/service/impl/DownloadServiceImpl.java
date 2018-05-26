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
//import javax.annotation.Resource;
//import org.springframework.stereotype.Service;

import com.demo.bean.DownloadBean;
import com.demo.dao.DownloadDao;
import com.demo.pojo.Comment;
import com.demo.pojo.Download;
import com.demo.service.DownloadService;


@Service
public class DownloadServiceImpl implements DownloadService{

	@Autowired
	private DownloadDao downloadDao;
	
	@Override
	public int insertDownload(int downloadUId, int downloadPoetryId)
	{
		Download download = new Download();
		download.setDownloadUId(downloadUId);
		download.setDownloadPoetryId(downloadPoetryId);
		try
		{
			downloadDao.insertDownload(download);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}