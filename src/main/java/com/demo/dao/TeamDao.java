package com.demo.dao;

import java.util.List;

import com.demo.pojo.Team;
//import com.demo.util.PageCalculate;

public interface TeamDao {
	/**
	 * 获取所有小舍列表
	 * @return
	 */
	public List<Team> selectAllTeam();
	
	/**
	 * 根据小舍id查找小舍
	 * @param teamId
	 * @return
	 */
	public Team queryTeamById(int teamId);

}