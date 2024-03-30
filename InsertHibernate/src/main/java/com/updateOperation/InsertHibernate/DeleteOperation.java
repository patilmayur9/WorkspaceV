package com.updateOperation.InsertHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteOperation
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		//tudent student = (Student)session.load(Student.class, 1);
		Employee employee=(Employee) session.load(Employee.class, 3);//delete from employee where id=2;
		System.out.println(employee);
		session.delete(employee);
		transaction.commit();
		session.close();
		sf.close();
		System.out.println("Record deleted Successfully");
	}

}
