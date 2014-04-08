package com.chun.test.service.impl;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chun.test.service.TestService;

public class TestServiceTest {

	private ClassPathXmlApplicationContext applicationContext;

	@Test
	public void test(){
		applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		TestService test = (TestService)applicationContext.getBean("testService");
		test.testService();
	}
	
	
	
	
}
