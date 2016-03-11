package com.spring.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.demo.model.User;
import com.spring.demo.service.UserService;

@Controller
public class DemoController {
	@Resource
	private UserService userService;
	/**
	 * jsp view test
	 */
	@RequestMapping("/demo")
	public String demoTest(){
		return "demo";
	}
	/**
	 * json to string test
	 */
	@RequestMapping("/json")
	public @ResponseBody String jsonTest(){
		return "dddd";
	}
	/**
	 * json object test
	 */
	@RequestMapping("/jsonObject")
	public @ResponseBody Integer jsonObjectTest(){
		return new Integer(5);
	}
	@RequestMapping("/user")
	public void save(){
		User user = new User();
		user.setName("张三");
		userService.save(user);
	}

}
