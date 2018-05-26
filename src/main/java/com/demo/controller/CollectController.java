package com.demo.controller;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.DownloadBean;
import com.demo.service.CollectService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/collect")
public class CollectController
{
	@Autowired
	private CollectService collectService;

	@RequestMapping("/insertCollect")
	@ResponseBody
	public Map<String, Object> insertCollect(@RequestParam int collectUId, @RequestParam int collectPoetryId)
	{
		int insertCollectResult = collectService.insertCollect(collectUId, collectPoetryId);
		switch(insertCollectResult){
			case 0:
				return ResponseMapUtil.responseError("收藏表更新失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("收藏表更新成功");
			default:
				return ResponseMapUtil.responseError("未知收藏表更新错误！");
		}
	}
	
}
