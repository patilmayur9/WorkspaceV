package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	 public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ContextApplication.xml");
		Employee emp=(Employee) context.getBean("s");
		System.out.println("Employee information is : "+emp);
				
				 
	}

}
