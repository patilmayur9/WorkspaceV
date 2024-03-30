package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	
	public static void main(String[] args) {
		
		System.out.println("1");
		
		Configuration  cfg= new Configuration();
		
		System.out.println("2");
		
		cfg.configure("hibernate.cfg.xml");
		
		System.out.println("3");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session session= sf.openSession();
		
		Transaction t= session.beginTransaction();
		
		Student student=new Student();
		
//		student.setFirstname("Viajy");
//		student.setLastname("Patil");
		student.setFirstName("pratik");
		student.setLastName("patil");
		session.save(student);
		t.commit();
		session.close();
		System.out.println("Record Saved Successfully");
		
	}
	
	
}