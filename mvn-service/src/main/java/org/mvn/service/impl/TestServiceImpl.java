package org.mvn.service.impl;

import org.mvn.common.User;
import org.mvn.dao.TestDao;
import org.mvn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	TestDao tDao;

	public User getUserByName(String name) {
		return tDao.getUserByName(name);
	}

}
