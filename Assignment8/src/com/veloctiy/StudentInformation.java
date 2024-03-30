package com.veloctiy;
 

import java.util.Scanner;

public class StudentInformation
{	 	
	public void getStudentInformation()
	{
		Student student=new Student();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Student Frist name : ");
		student.firstName=scanner.nextLine();
	 		
		System.out.println("Enter Student Last name : ");
		student.lastName=scanner.nextLine();
		
		System.out.println("Enter Student city : ");
		student.city=scanner.nextLine();				
		
		System.out.println("Enter Student Contact number : ");
		student.mobileNumber=scanner.nextLong();	 
	
		student.country="Hindustan";
		
		setStudentInformation(student.firstName, student.lastName,student.city,student.mobileNumber,student.country);		
	}
	 
	public void setStudentInformation(String firsrtName, String lastName, String city, long mobileNumber, String country )
	{
		System.out.println("Student information is : ");
		
		System.out.println("Student First Name is : "+ firsrtName);
		
		System.out.println("Student Last Name is : "+ lastName);
		
		System.out.println("Student city Name is : "+ city);
		
		System.out.println("Student Contact Number is : "+ mobileNumber);
		
		System.out.println("Student country Name is : "+ country);
		
	}

	public static void main(String args[])
	{
		StudentInformation studentinformation=new StudentInformation();
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter the no of Student list You Required : ");
		int num=scanner.nextInt();
		
		
		for(int i=0; i<num;i++) 
		{
			studentinformation.getStudentInformation();
		} 
	}
}