package com.chun.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chun.test.dao.TestDao;
import com.chun.test.dao.TestLogDao;
import com.chun.test.service.TestService;

@Component("testService")
public class TestServiceImpl implements TestService {
	private TestDao testDao;
	private TestLogDao testLogDao;

	@Override
	@Transactional
	public void testService() {
		System.out.println("here we go");
		testDao.testDao();
		System.out.println("here we go2");
		testLogDao.testLogDao();

	}

	@Autowired
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	@Autowired
	public void setTestLogDao(TestLogDao testLogDao) {
		this.testLogDao = testLogDao;
	}
	
	

}
