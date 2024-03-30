//Write a class Admin can able to Retrive all the registred User List from User Data table


package ecommerse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserList {

   PreparedStatement ps=null;
   Connection con=null;
   
   public void getUserList() throws SQLException {
   
         DatabaseConnection DC= new DatabaseConnection();
	      con=DC.getConnection();
	      
	      try {
			    ps=con.prepareStatement("Select * from UserData;");
			   
			    ResultSet rs=ps.executeQuery();
			    while(rs.next())
			    {
			    	
			    	System.out.println("User Id =  "+rs.getInt(1));
			    	System.out.println("F Name =   "+rs.getString(2));
			    	System.out.println("Surame =   "+rs.getString(3));
			    	System.out.println("City =     "+rs.getString(4));
			    	System.out.println("Mobile =   "+rs.getString(5));
			    	System.out.println("Username = "+rs.getString(6));
			    	System.out.println("Password = "+rs.getString(7));
			    	System.out.println("\n");
			    	
			    }
			    
		      } catch (SQLException e) {
			    System.out.println(e);
		      } finally {
		    	  
		    	  con.close();
		    	  ps.close();
		      }

}
}