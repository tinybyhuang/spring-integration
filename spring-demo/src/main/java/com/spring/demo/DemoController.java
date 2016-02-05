package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
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

}
