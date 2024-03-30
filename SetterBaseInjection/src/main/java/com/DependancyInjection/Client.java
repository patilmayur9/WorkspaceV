package com.DependancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("Spring.xml");
		Student student=(Student)ap.getBean("s");
		student.getMessage("Velocity corporate training center");
		}

}
