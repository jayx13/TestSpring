package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("Beans.xml");

		SpringSamp objA = (SpringSamp) context.getBean("springSamp");
		objA.getMessage1();
		objA.getMessage2();

		SpringSampChild objB = (SpringSampChild) context.getBean("springSampChild");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
	}

}
