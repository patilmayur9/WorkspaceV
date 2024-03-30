package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableStudentSorting {
	public static void main(String[] args) {
		List<Student> studList = new ArrayList<>();
		studList.add(new Student(1, "mayur"));
		studList.add(new Student(2, "Shridhar"));
		studList.add(new Student(3, "Pratik"));
		studList.add(new Student(4, "Yogesh"));
		
		Collections.sort(studList);
		
		System.out.println(studList);
	}

}
