package com.spring.demo.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository("mongoDBBaseDao")
public class MongoDBBaseDao implements BaseDao {
	
	@Resource
	protected MongoTemplate mongoTemplate;
	
	@Override
	public <T> T findById(Class<T> entityClass, String id) {
		
		return mongoTemplate.findById(id, entityClass);
	}

	@Override
	public <T> List<T> findAll(Class<T> entityClass) {
		return mongoTemplate.findAll(entityClass);
	}

	@Override
	public void remove(Object record) {
		mongoTemplate.remove(record);

	}

	@Override
	public void add(Object record) {
		
		mongoTemplate.insert(record); 

	}

	@Override
	public void saveOrUpdate(Object record) {
		
		mongoTemplate.save(record);

	}

	@Override
	public <T> T findOne(Class<T> entityClass) {
		return mongoTemplate.findOne(new Query(), entityClass);
	}

}
