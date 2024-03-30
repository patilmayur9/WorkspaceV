// Write a Program to fetch the Quantity of product by using Product ID
// Suppose user entered Id of product the he can able to see the qty of that product 

package ecommerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuantityProduct {
	
	  PreparedStatement ps=null;
      Connection con=null;
      
      
      public void getQuantity(int Id) throws SQLException
      {
    	  
    	  DatabaseConnection DC= new DatabaseConnection();
	      con=DC.getConnection();
	      
	      try {
			    ps=con.prepareStatement("Select Quantity from Product where id=?;");
			    
			    ps.setInt(1,Id);
			  
			    
			    ResultSet rs=ps.executeQuery();
			    while(rs.next())
			     {
			    	System.out.println("Quantity of Product for Id => "+Id+" is "+rs.getInt(1));
			    
			    	
			     }
			    
			    
		      } catch (SQLException e) {
			    System.out.println(e);
		      } finally {
		    	  
		    	  con.close();
		    	  ps.close();
		      }
      }

}
