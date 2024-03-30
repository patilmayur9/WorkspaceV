package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 

public class DeleteQueryStatement 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//create connection
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnection","root","Mayur@123");
		
		//crete Statement
		String sql="Delete from employee where id=3";
		Statement st=conn.createStatement();
		int b=st.executeUpdate(sql);
		System.out.println(b);
	
	}

}
