package com.nathan.modules.hellomvc.dao.mapper;

import com.nathan.common.persistencelayer.annotation.MyBatisDao;
import com.nathan.modules.hellomvc.entity.User;

@MyBatisDao
public interface UserMapper {
	
	public Integer getMatchCount(User user);
	
	public User findUserByUserName(User user);
	
	public void updateLoginInfo(User user);
	
	public void insertUser(User user);
	
	public void updateUserInfo(User user);
}
