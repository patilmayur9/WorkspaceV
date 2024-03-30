package com.updateOperation.InsertHibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class UpdateOperation 
{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//pass the class name and id for updating record
		Employee employee = (Employee)session.get(Employee.class, 1);
		employee.setFirstName("jack");
		employee.setLastName("chintu");
		session.update(employee);
		session.getTransaction().commit();//another way to commmit
		session.close();
		sessionFactory.close();
		System.out.println("Record updated successfully.");
		 
		}
	
	


}
