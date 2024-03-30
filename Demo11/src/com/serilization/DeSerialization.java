package com.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeSerialization
{
	public static void main(String[] args)
	{
		 
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\serilization.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();//read the object form file return type is Object class
			StudentClass s=(StudentClass)obj;//convert Object class to StudentClass object
			System.out.println("roll no :"+s.rollno);
			System.out.println("name is :"+s.name);
			System.out.println("Address is :"+s.address);
			System.out.println("password is :"+s.password);
			System.out.println("college name is  :"+s.collegeName);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Deserialization is completed");
	}
}
