package com.demo.controller;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.PoetryBean;
import com.demo.service.PoetryService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/poetry")
public class PoetryController
{
	@Autowired
	private PoetryService poetryService;

	/**
	 * 分类查找诗词
	 * @param leixingming 类型名 朝代，作者，分类
	 * @param mingcheng  类型名的具体名称
	 * @param pageMaxNum 返回诗词的每页诗词数
	 * @param pageNo  当前请求页数
	 * @return
	 */
	@RequestMapping("/queryPoetryByLeixingming")
	@ResponseBody
	public Map<String, Object> queryPoetryByLeixingming(@RequestParam String leixingming, 
			@RequestParam String mingcheng, @RequestParam int pageMaxNum, @RequestParam int pageNo)
	{
		List<PoetryBean> poetryBeanList = poetryService.queryPoetryByLeixingming(leixingming, mingcheng, pageMaxNum, pageNo);
		System.out.println("enter queryPoetryByLeixingming controller  " );
		Map<String, Object> queryPoetryByLeixingmingResult = new HashMap<String, Object>();
		queryPoetryByLeixingmingResult.put("poetry", poetryBeanList);
		switch(leixingming){
			case "chaodai": queryPoetryByLeixingmingResult.put("pageNum", poetryService.getPoetryPageNumByChaodai(mingcheng, pageMaxNum));
				break;
			case "zuozhe":queryPoetryByLeixingmingResult.put("pageNum", poetryService.getPoetryPageNumByZuozhe(mingcheng, pageMaxNum));
				break;
			case "fenlei":queryPoetryByLeixingmingResult.put("pageNum", poetryService.getPoetryPageNumByFenlei(mingcheng, pageMaxNum));
				break;
		}
		return ResponseMapUtil.responseSuccess(queryPoetryByLeixingmingResult);
	}
	
	/**
	 * 根据用户输入的内容进行诗词全文搜索	
	 * @param yuanwen 全文查找的内容
	 * @param pageMaxNum  返回诗词的每页诗词数
	 * @param pageNo  当前请求页数
	 * @return
	 */
	@RequestMapping("/queryPoetryByInput")
	@ResponseBody
	public Map<String, Object> queryPoetryByInput(@RequestParam String yuanwen, 
			@RequestParam int pageMaxNum, @RequestParam int pageNo)
	{
		List<PoetryBean> poetryBeanList = poetryService.queryPoetryByInput(yuanwen, pageMaxNum, pageNo);
		System.out.println("enter queryPoetryByInput controller  " );
		Map<String, Object> queryPoetryByInputResult = new HashMap<String, Object>();
		queryPoetryByInputResult.put("poetry", poetryBeanList);
		queryPoetryByInputResult.put("pageNum", poetryService.getPoetryPageNumByInput(yuanwen, pageMaxNum));
		return ResponseMapUtil.responseSuccess(queryPoetryByInputResult);
	}
	
	/**
	 * 根据诗词id获取诗词内容，注解， 译文， 赏析， 作者
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryPoetryContentAndCommentsById")
	@ResponseBody
	public Map<String, Object> queryPoetryContentAndCommentsById(@RequestParam int id)
	{
		System.out.println("enter queryPoetryContentById controller");
		return ResponseMapUtil.responseSuccess(poetryService.queryPoetryContentAndCommentsById(id));
		
	}
	
	
//	@RequestMapping("/getQueryPoetryByLeixingmingPageNum")
//	@ResponseBody
//	public Map<String, Object> getQueryPoetryByLeixingmingPageNum(@RequestParam String leixingming, 
//			@RequestParam String mingcheng, @RequestParam int pageMaxNum)
//	{
//		int queryPoetryByLeixingmingPageNum = 0;
//		switch(leixingming){
//			case "chaodai" : queryPoetryByLeixingmingPageNum = poetryService.getPoetryPageNumByChaodai(mingcheng, pageMaxNum);
//				return ResponseMapUtil.responseSuccess(queryPoetryByLeixingmingPageNum);
//			case "zuozhe" : queryPoetryByLeixingmingPageNum = poetryService.getPoetryPageNumByZuozhe(mingcheng, pageMaxNum);
//				return ResponseMapUtil.responseSuccess(queryPoetryByLeixingmingPageNum);
//			case "fenlei" : queryPoetryByLeixingmingPageNum = poetryService.getPoetryPageNumByFenlei(mingcheng, pageMaxNum);
//				return ResponseMapUtil.responseSuccess(queryPoetryByLeixingmingPageNum);
//			default: return ResponseMapUtil.responseSuccess(queryPoetryByLeixingmingPageNum);
//		}
//	}
	
//	@RequestMapping("/register")
//	@ResponseBody
//	public Map<String, Object> register(@RequestParam String userName, @RequestParam String password)
//	{
//		int registerResult = userService.register(userName, password);
//		switch(registerResult){
//			case 0:
//				return ResponseMapUtil.responseError("注册失败！");
//			case 1:
//				return ResponseMapUtil.responseSuccess("注册成功");
//			default:
//				return ResponseMapUtil.responseError("未知注册错误！");
//		}
//	}

}
