package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllData
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//load main driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnection?autoReconnect=true&useSSL=false","root","Mayur@123");
		
		
		//create Statement
		PreparedStatement ps=conn.prepareStatement("select * from employee ");
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println("Empoyee id is "+rs.getInt(1));
			System.out.println("Empoyee User Name is "+rs.getString(2));
			System.out.println("Empoyee id is "+rs.getString(3));
			System.out.println();
		}
	}

}
