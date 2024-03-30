package com.serilization;

import java.io.*;

public class Student implements Serializable
{
	int id=10;
	String name="nutan";
	String surname="shinde";
	
	public static void main(String[] args)
	{	 Student student=new Student();
		try
		{
			//Serilization code
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\veloctiy.txt");
			ObjectOutputStream oob=new ObjectOutputStream(fos);
			oob.writeObject(student);
			oob.close();
			System.out.println("Serilization Completed ");
			
			
			/*//DeSerilization code
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\veloctiy.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			Student s=(Student)o;
			System.out.println("id"+s.id);
			System.out.println("name"+s.name);
			System.out.println("surname"+s.surname);
			System.out.println("Deserilization");*/
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End of program Execution ");
	}
	
}
