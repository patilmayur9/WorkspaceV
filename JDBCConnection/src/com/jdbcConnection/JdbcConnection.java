package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class JdbcConnection 
{
	public static void main(String args[])
	{
		try 
		{
		String sql="insert into user (lastName,firstName,Address,City,Salary) values"
				+ "('patil','mayur	','gondikuppi','berlin','80000')";
		
		//load the mysql driver //Class.forName("com.mysql.cj.jdbc.Driver");use this to overcome warings
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection//hear javaconnection is a schemas name
			
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnection?autoReconnect=true&useSSL=false","root","Mayur@123");
			//create the sql statement
			Statement statement=conn.createStatement(); 
			
			//submit the sql statement to database
			//statement.executeUpdate(sql);
			statement.execute(sql);
			
			System.out.println("Data inserted Successfully ");
			conn.close();
			statement.close();
			
		} 
		catch (  Exception e) 
		{
			 System.out.println(e);
			//e.printStackTrace();
		}
	}

}
