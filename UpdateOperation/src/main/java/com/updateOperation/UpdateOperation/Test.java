package com.updateOperation.UpdateOperation;

//package com.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.*;//Transaction;
import org.hibernate.cfg.Configuration;
public class Test { //update the record
public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//pass the class name and id for updating record
		Student student = (Student) session.get(Student.class, 1);
		student.setName("jack");
		session.update(student);
		session.getTransaction().committ();
		session.close();
		sessionFactory.close();
		System.out.println("Record updated successfully.");
	}
}
