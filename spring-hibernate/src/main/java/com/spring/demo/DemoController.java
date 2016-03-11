package com.spring.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.demo.model.Person;
import com.spring.demo.service.PersonService;

@Controller
public class DemoController {
	
	@Resource
	private PersonService personService;
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
	
	@RequestMapping("/person")
	public void save(){
		Person person = new Person();
		person.setName("张三");
		personService.save(person);
	}

}
