package com.spring.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.demo.dao.PersonDao;
import com.spring.demo.model.Person;
import com.spring.demo.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService {
	
	@Resource
	private PersonDao<Person> personDao;

	@Override
	public void save(Person person) {
		personDao.save(person);
	}

}
