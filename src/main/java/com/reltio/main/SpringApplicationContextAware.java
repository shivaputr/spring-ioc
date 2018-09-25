package com.reltio.main;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringApplicationContextAware implements ApplicationContextAware {

	private static ApplicationContext context;

	public SpringApplicationContextAware() {
		System.out.println("SpringApplicationContextAware initialized!!");
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		SpringApplicationContextAware.context = arg0;

	}

}
