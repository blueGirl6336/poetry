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

import com.demo.bean.TeamBean;
import com.demo.service.TeamService;
import com.demo.util.ResponseMapUtil;

@Controller
@RequestMapping("/team")
public class TeamController
{
	@Autowired
	private TeamService teamService;

	@RequestMapping("/selectAllTeam")
	@ResponseBody
	public Map<String, Object> selectAllTeam()
	{
		List<TeamBean> selectAllTeamList= teamService.selectAllTeam();
		return ResponseMapUtil.responseSuccess(selectAllTeamList);
	}
	
	@RequestMapping("/queryTeamById")
	@ResponseBody
	public Map<String, Object> queryTeamById(@RequestParam int teamId)
	{
		TeamBean queryTeamByIdResult = teamService.queryTeamById(teamId);
		return ResponseMapUtil.responseSuccess(queryTeamByIdResult);
	}
}
