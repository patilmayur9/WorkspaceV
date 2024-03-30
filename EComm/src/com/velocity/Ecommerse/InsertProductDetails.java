//===================================================Insert Product Class===============================================================
// Class Designed By :- Mohd Ezaz
// Once Admin will Select "Insert Product Option" Control will come to this class. 
// It will take input from user and store the same into Product Table
// Last:- Page will be Redirected to Admin Home page
//=======================================================================================================================================

package com.velocity.Ecommerse;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertProductDetails

{
	
	 Connection conn=DatabaseConnection.getConnection();		
	 PreparedStatement ps1;
	 
	public void insertProduct() throws SQLException{
		
	//  # product id,name, description, price,  quantity.

	
		Scanner sc=new Scanner(System.in);
		
			 System.out.println("Enter Product Name : ");
			 String pName=sc.nextLine();
			
			 System.out.println("Enter Product Description : ");
			 String pDescription=sc.nextLine();
			
			 System.out.println("Enter Product Price : ");
			 String pPrice=sc.nextLine();
			
			 System.out.println("Enter Product Quantity : ");
			 int pQuantity=sc.nextInt();
			 
			 
		// Database connection code to Insert the User Input value into Database
			 
			
			try 
			{
				ps1 = conn.prepareStatement("insert into product(Name,Description,Price,Quantity)values(?,?,?,?)");		 
				ps1.setString(1, pName);
				ps1.setString(2, pDescription);
				ps1.setString(3, pPrice);
				ps1.setInt(4, pQuantity);
		 	
				int i=ps1.executeUpdate();
				
				System.out.println("No of Records Inserted into Database "+i+"\n");
				conn.close();
				ps1.close();
				
			}
			catch (Exception e)
			{
				System.out.println(e); 
			} 
			
		 
		AdminView adminView=new AdminView();
		try {
			  adminView.AdminHomeTab();  // Call AdminHomeTab method to Redirect into AdminHome Page.
			  
		    } catch (SQLException e)
		    {
			  System.out.println(e);
		    }
	   }
}
