package com.cache.sessionCache.SessionCasheConcept;

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
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.xml");
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction t=session.beginTransaction();
    	
//    	Student stud=new Student();
//    	stud.setName("pratik");
//    	stud.setId(2);
//    	stud.setCity("nashik");
//    	stud.setMobile("3534628376");
//    	session.save(stud);
//    	t.commit();
//    	System.out.println("Data saved successfully");
//    	session.close();
    	
    	// we are using two session objects. this is default level cache memory concept
    	//both quers are same then first query fires only and second query get the result present in to the cache memory 
    	Student s1 = (Student) session.get(Student.class,1);
    	System.out.println("First student data is>>");
    	System.out.println("Name>>" + s1.getName());
    	System.out.println("City>>" + s1.getCity());
    	System.out.println("Mobile>>" + s1.getMobile());
    	System.out.println("....................................................................");
    	Student s2 = (Student) session.get(Student.class,2);//hear query will not be fired directly data will be shown into the cache memory 
    	System.out.println("Second student data is>>");
    	System.out.println("Name>>" + s2.getName());
    	System.out.println("City>>" + s2.getCity());
    	System.out.println("Mobile>>" + s2.getMobile());

    }
}
