package com.nathan.modules.hellomvc.service;

import com.nathan.modules.hellomvc.entity.User;

public interface UserService {
	
	public boolean hasMatchUser(User user);
	
	public User findUpdateByUserName(User user);
	
	public void loginSuccess(User user);
	
	public void insertUser(User user);
	
	public void updateUser(User user);
	
	
}
