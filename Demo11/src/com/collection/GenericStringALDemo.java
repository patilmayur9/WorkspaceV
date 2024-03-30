package com.collection;

import java.util.ArrayList;

public class GenericStringALDemo {
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("mayur");
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("30");
		al.add("40");
		System.out.println(al);
		for(String str: al)
		{
			System.out.print (str+" ");
		}
	}

}
