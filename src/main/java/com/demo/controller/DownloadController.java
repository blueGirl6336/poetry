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
import com.demo.service.DownloadService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/download")
public class DownloadController
{
	@Autowired
	private DownloadService downloadService;

	@RequestMapping("/insertDownload")
	@ResponseBody
	public Map<String, Object> insertDownload(@RequestParam int downloadUId, @RequestParam int downloadPoetryId)
	{
		int insertDownloadResult = downloadService.insertDownload(downloadUId, downloadPoetryId);
		switch(insertDownloadResult){
			case 0:
				return ResponseMapUtil.responseError("下载表更新失败！");
			case 1:
				return ResponseMapUtil.responseSuccess("下载表更新成功");
			default:
				return ResponseMapUtil.responseError("未知下载表更新错误！");
		}
	}
	
}
