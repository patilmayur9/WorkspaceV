// Write a class where User can able to fetch Product List in Acending Order of price

package ecommerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListAcending {
	
	  PreparedStatement ps=null;
      Connection con=null;
      
      public void listAcending() throws SQLException {
      
          DatabaseConnection DC= new DatabaseConnection();
	      con=DC.getConnection();
	      
	      try {
			    ps=con.prepareStatement("Select * from Product order by Price asc;");
			    
			    ResultSet rs=ps.executeQuery();
			    while(rs.next())
			    {
			    	System.out.println("Id=          "+rs.getInt(1));
			    	System.out.println("Description= "+rs.getString(2));
			    	System.out.println("Name=        "+rs.getString(3));
			    	System.out.println("Price=       "+rs.getString(4));
			    	System.out.println("Quantity>    "+rs.getString(5));
			    	System.out.println("\n");
			    	
			    	
			    }
			    
			    System.out.println("Successful");
			    
		      } catch (SQLException e) {
			    System.out.println(e);
		      } finally {
		    	  
		    	  con.close();
		    	  ps.close();
		      }

 }
}