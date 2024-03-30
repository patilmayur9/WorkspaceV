package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		System.out.println("1");
		Configuration cfg = new Configuration();
		System.out.println("2");
		cfg.configure("hibernate.cfg.xml");
		System.out.println("3");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
// insert data into database
		Student student = new Student();
//student.setId(101);
		student.setFirstName("ram");
		student.setLastName("pawar");
		session.save(student);
		t.commit();
		session.close();
		System.out.println("Record saved successfully.");
	}
}