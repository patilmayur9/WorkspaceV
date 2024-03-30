package com.collection;

import java.util.ArrayList;

public class GenericArraylistDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		for (int i:al)
		{
			System.out.print(i+" ");
		}
	}

}
