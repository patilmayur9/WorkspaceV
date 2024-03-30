package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsingExecuteStatement 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");//ClassNotFoundException
		
		//create the connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnection?autoReconnect=true&useSSL=false","root","Mayur@123");
		
		//create Statement
		Statement s=conn.createStatement();
		
	 	String sql="update employee set UserName='ram'";
		
		//String sql="select * from employee";//true
		System.out.println(s.execute(sql));//except select all condition return type is false
		
	}

}
 