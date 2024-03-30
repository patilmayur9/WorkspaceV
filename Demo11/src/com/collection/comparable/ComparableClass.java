package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableClass
{
	public static void main(String[] args) {
		ArrayList<EmployeeComparable> al=new ArrayList<>();
		al.add(new EmployeeComparable(1, "mayur"));
		al.add(new EmployeeComparable(2, "catil"));
		
		Collections.sort(al);
		
		for(EmployeeComparable e:al)
		{
			System.out.println(e.id);
			System.out.println(e.name);
		}
	}

}
