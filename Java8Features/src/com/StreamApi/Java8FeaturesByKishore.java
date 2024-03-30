package com.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Java8FeaturesByKishore {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 24, 45, 56, 34, 7, 89, 4, 4, 90, 220, 90);
		System.out.println("Original array list is " + list);

		 //Given a list of integers, sort all the values present in it using Stream functions?
		System.out.println("list is sorted using .sorted() default sort asce -> ");
		list.stream().sorted().forEach(System.out::println);

		// Given a list of integers, sort all the values present in it in descending order using Stream functions?
		System.out.println("list is sorted using .sorted(Collections.reverseOrder()) desc sorting -> ");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		//3. How to find duplicate elements in a given integers list in java using Stream functions?
	     System.out.println("list duplicate element");
	     Set<Integer> duplicate = new HashSet<>();
	     list.stream().filter(a -> !duplicate.add(a)).forEach(System.out::println);
	     
	     System.out.println("list first element");
	     list.stream().findFirst().ifPresent(System.out::println);
	     
	     
	    int max =  list.stream().max(Integer::compare).get();
	    System.out.println("list maximum value "+max);

	}

}
