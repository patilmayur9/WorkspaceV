package com.hibernate.Mapping.OneToMany.OneToMany;

/**
 * Hello world!
 *
 */

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) 
	{
		User user = new User();
		Policy policy1 = new Policy("J10", "CarInsurance", "Active", user);
		Policy policy2 = new Policy("J11", "BikeInsurance", "Active", user);
		Set<Policy> set = new HashSet<Policy>();
		set.add(policy1);
		set.add(policy2);
		user.setPolicy(set);
		user.setName("Samir");
		user.setEmail("samir@gmail.com");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml"); // load the file
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.save(user);
		session.save(policy1);
		session.save(policy2);
		t.commit();
		session.close();
		sessionFactory.close();
	}
}