package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass 
{
	 Connection conn=null;
	  public Connection getConnection()
	  {
		  
		  try
		  {
			  //load the class driver 
			  Class.forName("com.mysql.jdbc.Driver");
			
			//make a connection or create connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment26?autoReconnect=true&useSSL=false","root","Mayur@123");
			
			
		  }
		  catch ( Exception e)
		  {
			  System.out.println(e);
			//e.printStackTrace();
		  }
		  return conn;
	  }
	  
}
