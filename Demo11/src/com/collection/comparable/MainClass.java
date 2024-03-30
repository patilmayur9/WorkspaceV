package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1, "mayur", 10000));
		emp.add(new Employee(2, "tukaram", 15000));
		emp.add(new Employee(3, "jotiba", 8000));
		emp.add(new Employee(4, "masoba", 1500));
		
		Collections.sort(emp);//data is sorted using name in natural sorting assending order 
		
		for (Employee emp1: emp)
		{
			System.out.println(emp1);
		}
		
	}

}
