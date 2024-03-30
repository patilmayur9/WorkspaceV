package com.collection;
import java.util.ArrayList;
public class ArrayListMethods
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("List "+ al);  
		System.out.println("Size  "+al.size());//it giv the index size 
		System.out.println("Contain method "+ al.contains(80));//it checks the 80 object is present in al list or not boolean retrun type
		System.out.println("Contain method  "+ al.contains(50));
		
	}

}
