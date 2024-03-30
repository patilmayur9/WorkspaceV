package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		 context.getBean("a");
//		 context.getBean("b");
//		 context.getBean("c");
		 
		//System.out.println(emp);
	}

}
