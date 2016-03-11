package com.spring.demo.dao;

public interface PersonDao<T> {
	public void save(T o);
}
