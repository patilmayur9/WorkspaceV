package com.velocity.ECommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class PerticularUserHistory
{
	public static void userHistory()
	{
		System.out.println("in user history");
		Connection conn=null;
		PreparedStatement ps=null;
		
		try 
		{
			String sql="select UserName from userRegistration";
			
			
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{			 
				System.out.println(rs.getString(7));
			}			
			conn.close();
			ps.close();
		} 		catch (Exception e) {
			e.printStackTrace();
		 System.out.println("....."+e);
		}
	}

}
