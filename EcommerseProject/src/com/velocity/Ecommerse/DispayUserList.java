//===================================================Dispaly User History Class===============================================================

// Class Designed By :- Pratik Sonawane
// Once Admin will Select USER HISTORY  Option then Control will come to this class.
// All the Registred User is Fetched from USER REGISTRATION Table and Show on Consol.
// Last:- Page will be Redirected to Admin Home page
//=======================================================================================================================================

package com.velocity.Ecommerse;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DispayUserList {
	 PreparedStatement ps=null;
	   Connection con=null;
	   
	   public void getUserList() throws SQLException {
	   
	         DatabaseConnection DC= new DatabaseConnection();  // Database connection Object
		      con=DC.getConnection();
		      
		      try {
		    	  
		    	  // Query for Select All details from User Regitration Table
		    	  
				    ps=con.prepareStatement("Select * from userRegistration;");
				   
				    ResultSet rs=ps.executeQuery();
				    while(rs.next())
				    {
				    	
				   // Dispaly the Details of Registred User 	
				    	System.out.println("===========================\n");
				    	System.out.println("User Id=   "+rs.getInt(1));
				    	System.out.println("First Name="+rs.getString(2));
				    	System.out.println("Last Name= "+rs.getString(3));
				    	System.out.println("Address=   "+rs.getString(4));
				    	System.out.println("Pin Code=  "+rs.getString(5));
				    	System.out.println("Contact=   "+rs.getString(4));
				    	System.out.println("MailID=    "+rs.getString(5));
				    	System.out.println("Username=  "+rs.getString(6));
				    	System.out.println("Password=  "+rs.getString(7));
				    	System.out.println("\n");
				    	
				    }
				    
			      } catch (SQLException e) {
				    System.out.println(e);
			      } finally {                     // Connection Closing in Finally Block.
			    	  
			    	  con.close();
			    	  ps.close();
			      }
           //=====================Redirecting to Admin Home Page================================//
		      
		      AdminView adminView=new AdminView();  // Create the Object of AdminView Class
		         
				try {
					  adminView.AdminHomeTab();  // Call AdminHomeTab method to Redirect into AdminHome Page.	   
				    } catch (SQLException e)
				    {
					  System.out.println(e);
				    }
		      
	}
}


