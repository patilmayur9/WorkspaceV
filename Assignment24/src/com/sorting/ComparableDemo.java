/*1. Suppose I have Employee class that containing
 *  I'd, name and city now I want to sort the data based on
 *   comparable interface by using name.*/
package com.sorting;

import java.util.ArrayList;
 
import java.util.Collections;

public class ComparableDemo
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(1,"Mayur","Kolhapur"));
		al.add(new Employee(2,"Abhijit","Belgaum"));
		al.add(new Employee(3,"Pratik","Nashik"));
		al.add(new Employee(4,"Ratan","Bidar"));
		Collections.sort(al);
		System.out.println(al);
		
		for (Employee e:al)
		{
			//System.out.print("Id "+e.getId()+" name "+e.getName()+ " city "+e.getCity()+"|");
			System.out.print( e.getId()+" "+e.getName()+ " "+e.getCity()+" ");
		}
	}

}
