 package com.velocity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass 
{
	public static void main(String[] args) throws CloneNotSupportedException    {
		//Singletone abc=new Singletone(); // this way object creation is not possible because constructor is private
		
		Singletone abc=Singletone.getSingletone();
		Singletone abcd=(Singletone) abc.clone();//it throws CloneNotSupportedException  handle it
		System.out.println("original object-> "+abc.hashCode());	
		System.out.println("cloned object-> "+abcd.hashCode()); 
		try {
			
		FileOutputStream foi=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Singltone.txt");
		ObjectOutputStream oos =new ObjectOutputStream(foi);
		/*this way also be possible
		 * Singleton instance1 = Singleton.getSingletonObject();
		 *  ObjectOutput out = new ObjectOutputStream(new FileOutputStream("E:\\test.txt"));
		 */
		oos.writeObject(abc);
		oos.flush();
		
		
		ObjectInputStream in =new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\Singltone.txt"));
		Singletone singletone=(Singletone) in.readObject();
		
		System.out.println("original object-> "+abc.hashCode());
		System.out.println("after file reading singleton object is -> "+singletone.hashCode());
		}
		catch(Exception e)
		{
			System.out.println(e);
		} finally {
//			oos.close();
		}
	}

}
