//===================================================Check Product Class===============================================================
// Class Designed By :- Pratik Sonawane
// Once Admin will Select Check Product  Qty Option then Control will come to this class to take input from user as Product ID 
// Qty of Stock Associated with This Prodct ID will be Fetch from Product Table and Display the same on Consol.

// Last:- Page will be Redirected to Admin Home page
//=======================================================================================================================================

package com.velocity.Ecommerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckProductQty {
	
	  PreparedStatement ps=null;
      Connection con=null;
      
      
      public void getQuantity() throws SQLException
      {
    	  
    	  DatabaseConnection DC= new DatabaseConnection();   // Object of Database Connection
	      con=DC.getConnection();  // Stored into con Variable ( Connection code)
	      System.out.println("Admin can Check the Available Product Quantity With Referece to Product ID (From Database)\n");
	      System.out.println("\nEnter the Product Id Number= "); // Take Input from Admin as Product ID
	      Scanner sc=new Scanner(System.in);
	      int Id=sc.nextInt();
	      
	      try {
			    ps=con.prepareStatement("Select Quantity from Product where ProductId=?;");  // Dynamic Query for Run to take Id as Positional Parameter
			    
			    ps.setInt(1,Id);
			  
			    
			    ResultSet rs=ps.executeQuery();
			    while(rs.next())
			     {
			    	System.out.println("===============================================================");
			    	System.out.println("Quantity of Product for Id "+Id+" =>  is "+ rs.getInt(1)+" No's");	 // Dispaly the Qty of Product with Ref ID
			    	System.out.println("===============================================================");			     
			     }
			    
			    
		      } catch (SQLException e) {
			    System.out.println(e);
		      } finally {
		    	  
		    	  con.close(); // Connection object Closed
		    	  ps.close();  // Prepared Statement Object Closed
		      }
	      
	      //==============  Redirect to Admin Home Page=======================//
	      
	         AdminView adminView=new AdminView();  // Create the Object of AdminView Class
	         
			   try {
				     adminView.AdminHomeTab();  // Call AdminHomeTab method to Redirect into AdminHome Page.   
			       } catch (SQLException e)
			       {
				     System.out.println(e);
			       }
      }

}



