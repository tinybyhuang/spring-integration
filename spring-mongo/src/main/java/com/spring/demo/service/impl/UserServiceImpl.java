
package com.spring.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.demo.dao.BaseDao;
import com.spring.demo.model.User;
import com.spring.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private BaseDao baseDao;

	@Override
	public void save(User user) {
		baseDao.saveOrUpdate(user);
	}

}
