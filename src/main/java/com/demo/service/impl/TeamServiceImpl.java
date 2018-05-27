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

import com.demo.bean.ReplyBean;
import com.demo.bean.TeamBean;
import com.demo.dao.TeamDao;
import com.demo.dao.UserDao;
import com.demo.pojo.Team;
import com.demo.pojo.User;
import com.demo.service.TeamService;


@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamDao teamDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<TeamBean> selectAllTeam()
	{
		List<Team> teamList = teamDao.selectAllTeam();
		List<TeamBean> teamBeanList = new ArrayList<TeamBean>();
		for(Team team : teamList){
			TeamBean teamBean = new TeamBean();
			teamBean.setTeamId(team.getTeamId());
			teamBean.setTeamUId(team.getTeamUId());
			teamBean.setTeamUserName(userDao.queryUserNameById(team.getTeamUId()));
			teamBean.setTeamName(team.getTeamName());
			teamBean.setUserBeanList(userDao.selectUsersByTeamId(team.getTeamId()));
			teamBeanList.add(teamBean);
		}
		return teamBeanList;
	}
	
	@Override
	public TeamBean queryTeamById(int teamId)
	{
		Team team = teamDao.queryTeamById(teamId);
		TeamBean teamBean = new TeamBean();
		teamBean.setTeamId(teamId);
		teamBean.setTeamUId(team.getTeamUId());
		teamBean.setTeamUserName(userDao.queryUserNameById(team.getTeamUId()));
		teamBean.setTeamName(team.getTeamName());
		teamBean.setTeamDescription(team.getTeamDescription());
		teamBean.setUserBeanList(userDao.selectUsersByTeamId(team.getTeamId()));		
		return teamBean;
	}
}