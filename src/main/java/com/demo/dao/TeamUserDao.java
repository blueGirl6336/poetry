package com.demo.dao;

import java.util.List;

//import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.demo.pojo.Collect;
import com.demo.pojo.TeamUser;
//import com.demo.util.PageCalculate;

public interface TeamUserDao {
	
	/**
	 * 输入用户id, teamID 查看是否存在此记录
	 * @param teamId
	 * @param userId
	 * @return
	 */
	public TeamUser queryRecordByUIdAndTeamId(@Param("teamId") int teamId, @Param("userId") int userId); 
	
	/**
	 * 根据teamId获得某team所有用户
	 * @param teamId
	 * @return
	 */
	public List<TeamUser> queryRecordByTeamId(int teamId);
	
	/**
	 * 插入一条记录（用户加入小舍）
	 * @param teamUser
	 * @return
	 */
	public int insertRecord(TeamUser teamUser);
	
}