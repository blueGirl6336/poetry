package com.demo.service;

import java.util.List;

import com.demo.bean.TeamBean;

public interface TeamService{
	/**
	 * 根据 诗词id 查询该诗词的评论
	 * @param poetryId
	 * @return
	 */
	public List<TeamBean> selectAllTeam();
	
	/**
	 * 根据小舍id获取小舍信息
	 * @param teamId
	 * @return
	 */
	public TeamBean queryTeamById(int teamId);
	
}