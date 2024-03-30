package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
 

public class CRUDOperation
{
	Connection conn1=null;
	PreparedStatement ps=null;
	
	public void crud(String fname, String lname, String city, String mnumber )
	{
		
		ConnectionClass connectionClass=new ConnectionClass();
		conn1=connectionClass.getConnection();
		//System.out.println(conn1);
		try
		{
		
		//create statement		
		ps=conn1.prepareStatement("insert into user (FirstName, LastName, City, MobileNumber)values(?,?,?,?)");
		ps.setString(1,fname);//hear 1=FirstName
		ps.setString(2,lname);//heat 2=LastName
		ps.setString(3,city);//hear  3=City
		ps.setString(4,mnumber);//hear 4=MobileNumber
		int i= ps.executeUpdate();
		System.out.println(i);
		
		//select query	for all table	
		PreparedStatement ps=conn1.prepareStatement("select * from user");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println("id : "+rs.getInt(1));
			System.out.println("First Name : "+rs.getString(2));
			System.out.println("Last Name : "+rs.getString(3));
			System.out.println("City : "+rs.getString(4));
			System.out.println("Mobile Number : "+rs.getString(5));
		}
		System.out.println();
		
		//select using where clause
		System.out.println("Select query using where clause ");
		PreparedStatement ps1=conn1.prepareStatement("Select id,FirstName,LastName from user where id=?");
		ps1.setInt(1, 4);
		ResultSet rs1=ps1.executeQuery();
		while(rs1.next())
		{
		System.out.println("id is: "+rs1.getInt(1));;
		System.out.println("first Name is: "+rs1.getString(2));
		System.out.println("Last Name is: "+rs1.getString(3));
		System.out.println();
		}
	
		
		//select only column
		System.out.println("select only one perticular columan");
		PreparedStatement ps2=conn1.prepareStatement("select firstname, lastname from user;");
		ResultSet rs2=ps2.executeQuery();
		 while(rs2.next())
		 {
			 System.out.println("First Name.. "+rs2.getString(1));
			 System.out.println("Last Name.. "+rs2.getString(2));;
		 }
		 System.out.println();
		 
		 //update query
		 System.out.println("update query ");	//update user set FirstName='mayur', LastName='patil' where id=13
		 PreparedStatement ps4=conn1.prepareStatement("update user set FirstName=?, LastName=? where id=?");
		 ps4.setString(1,"chintu");
		 ps4.setString(2,"aba");
		 ps4.setInt(3, 1);
		 int update=ps4.executeUpdate();
		 System.out.println("update is successfullly first row ");
		 
		 
		 
		 //delete query using where clause
		 PreparedStatement ps3=conn1.prepareStatement("delete from user where id=7");
		 int delete=ps3.executeUpdate();
		 System.out.println("Deleted row 7 "+delete);
		 
 
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		finally 
		{
			 try
			 {
				conn1.close();
				ps.close();
			 }
			 catch (Exception e) 
			 {
				 System.out.println(e);
				e.printStackTrace();
			 }
		}
	System.out.println("Operation Successfully Executed ");
	}

}
