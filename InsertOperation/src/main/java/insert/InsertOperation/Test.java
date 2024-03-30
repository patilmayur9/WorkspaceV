package insert.InsertOperation;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;*/
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
import org.hibernate.*;

public class Test
{
	public static void main(String[] args)
	{ 
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		//insert data into database
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First name : ");
		String name=sc.nextLine();
		student.setFirstName(name);
		
		System.out.println("Enter Last name : ");
		String lname=sc.nextLine();
		student.setLastName(lname);
		
		System.out.println("Enter City : ");
		String city=sc.nextLine();
		student.setCity(city);
		
		System.out.println("Enter Mobile number : ");
		String mobile=sc.nextLine();
		student.setMobile(mobile);
		
		s.save(student);
		t.commit();
		s.close();
		System.out.println("record saved successfull : ");
		 
	}

}
