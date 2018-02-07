package com.nathan.modules.hellomvc.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nathan.modules.hellomvc.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class TestUserService {
	@Autowired
	private UserService userService;
	
	@Test
	public void hasMAtchUser(){
		User user = new User();
		user.setUserName("admin");
		user.setPassword("123456");
		
		boolean b1 = userService.hasMatchUser(user);
		Assert.assertTrue(b1);
	}
	
	
}
