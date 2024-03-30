// Program for Universal Test Connection
// We will use this universal test connection throughout the project
package ecommerse;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	public Connection getConnection() {
		
          Connection connection=null;
          
          try {
        	  
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =  DriverManager.getConnection("jdbc:mysql://Localhost:3306/ecommerse ?autoReconnect=true & useSSL=false","root","ravindra");
			
			
		    } catch (Exception e) {
			
			  System.out.println(e);
		    }
          
  		return connection; 
	}
	
}
