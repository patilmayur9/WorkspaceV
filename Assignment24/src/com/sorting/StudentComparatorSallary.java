package com.sorting;

import java.util.Comparator;
//comparable by sallary 
public class StudentComparatorSallary implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSalary() > o2.getSalary())
		{
			return -1;//hear change -1 only then it will give you decending order sallary

		}
		else if(o1.getSalary() == o2.getSalary())
		{
			return 0;
		}
		else
		{
			return 1;//hear change 1 only then it will give you decending order sallary
		}
	}
	 
	 
}

