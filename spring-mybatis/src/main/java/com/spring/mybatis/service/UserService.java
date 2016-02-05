package com.spring.mybatis.service;

import com.spring.mybatis.model.User;

public interface UserService {
	
	User getUser(int userId);
	
	void addUser(User user);
	
	void deleteUser(int userId);
	
	void updateUser(User user);

}
