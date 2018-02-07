package com.nathan.modules.hellomvc.dao.mapper;

import com.nathan.common.persistencelayer.annotation.MyBatisDao;
import com.nathan.modules.hellomvc.entity.LoginLog;

@MyBatisDao
public interface LoginLogMapper {
	public void insertLoginLog(LoginLog loginLog);
}
