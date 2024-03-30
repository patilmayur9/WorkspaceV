package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExecuteUpdate 
{
	public static void main(String[] args)  
	{
		
		try 
		{
			//load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnection?autoReconnect=true&useSSL=false","root","Mayur@123");
																										//?autoReconnect=true&useSSL=false//for removing warnings
			//create the statement
			PreparedStatement ps=conn.prepareStatement("update employee set UserName=?, password=? where id=?");
			
			ps.setString(1, "chintu");
			ps.setString(2, "chitkule@123");
			ps.setInt(3, 1);
			
			int i=ps.executeUpdate();
			System.out.println(i);
			
			
		}
		catch (Exception e) 
		{
			 
			e.printStackTrace();
		}
		
	}

}
