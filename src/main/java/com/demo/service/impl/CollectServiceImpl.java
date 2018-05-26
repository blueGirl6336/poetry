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

import com.demo.bean.CollectBean;
import com.demo.dao.CollectDao;
import com.demo.pojo.Collect;
import com.demo.service.CollectService;


@Service
public class CollectServiceImpl implements CollectService{

	@Autowired
	private CollectDao collectDao;
	
	@Override
	public int insertCollect(int collectUId, int collectPoetryId)
	{
		Collect collect = new Collect();
		collect.setCollectUId(collectUId);
		collect.setCollectPoetryId(collectPoetryId);
		try
		{
			collectDao.insertCollect(collect);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
}