package com.collection;

import java.util.ArrayList;
import java.util.Collection;
public class ArrayListRemoveElement { 
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("mumbai");
		list.add("pune");
		list.add("Hyderabad");
		list.add("Banglore");
		list.add("mumbai");
		System.out.println("Old ArrayList "+list);
	 for( int i=0;i<list.size();i++)
	 {
		 list.remove("mumbai");
	 }
	  System.out.println("New ArrayList "+list);
	}

}
