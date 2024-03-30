package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import java.sql.SQLException;

public class UpdateQuery 
{
	public static void main(String[] args)  
	{ 
		try 
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			//create the connection
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnection?autoReconnect=true&useSSL=false","root","Mayur@123");
																					 
			//create a statement
			PreparedStatement ps=conn.prepareStatement("update employee set password=? where id=? ");
			
			ps.setString(1, "Chintu@123");
			ps.setInt(2, 3);
			boolean b=ps.execute();//it return false because update delete and insert queries it returns  false but select query it returns the true
			System.out.println(b);
			System.out.println(ps.execute());
			conn.close();
			ps.close();
		} 
		catch ( Exception e) 
		{
			 System.out.println(e);
		}
		
 	}

}
