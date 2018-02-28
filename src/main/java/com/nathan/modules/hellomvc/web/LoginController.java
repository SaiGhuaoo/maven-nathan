package com.nathan.modules.hellomvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nathan.modules.hellomvc.service.UserService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/a")
	public String toLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="/b")
	public String showQrcodePage(){
		return "showqrcode";
	}
}
