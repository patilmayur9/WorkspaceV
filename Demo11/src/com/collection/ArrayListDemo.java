package com.collection;
import java.util.ArrayList;
public class ArrayListDemo
{ 
	 public static void main(String[] args)
		{
			ArrayList al = new ArrayList();
			al.add(10);
			al.add("mayur");
			al.add(20);
			al.add(30);
			al.add(null);
			al.add(null);
			System.out.println("before removing Arrray list is "+al);//[10, mayur, 20, 30, null, null]
			al.remove(1);//0th index object will be removed
			System.out.println("After removing  object is "+al);	//[10, 20, 30, null, null] 
		}
}
