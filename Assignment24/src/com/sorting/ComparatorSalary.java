/*2. Suppose I have Student class containing 
 * I'd, name and salary now 
 * I want to sort the data based on comparator interface by using salary.*/
package com.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorSalary {
	public static void main(String[] args) {
		List<Student> emp = new ArrayList<Student>();
		/*
		 * emp.add(new Student(1, "Abhijit", 10000));
		 * emp.add(new Student(2, "Vijay",11000)); 
		 * emp.add(new Student(3, "Rajan", 8000)); 
		 * emp.add(new Student(4,"pratik", 3000));
		 */
		emp.add(new Student(10, "Vijay", 2500)); // Obj2
		emp.add(new Student(20, "Ajay", 1500)); // Obj1
		emp.add(new Student(30, "Sanjay", 3000));
		emp.add(new Student(40, "Sanjay", 2000));

		System.out.println(emp + " ");

		// this comparator for sallary ascending
		Collections.sort(emp, new StudentComparatorSallary());// hear give the comparator implimented class name
		System.out.println(emp + " ");

		Collections.sort(emp, new StudentcomparatorName());//hear will give the ans name wise acending order
		System.out.println(emp + " ");
	}

}
