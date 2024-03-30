// Write the Class to save the Data in Database for which you have taken input from user
// Program will take data from User and Store into User Table

package ecommerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserData {
	
          PreparedStatement ps=null;
          Connection con=null;
          
       public void getUserData(String Name,String Surname,String City,String Mobile,String Username,String Password) throws SQLException {
    	   
    	   DatabaseConnection DC= new DatabaseConnection();
    	   con=DC.getConnection();
    			   
    	   try {
			     ps=con.prepareStatement("insert into UserData(Name,Surname,City,Mobile,Username,Password)values(?,?,?,?,?,?)");
			     
			     ps.setString(1, Name);
			     ps.setString(2, Surname);
			     ps.setString(3, City);
			     ps.setString(4, Mobile);
			     ps.setString(5, Username);
			     ps.setString(6, Password);
			     
			     int i=ps.executeUpdate();
			     System.out.println("Number of record Updated "+i);
			     System.out.println("Congratualtion You are Successfully Register into our System");
			     System.out.println("You can see and buy our Product");
			     
		       } catch (SQLException e) {
			
			     System.out.println(e);
		      } finally {
		    	  
		    	  con.close();
		    	  ps.close();
		      }                     
       }
}
