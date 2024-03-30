package com.CRUDOperation.AssignmentMave28;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
 
public class App 
{
    public static void main( String[] args )
    {
         Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory sf=cfg.buildSessionFactory();
         Session session=sf.openSession();
         Transaction t=session.beginTransaction();
         
         Scanner sc=new Scanner(System.in);
         Student stud= new Student();
         
         System.out.println("Enter First name of Student : ");
         String fname=sc.nextLine();
         stud.setfName(fname);
         
         System.out.println("Enter Last name of Student : ");
         String lname=sc.nextLine();
         stud.setlName(lname);
         
         System.out.println("Enter School name of Student : ");
         String sname=sc.nextLine();
         stud.setsName(sname);
         
         
         //insert query
         session.save(stud);
         t.commit(); 
         System.out.println("Data inserted sucessfully");
         System.out.println();
         //session.close();
         
         //select or read or retrive the student all  infromation 
         //System.out.println(stud);
         Query query=session.createQuery("from Student");
         List<Student> list=query.list();//storing data from query to list whole data for iterating
         for(Student stu:list)
         {
        	 System.out.println("studnet id : "+stu.getId());
        	 System.out.println("Student First name : "+stu.getfName());
        	 System.out.println("Student Last name : "+stu.getlName());
        	 System.out.println("Student School name : "+stu.getsName());
        	 System.out.println();
         }
         System.out.println("record retrived successfully");
         session.close(); 
         
         Session session2 = sf.openSession();
          //update  the student information whose id is 1
        // System.out.println(stud);
           Student stud1=(Student) session2.get(Student.class, 5);
           stud1.setfName("ram");
           stud1.setlName("bhosale");
           stud1.setsName("Sadhana High School");
           session2.update(stud1);
         t.commit();
         session2.close();
         System.out.println("Update record successfully ");
         System.out.println();
         
         
        /* //Delete  the student information whose id is
         
         stud=(Student) session.get(Student.class, 2);
         session.delete(stud);
         t.commit();
         System.out.println("Record deleted successfully");
         System.out.println();
         */
         
         
       
         sf.close();
    }
}
