//this class is devloped by ezaz

package com.velocity.ECommerce;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.Scanner;

public class AdminLogin extends Properties implements requirement {
	Scanner sc = new Scanner(System.in);

	@Override
	public void aLogin() {
		String tableUserName = null, TablePassword = null;
		try {
			FileInputStream fis = new FileInputStream("E:\\velocity_eclips_workspace\\ECommerce\\admin.properties");
			Properties p = new Properties();
			p.load(fis);
			tableUserName = p.getProperty("username");
			TablePassword = p.getProperty("password");
		} catch (Exception e) {
			System.out.println(e);
		}

		int count;
		do {
			count = 0;
			System.out.println("Enter Admin User Name : ");
			String userName = sc.next();

			System.out.println("Enter Password : ");
			String password = sc.next();

			if ((userName.equals(tableUserName)) && password.equals(TablePassword)) {
				System.out.println("Valid Admin ");
				count++;
			} else {
				System.out.println("User Name and Password is not Valid ");
			}
		} while (count == 0);
		AdminView adminView = new AdminView();
		adminView.AdminHomeTab();
	}

	@Override
	public void userRegistration() {
		// TODO Auto-generated method stub
	}

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
	}

}
