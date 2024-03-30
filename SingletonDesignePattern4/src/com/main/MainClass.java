package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {
	{
		System.out.println("this is main method instance block");
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		SingletonClass s = new SingletonClass(); this is not valid because constructor is private
		SingletonClass singletonClass;
		 
			 singletonClass = SingletonClass.getSingletonClassObject();
			 SingletonClass s = (SingletonClass) singletonClass.clone();
			 System.out.println(singletonClass.hashCode());
			 System.out.println(s.hashCode());
			 
			 FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Singltone.txt");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject(singletonClass);
			 oos.flush();
			 
			 FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Singltone.txt");
			 ObjectInputStream ois= new ObjectInputStream(fis);
			 SingletonClass s1 = (SingletonClass) ois.readObject();
			 
			 System.out.println(s1.hashCode());
			 
			 
			 
	}

	 

}
