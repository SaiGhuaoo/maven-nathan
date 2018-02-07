package com.nathan.modules.hellomvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathan.modules.hellomvc.dao.mapper.LoginLogMapper;
import com.nathan.modules.hellomvc.entity.LoginLog;
@Service
public class LoginLogServiceImpl implements LoginLogService{
	@Autowired
	private LoginLogMapper loginLogMapper;
	
	@Override
	public void insertLoginLog(LoginLog loginLog) {
		loginLogMapper.insertLoginLog(loginLog);
	}

}
