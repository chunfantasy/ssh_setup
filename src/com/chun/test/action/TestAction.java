package com.chun.test.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.chun.test.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

@Component("testAction")
public class TestAction extends ActionSupport{

	private TestService testService;

	@Scope("Prototye")
	@Action(value = "/test/testAdd", results = {
			@Result(name = "success", location = "/success.jsp", type = "redirect"),
			@Result(name = "error", location = "/fail.jsp", type = "redirect") })
	public String excute() {
//		ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext("beans.xml");
//		testService = (TestService)cpxa.getBean("testService");
		testService.testService();
		return SUCCESS;
	}

	@Autowired
	public void setTestService(TestService testService) {
		this.testService = testService;
	}

}
