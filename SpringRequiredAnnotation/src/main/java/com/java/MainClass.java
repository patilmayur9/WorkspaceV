package com.java;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) throws	ClassNotFoundException, SQLException {
	ApplicationContext context = new	ClassPathXmlApplicationContext("spring.xml");
	Drivers drivers = (Drivers) context.getBean("d");
	 drivers.printCon();
	}


}
