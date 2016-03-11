package com.spring.demo.dao;

import java.util.List;

public interface BaseDao {
	
	<T> T findById(Class<T> entityClass, String id);
	
	<T> T findOne(Class<T> entityClass);
	
	<T> List<T> findAll(Class<T> entityClass);
	
	void remove(Object record);
	
	void add(Object record);
	
	void saveOrUpdate(Object record);

}
