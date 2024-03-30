package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
		Employee emp=(Employee)context.getBean("e");
		System.out.println(emp);
	}
}
