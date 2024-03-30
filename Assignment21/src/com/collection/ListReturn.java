package com.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class ListReturn
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=returnList();
		TreeSet<String> ts=new TreeSet<String>(list);//converting arraylist for ouput as a assending order 
		 ArrayList<String> al=new ArrayList<String>(ts);
		System.out.println("Before sorting array is "+list);
		 System.out.println("Size of the ArrayList is : "+al.size());
		 System.out.println("After sorting array in descending order is ");
		 for(int i= 5-1;i>=0;i--)
		 { 
			 System.out.print(al.get(i)+" ");
		 }
		
	}
	 public static ArrayList<String> returnList()
	 {
		 ArrayList<String> al=new ArrayList<String>();
		  al.add("Ram");
		  al.add("Sohan");
		  al.add("Ashok");
		  al.add("Ajay");
		  al.add("Prasanna");
	 
		  return al;
	 }
}
