package com.velocity.Ecommerse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class democlass  
{
	 public static void main(String[] args) throws Exception 
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the Connection with MySql
		 Connection 	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userregistration?autoReconnect=true&useSSL=false","root","Mayur@123");		 
		  
		 PreparedStatement ps=conn.prepareStatement("insert into xyz (firstname,lastname)values(?,?);");
		 ps.setString(1, "mayur");
		 ps.setString(2, "Patil");
		ps.executeUpdate();
		conn.close();
		ps.close();
		System.out.println("sucessfull...");
	 }
	 

}
