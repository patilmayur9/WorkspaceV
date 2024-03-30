package com.velocity.ECommerce;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection 
{
	static Connection conn=null;
	static public Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false","root","Mayur@123");
		} 
		catch (Exception e) 
		{
			 System.out.println(e);
		}
	return conn;	
	}
	

}
