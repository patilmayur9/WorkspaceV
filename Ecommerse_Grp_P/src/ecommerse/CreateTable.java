// Suppose user select the Product which he want to buy then Selected product must be addes into cart Table
// First i check i can Craete the Cart table with user name

package ecommerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CreateTable {
	
	 PreparedStatement ps=null;
	   Connection con=null;
	   
	   public void getUserList(ArrayList<Integer> al) throws SQLException {
	   
	          DatabaseConnection DC= new DatabaseConnection();
		      con=DC.getConnection();
		      
		      try {
		       String sql="Create table User1(Id int Primary key not null auto_increment,Description varchar(50),"+
		                 "Name varchar(50),Price Varchar(50),Quantity varchar(50))";
		       ps=con.prepareStatement(sql);
		      
	           ps.executeUpdate();
	          
	           System.out.println("User1 table Created Successfully");
	           System.out.println(al.size());
	          // System.out.println(get);
	           
	           for(int i=0;i<al.size();i++) 
	           {
	          
		       ps=con.prepareStatement("insert into User1(Select * from Product where Id=?);");
		       ps.setInt(1,al.get(i));
		       ps.executeUpdate();
		      
	           }
	        
		      
		      //System.out.println("Product inserted into cart table"+i);
		      System.out.println("You can Proceeed for Buy");
		      
		      }catch(Exception e){ 
                	  
                      System.out.println(e);
                      
		          }finally{
		        	  
		        	  con.close();
		        	  ps.close();
		          }
 }	   
	   
}	   