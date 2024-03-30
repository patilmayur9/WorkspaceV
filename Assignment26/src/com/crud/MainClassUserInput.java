package com.crud;

import java.util.Scanner;

public class MainClassUserInput
{
//	static String fname;
//	static String lname;
//	static String city;
//	static String mnumber;
	 public static void main(String[] args)
	 {
		// id, first name, last name, city and mobile number.
		 Scanner sc=new Scanner(System.in);
		 MainClassUserInput mainClassUserInput=new MainClassUserInput();
		 CRUDOperation cRUDOperation=new CRUDOperation();
		  
		 System.out.println("Enter user First Name : ");
		 String fname=sc.next();
		 
		 System.out.println("Enter user Last Name : ");
		 String lname=sc.next();
		 
		 System.out.println("Enter user City Name : ");
		 String city=sc.next();
		 
		 System.out.println("Enter user Mobile Number : ");
		 String mnumber=sc.next();
		 
		 
		 cRUDOperation.crud(fname, lname, city, mnumber);
		 
		 
	 }

}
