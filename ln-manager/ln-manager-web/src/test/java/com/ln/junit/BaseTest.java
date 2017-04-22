package com.ln.junit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {

	public ApplicationContext setUp() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring/applicationContext-*.xml", "classpath:spring/springmvc.xml" });
		return context;
	}

}