package com.reltio.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reltio.util.HelloWorld;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context/*");

		HelloWorld obj = context.getBean("helloBean", HelloWorld.class);
		obj.printHello();
	}
}
