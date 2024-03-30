//====================================================Admin Login Class Extenends the Properties File==================================================

// Classs Designed By:- Mohd Ezaz

// Fetch  UserName and Password from Properties File.
// Created one Properties File and Saved Username and Password into that, Admin is single person so we have stored hardcore value into Properties file.
// String Equals method cheeck for Validation of Username and Password 
// If Found OK then He can Login and access Admin Fetaures or Else will Show massage for Enterring correct USername and Password
//=======================================================================================================================================================

package com.velocity.Ecommerse;

import java.io.FileInputStream;

import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class AdminLogin extends Properties {
	Scanner sc = new Scanner(System.in);

	public void aLogin() {
		String tableUserName = null, TablePassword = null;
		try {

			// With FileInputStream Give path for accesscing Properties File

			FileInputStream fis = new FileInputStream(
					"E:\\velocity_eclips_workspace\\EcommerseProject\\admin.properties");
			Properties p = new Properties();
			p.load(fis); // Load the Properties File
			tableUserName = p.getProperty("username"); // Fetch Username from Properties and store into usernamevariable
			TablePassword = p.getProperty("password"); // Fetch Password from Properties and store into password
														// varaiable

		} catch (Exception e) {
			System.out.println(e);
		}

		int count;
		do {
			count = 0;
			System.out.println("Enter Admin User Name : "); // Take input from user for Username Store into variable
			String userName = sc.next();

			System.out.println("Enter Admin Password : "); // Take Input from user for Password and Store into variable
			String password = sc.next();

			// Check the User Input Details Match with Properties File

			if ((userName.equals(tableUserName)) && password.equals(TablePassword)) {
				System.out.println("\nAuthentication Successful...!! ");
				count++;
			} else {
				System.err.println("User Name and Password is not Valid. Please Enter Valid Login Details ");
			}
		} while (count == 0);

// If User will Enter the Correct Login details then we call the Admin View Method in which we have provided all Option for admin.

		AdminView adminView = new AdminView();

		try {

			adminView.AdminHomeTab(); // Call of Admin view method after Authentication Successful.
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
