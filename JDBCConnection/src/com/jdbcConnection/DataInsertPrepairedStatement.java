package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataInsertPrepairedStatement 
{
	public static void main(String[] args) //throws Exception
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//cj put cj for warning removing pourpose
		
		Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnection?autoReconnect=true&useSSL=false","root","Mayur@123");//?autoReconnect=true&useSSL=false use for wrning removing pourpose
		
		PreparedStatement pstatement=com.prepareStatement("insert into Employee(UserName,password)values(?,?)");
		pstatement.setString(1,"pratik");//first value username only
		pstatement.setString(2,"Pratik@123");//second value password only
		
		int i=pstatement.executeUpdate();
		System.out.println("record inserted successfuly "+i);
		//updating the username
		PreparedStatement pstatement2=com.prepareStatement("update employee set UserName='ravi' where id=1");
		pstatement2.executeUpdate();
		 
		
		com.close();
		pstatement.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
	}
}
