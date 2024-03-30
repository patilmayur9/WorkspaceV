package com.serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerilizationProcess 
{
	public static void main(String[] args)
	{
		StudentClass s=new StudentClass();
		s.rollno=10;
		s.name="Mayur";
		//s.password=123;
		StudentClass.collegeName="mayur1";//static variable we can access using class name direct
		s.address="kop";
		 
		
		
		try
		{
		FileOutputStream foi=new FileOutputStream("C:\\Users\\Admin\\Desktop\\serilization.txt");
		ObjectOutputStream oos=new ObjectOutputStream(foi);
		oos.writeObject(s);
		oos.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		System.out.println("Serilization is completed ");
	}
}
