package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class SelectQuery 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//loading driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnection?autoReconnect=true&useSSL=false","root","Mayur@123");
		
		PreparedStatement ps=con.prepareStatement("select UserName, password from employee");
		
		boolean b=ps.execute();
		System.out.println(b);
		
		ResultSet rs=ps.executeQuery();
		
		while (rs.next())
		{
			System.out.println("UserName is "+rs.getString(1));
			System.out.println("UserName is "+rs.getString(2));
			
		} 
		
		
PreparedStatement ps1=con.prepareStatement("select UserName, password from employee where id=?");
		ps1.setInt(1, 2);
		boolean c=ps.execute();
		System.out.println(c);
		
		ResultSet rs1=ps.executeQuery();
		
		while (rs1.next())
		{
			System.out.println("UserName is "+rs1.getString(1));
			System.out.println("UserName is "+rs1.getString(2));
			
		} 
		System.out.println("End of the main method : ");
	}

}
