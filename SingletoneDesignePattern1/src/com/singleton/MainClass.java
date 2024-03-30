package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {
	 public static void main(String[] args) throws IOException, ClassNotFoundException {
		 //SingletoneClass obj=new SingletoneClass();//1st way using new key word is not possible becouse constructor is private
		 
		/*SingletoneClass a=SingletoneClass.getSingletoneClass();// 2nd Way output is same only one object is created
		System.out.println(a.hashCode());
		SingletoneClass b=SingletoneClass.getSingletoneClass();
		System.out.println(b.hashCode());*/
		 
		 /*SingletoneClass s=SingletoneClass.getSingletoneClass();// 3rd way using Clone method
		 SingletoneClass s1=s;
		 System.out.println(s.hashCode());
		 System.out.println(s1.hashCode());*/
		
			//this whole procedure also give same ouput
		 //serilization process
		 SingletoneClass obj=SingletoneClass.getSingletoneClass();
		 FileOutputStream fis=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Singltone.txt");
		 ObjectOutputStream fio=new ObjectOutputStream(fis);
		 fio.writeObject(obj);
		 fio.flush();
		 
	     //deserilization process
		 FileInputStream fsi=new FileInputStream("C:\\Users\\Admin\\Desktop\\Singltone.txt");
		 ObjectInputStream ois=new ObjectInputStream(fsi);
		 SingletoneClass s=(SingletoneClass) ois.readObject();
		 SingletoneClass s1=s;
		 
		 System.out.println(obj.hashCode());
		 System.out.println(s.hashCode());
		 System.out.println(s1.hashCode());
		  
		 
	}
	 

}
