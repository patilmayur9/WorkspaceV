package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUTIL
{
	

	public static void save(Employee emp) 
	{
		Connection conn=DBUTIL.getConnection();;
		PreparedStatement ps=null;
		try {
			
		ps=conn.prepareStatement("insert into Employee (UserName,Password)values(?,?)");
		ps.setString(1, emp.getUsername());
		ps.setString(2, emp.getPassword());		
		ps.executeUpdate();	
		System.out.println("Data inserted successfull");		
		conn.close();
		ps.close();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

	public static Connection getConnection() {
				Connection conn=null;			
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspservlet?autoReconnect=true&useSSL=false","root","Mayur@123");
					 
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
				return conn;		
	}
	
	public static List<Employee> getAllEmployee()
	{
		Connection conn=DBUTIL.getConnection();
		PreparedStatement ps=null;		
		ArrayList<Employee> al=new ArrayList<Employee>();//emp,emp,emp
		
		try {
			ps=conn.prepareStatement("select * from Employee ;");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Employee emp=new Employee();
				
				emp.setId( rs.getInt(1));
				emp.setUsername(rs.getString(2));
				emp.setPassword(rs.getString(3));
				al.add(emp);				
			}
			conn.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return al;		
	}
	
	public static int delete(int id)
	{
		int status=0;
		Connection conn=DBUTIL.getConnection();
		PreparedStatement ps=null;
		
		try {
			ps=conn.prepareStatement("delete from Employee where id = ?");
			ps.setInt(1, id);
			status=ps.executeUpdate();
			 
			System.out.println("Data delted successfully");
			conn.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
