package com.chun.test.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.chun.test.dao.TestDao;
import com.chun.test.model.TestModel;

@Component("testDao")
public class TestDaoImpl implements TestDao {
	private TestModel testModel;
	private SessionFactory sessionFactory;
	private ClassPathXmlApplicationContext applicationContext;


	@Override
	public void testDao() {
		testModel = new TestModel();
		testModel.setName("aaaaaa");
		testModel.setId(1);

		Session session = sessionFactory.getCurrentSession();
		session.save(testModel);
		
		System.out.println("TestDao successfully!");

	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
