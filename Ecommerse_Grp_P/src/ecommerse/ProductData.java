// Write a class ProductData store the all information into Product table 
// Take Dynamic Input from User


package ecommerse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductData {
	
	PreparedStatement ps=null;
	Connection con=null;
	
	public void getProductInfo(String Description,String Name,String Price,String Quantity) throws SQLException
	{
	
		DatabaseConnection DC= new DatabaseConnection();
		con=DC.getConnection();
		
		try {
			   ps= con.prepareStatement("insert into Product(Description,Name,Price,Quantity)values(?,?,?,?);");
		       ps.setString(1, Description);
		       ps.setString(2, Name);
		       ps.setString(3, Price);
		       ps.setString(4, Quantity);

		       int i=ps.executeUpdate();
		       System.out.println("Number of Rows Affected "+i);
		       
		    } catch (SQLException e) {
			
			System.out.println(e);
		    }
		finally {
			
			con.close();
			ps.close();
			
		}
	}

}
