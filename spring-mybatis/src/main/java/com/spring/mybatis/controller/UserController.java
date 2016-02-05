package com.spring.mybatis.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.mybatis.model.User;
import com.spring.mybatis.service.UserService;

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/userTest")
	public String userTest(Model model){
		
		User user = new User();
		user.setUsername("coderhuang");
		user.setUserpwd("123456");
		userService.addUser(user);
		logger.info("插入用户id:" + user.getId());
		user = userService.getUser(user.getId());
		model.addAttribute("user", user);
		return "user";
	}
	

}
