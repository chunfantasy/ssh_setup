package com.chun.test.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.chun.test.dao.TestLogDao;
import com.chun.test.model.TestLogModel;

@Component("testLogDao")
public class TestLogDaoImpl implements TestLogDao {
	private TestLogModel testLogModel;
	private SessionFactory sessionFactory;
	private ClassPathXmlApplicationContext applicationContext;


	@Override
	public void testLogDao() {
		testLogModel = new TestLogModel();
		testLogModel.setName("aaaaaaLog");
		testLogModel.setId(1);

		Session session = sessionFactory.getCurrentSession();
		session.save(testLogModel);

	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
