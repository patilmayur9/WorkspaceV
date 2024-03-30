package com.updateOperation.InsertHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		//insert data into database
		 Employee employee=new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First name : ");
		String name=sc.nextLine();
		employee.setFirstName(name);
		
		System.out.println("Enter Last name : ");
		String lname=sc.nextLine();
		employee.setLastName(lname);
		
		System.out.println("Enter City : ");
		String city=sc.nextLine();
		employee.setCity(city);
		
		System.out.println("Enter Mobile number : ");
		String mobile=sc.nextLine();
		employee.setMobile(mobile);
		
		s.save(employee);
		t.commit();
		s.close();
		System.out.println("record saved successfull : ");	 

    }
}
