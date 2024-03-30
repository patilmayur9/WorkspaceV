// Write a clas for Calualte Sum of price for which User added the Products into Cart:

package ecommerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartPriceSum {
	
	  PreparedStatement ps=null;
      Connection con=null;
      
      
      public void getCartSum() throws SQLException
      {
    	  
    	  DatabaseConnection DC= new DatabaseConnection();
	      con=DC.getConnection();
	      
	      try {
			    ps=con.prepareStatement("select sum(price) from User1;");
			    System.out.println("Sum of Total Cart Price for User1\n");
			    
			    ResultSet rs=ps.executeQuery();
			    while(rs.next())
			    {
			    	System.out.println("Sum of Price="+rs.getString(1));
			    	
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



