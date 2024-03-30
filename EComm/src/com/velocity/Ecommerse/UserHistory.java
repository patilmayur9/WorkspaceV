//===================================================USer History Class===============================================================
// Class Designed By :- Pratik Sonawane
// Once Admin will Select USER PERTICULAR HISTORY  Option then Control will come to this class.
// All the Registred User Names is Fetched from USER REGISTRATION Table and Show on Consol.
// Admin Need to Give Input of One User Name to System.
// Cart History Associated with that user will get fetched from Cart table and Dispaly in front of Admin.
// Last:- Page will be Redirected to Admin Home page
//=======================================================================================================================================


package com.velocity.Ecommerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserHistory {
	
	   PreparedStatement ps=null;
	   Connection con=null;
	   
	   public void getUserList() throws SQLException {
		   
		   System.out.println("Please see the List of Customers=>");  // 
	   
	          DatabaseConnection DC= new DatabaseConnection();  
		      con=DC.getConnection();  // Stored Connection in con varaiable
		      
		      try {
				   
		    	  
		    	  System.out.println(" List of All Users Having the Cart table with Same User-Name\n");
		    	  ps=con.prepareStatement("Select * from userRegistration;");  // Query for Fetch UserName from UserRegistration Table
				    
	            	// We have created Dynamic Cart Table with Reference to usename
				    
				   
				    ResultSet rs=ps.executeQuery();
				    while(rs.next())
				    {
				    	System.out.println("Username= "+rs.getString(8));   // All username will get Printed from UserRegistration Table
                                                                        					
				    }
				    
				//  Admin will Select  the User and Enter the name to display his product produt History
				//  As Cart table is created with table name as Username so We can fetch all Product history of that User    
				    
				          System.out.println("Please Enter the Name of User to Check the Record=>"); // System will ask admin for UserName
				          Scanner  sc= new Scanner(System.in);
				          String tableName= sc.next();
				          String sql= "select * from "+tableName+";";  // User Name is same as Table Name
				        		  
				              try {
				    	
				        	           ps=con.prepareStatement(sql);
				        	           ResultSet rs2=ps.executeQuery();
				        	           
				        	// All Data of that User from Cart Table wil get Fethched
				        	 
				        	    while(rs2.next())
				        	    {
				        	    	 System.out.println("================================");
				        		     System.out.println("Product ID =   "+rs2.getInt(1));
				        		     System.out.println("Product Name = "+rs2.getString(3));
				        		     System.out.println("Description =  "+rs2.getString(4));
				        		     System.out.println("Price =        "+rs2.getString(5));
				        		     System.out.println("Quantity=      "+rs2.getString(6));
				        		     System.out.println("\n");
				        		   
				        		 
				        	      }
				        	 
				               }catch(Exception e)
				        	      {
				        		    System.out.println(e);
				        	      }
				        	 
				        
				    
			       }catch (Exception e)
		           {
				      System.out.println(e);
			       } finally                   // Finally Block Closing Connection Statements
		           {
			    	  
			     	  con.close();
			    	  ps.close();
			      }
		  // =================Redirect to Admin Home Page======================================//
		      
		      AdminView adminView=new AdminView();  // Create the Object of AdminView Class
		         
				try {
					  adminView.AdminHomeTab();  // Call AdminHomeTab method to Redirect into AdminHome Page.
					   
				    } catch (SQLException e)
				    {
					  System.out.println(e);
				    }
	   }
}
	
