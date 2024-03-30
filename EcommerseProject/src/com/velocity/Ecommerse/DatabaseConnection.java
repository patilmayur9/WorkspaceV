//=============================================================Database Connection=====================================================

// Class Designed By:- Ravindra Palaskar
// Load the Connection Driver
// Set the Connection Parth with Username and Password
// We used this Coonection Class object in our Every class to Estblish the connection and Database Operation
//======================================================================================================================================
package com.velocity.Ecommerse;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	static Connection conn = null;

	static public Connection getConnection() {
		try {
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the Connection with MySql
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectecommerse?autoReconnect=true&useSSL=false",
					"root", "Mayur@123");

		} catch (Exception e) {
			System.out.println(e);
		}

		return conn;

	}

}
