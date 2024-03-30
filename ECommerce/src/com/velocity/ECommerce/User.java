package com.velocity.ECommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class User  implements requirement
{
	Scanner sc=new Scanner(System.in);
	static String uName;
 
	@Override
	public void aLogin()
	{		 
		
	}

	@Override
	public void userRegistration() 
	{
		String uContact;
		String uMail;
		 
		
		System.out.println("Enter User Deatils ");
		System.out.println("Enter User First Name : ");
		String fName=sc.next();
		System.out.println("Enter User Last Name : ");	
		String lName=sc.next();
		System.out.println("Enter User Address  : ");
		String uAddress=sc.next();
		System.out.println("Enter User Pincode  : ");
		String uPincode=sc.next();
		//for avoid duplication of contact code
		ArrayList<String> al=new ArrayList<String>();
		 int count;
		do {
			count=0;
			System.out.println("Enter User Contact number : ");
			uContact=sc.next();
			
			try
			{
				Connection conn1=DatabaseConnection.getConnection();
				PreparedStatement ps=conn1.prepareStatement("select Contact from userRegistration");
				ResultSet rs=ps.executeQuery();			
				while(rs.next())
				{
					al.add(rs.getString(1));
				}			
			} 
			catch (Exception e1) 
			{
				System.out.println(e1);
			}
		
			for (int i = 0; i < al.size(); i++) 
			{ 
	          if( uContact.equals(al.get(i)))
	          {
	        	  count++;
	        	  System.out.println("Contact is Allready Exist please Enter new Contact Number");
	          }
			}
		}while(count==1);
		 
		//for avoid duplication of mail id code
		ArrayList<String> al1=new ArrayList<String>();
		 int count1;
		do {
			count1=0;
			System.out.println("Enter User Mail Id : ");
			uMail=sc.next();
			
			try
			{
				Connection conn1=DatabaseConnection.getConnection();
				PreparedStatement ps=conn1.prepareStatement("select MailId from userRegistration");
				ResultSet rs=ps.executeQuery();			
				while(rs.next())
				{
					al1.add(rs.getString(1));
				}			
			} 
			catch (Exception e1) 
			{
				System.out.println(e1);
			}
		
			for (int i = 0; i < al1.size(); i++) 
			{ 
	          if( uMail.equals(al1.get(i)))
	          {
	        	  count1++;
	        	  System.out.println("Mail Id is Allready Exist please Enter new  Mail Id");
	          }
			}
		}while(count1==1); 
		//for avoid duplication of user name  code		
		ArrayList<String> al2=new ArrayList<String>();
		 int count2;
		do {
			count2=0;
			System.out.println("Enter UserName : ");
			this.uName=sc.next();
			
			try
			{
				Connection conn1=DatabaseConnection.getConnection();
				PreparedStatement ps=conn1.prepareStatement("select UserName from userRegistration");
				ResultSet rs=ps.executeQuery();			
				while(rs.next())
				{
					al2.add(rs.getString(1));
				}			
			} 
			catch (Exception e1) 
			{
				System.out.println(e1);
			}		
			for (int i = 0; i < al2.size(); i++) 
			{ 
	          if( uName.equals(al2.get(i)))
	          {
	        	  count2++;
	        	  System.out.println("Username is Allready Exist please Enter new User Name ");
	          }
			}
		}while(count2==1);	
		
		System.out.println("Enter Password : ");
		String uPassword=sc.next();
	
		Connection conn=DatabaseConnection.getConnection();
		try 
		{
			PreparedStatement ps1=conn.prepareStatement("insert into userRegistration(FirstName,LastName,Address,Pincode,Contact,MailId,UserName,Password)values(?,?,?,?,?,?,?,?)");
			 
			ps1.setString(1, fName);
			ps1.setString(2, lName);
			ps1.setString(3, uAddress);
			ps1.setString(4, uPincode);
			ps1.setString(5, uContact);
			ps1.setString(6, uMail);
			ps1.setString(7, uName);
			ps1.setString(8, uPassword);			
			int i=ps1.executeUpdate();
			System.out.println(i);
			conn.close();
			ps1.close();
		} 
		catch (SQLException e)
		{
			 System.out.println(e);
		}
		System.out.println("1.Login User \t 2.User Home Page \t 3.Exit");
		
		System.out.println("Enter your Choice : ");
		int a=sc.nextInt();
		User user=new User();
		switch(a)
		{
			case 1:
			{
				user.userLogin();
				break;
			}
			case 2:
			{
				UserView.userHomePage();
				break;
			}
			case 3:
			{
				System.exit(0);
				break;
			}
			default : 
			{
				System.out.println("Invalid Choice");
			}
			
		} 
		 
		
	}
	
	
	
	@Override
	public void userLogin() 
	{		 
		System.out.println("   -:welcome to User login:-    ");
		ArrayList<String> alUName=new ArrayList<>();
		ArrayList<String> alUPass=new ArrayList<>();		
		try  
		{
			 Connection conn=DatabaseConnection.getConnection();
			PreparedStatement ps=conn.prepareStatement("select UserName,Password from userRegistration");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				   alUName.add(rs.getString(1));//all username are added into Array list 
				  alUPass.add(rs.getString(2));	//all passwords are added into Array list			
			}
			 
			conn.close();
			rs.close();
		} 
		catch (Exception e) 
		{  
			 System.out.println(e);
		}
	// System.out.println(alUName);
	// System.out.println(alUPass);
		//code for valid user name and password matching
		int count;
		do 
		{ 
			count=0;
			System.out.println("Enter User name : ");
			  uName=sc.next();			
		 for(int i=0;i<alUName.size();i++)
		 {
			if(uName.equals(alUName.get(i)))
			{			 
				count++;			 		 
			}			 		
		 }
	 
		}while(count==0);
		
		 //code for valid Password matching
				int count1;
				do 
				{	
					count1=0;
					System.out.println("Enter Password : ");
					String password=sc.next();
					
				 for(int i=0;i<alUPass.size();i++)
				 {
					if(password.equals(alUPass.get(i)))
					{
						count1++;							
					}					 		
				 }
				 
				}while(count1==0);	
				
				
				
				System.out.println("1.Show and Buy Product \t 2.User Home Page \t 3.Exit");
				
				System.out.println("Enter your Choice : ");
				int a=sc.nextInt();
				ProductShow productShow=new  ProductShow ();
				
				switch(a)
				{
					case 1:
					{
						productShow.productDetails();
						break;
					}
					case 2:
					{
						UserView.userHomePage();
						break;
					}
					case 3:
					{
						System.exit(0);
						break;
					}
					default : 
					{
						System.out.println("Invalid Choice");
					}
					
				} 
				 
					
				
	}
 

}

//Id,FirstName,LastName,Address,Pincode,Contact,MailId,	UserName,Password
//String sql1="insert into table userRegistration(FirstName,LastName,Address,Pincode,Contact,MailId,UserName,Password)values( "+fName+", "+lName+", "+uAddress+", "+uPincode+", "+uContact+", "+uMail+", "+uName+", "+uPassword+")";



/*try //code for each user new table creation
{
Connection conn=DatabaseConnection.getConnection();
String sql="create table userRegistration(Id int primary key auto_increment not null, FirstName varchar(20), LastName varchar(20), Address varchar(20), Pincode varchar(6), Contact varchar(10), MailId varchar(20), UserName varchar(20), Password varchar(20))";
PreparedStatement ps=conn.prepareStatement(sql);
int j=ps.executeUpdate();
System.out.println(j);
conn.close();
ps.close();
} 
catch (SQLException e) 
{
	 System.out.println(e);
}	
*/
