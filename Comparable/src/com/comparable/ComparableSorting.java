package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSorting 
{
	public static void main(String[] args) {
		 ArrayList<Employee> al=new ArrayList<Employee>();
		 al.add(new Employee(1, "a"));
		 al.add(new Employee(2, "b"));
		 al.add(new Employee(3, "c"));
		 System.out.println("Before sorting-> "+al);
		 Collections.sort(al);
		 
		 for(Employee e:al)
		 {
			 System.out.println(e.id+" "+e.name);
		 }
	}

}
