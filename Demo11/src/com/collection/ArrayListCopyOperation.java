package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCopyOperation 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(40);
		al1.add(50);
		al1.add(60);
		
		al.addAll(al1);
		System.out.println(al);//using sop also we can print the data but we can not perform any operation on it
		
		//using Iterator we print the data//we can perform any type of operation 
		Iterator<Integer> it=al. iterator ();
		while(it.hasNext())
			{
				System.out.print(it.next()+" ");
				 
			}
		 
		
	}

}
