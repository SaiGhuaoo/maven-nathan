package com.nathan.modules.hellomvc.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathan.modules.hellomvc.dao.mapper.UserMapper;
import com.nathan.modules.hellomvc.entity.LoginLog;
import com.nathan.modules.hellomvc.entity.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private LoginLogService loginLogService;
	
	@Override
	public boolean hasMatchUser(User user) {
		Integer matchCount = userMapper.getMatchCount(user);
		if(matchCount >0 ){
			return true;
		}
		return false;
	}

	@Override
	public User findUpdateByUserName(User user) {
		return userMapper.findUserByUserName(user);
	}

	@Override
	public void loginSuccess(User user) {
		user.setCredits(5+user.getCredits());
		user.setLastVisit(new Date());
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(new Date());
		
		userMapper.updateLoginInfo(user);
		loginLogService.insertLoginLog(loginLog);
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUserInfo(user);
	}

}
