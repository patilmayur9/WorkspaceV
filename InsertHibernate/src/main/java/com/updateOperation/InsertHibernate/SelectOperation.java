package com.updateOperation.InsertHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class SelectOperation 
{
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		Query query=session.createQuery("from Employee");//select * from Employee;
		List<Employee> list=query.list();
		for(Employee emp:list)
		{
			System.out.println("id "+emp.getId());
			System.out.println("FirstName "+emp.getFirstName());
			System.out.println("LastName "+emp.getLastName());
			System.out.println("city "+emp.getCity());
			System.out.println("mobile "+emp.getMobile());
		}
		transaction.commit();
		session.close();
		sf.close();
		System.out.println("Record retrived successfully ");
		
	}

}
