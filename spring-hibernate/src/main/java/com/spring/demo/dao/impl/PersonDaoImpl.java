package com.spring.demo.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.dao.PersonDao;
@Repository
public class PersonDaoImpl<T> implements PersonDao<T> {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void save(T o) {
		
		sessionFactory.getCurrentSession().save(o);
	}

}
