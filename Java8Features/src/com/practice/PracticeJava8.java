package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeJava8 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(29);
//		System.out.println("ArrayList elements are : "+al);
//		
//		
//		//filter even number only in given list
//		System.out.println("Even numbers : ");
//		al.stream().filter(num -> num%2 == 0).forEach(System.out::println);
//		Long count = al.stream().filter(num -> num%2 == 0).count();
//		System.out.println("Total even numbers present in list "+count);
//		
//		
//		//find minimum number in list
//		Integer min = al.stream().min((a,b) -> a.compareTo(b)).get();
//		//OR
//		Integer min1 = al.stream().max((a,b) -> -a.compareTo(b)).get();
//		System.out.println("minimum number is -> "+min);
//		System.out.println("minimum number using second way put - signe in compareTo method -> "+min1);
//		
		
		
		List<String> list5 = new ArrayList<String>();
		list5.add("Vijay");
		list5.add("Ajay");
		list5.add("Sanjay");
		list5.add("abcd");
		list5.add("abc");
		list5.add("ABC");
		 
		System.out.println("The original ArrayList is  " +list5);
	 
		//I want to only those string whose length is less than 6 and sort by Ascending
		List<String> stringList = list5.stream().filter(string -> string.length() <=  6).sorted().collect(Collectors.toList());
		list5.stream().filter(a -> a.length() <=  4).sorted().forEach(System.out::println);
		
		//sort using Descending order
		System.out.println("Sorted list in descending order ");
		list5.stream().sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);
		
		// Min String length get 
		String s = list5.stream().min((a,b) -> a.compareTo(b)).get();
		 list5.stream().min((a,b) -> a.compareTo(b)).ifPresent(System.out::println);
		System.out.println("minimum string is " +s); //Ajay
		
		// Max element
		String max = list5.stream().max((a,b) -> a.compareTo(b)).get();
		System.out.println("Max element in List is "+max);
		
		
		// get all minimum Strings
		 List<String> minStrings = list5.stream()
	                .collect(Collectors.groupingBy(String::length, Collectors.toList()))
	                .entrySet().stream()
	                .min(Entry.comparingByKey())
	                .map(Entry::getValue)
	                .orElse(new ArrayList<>());

	        System.out.println("Minimum Strings: " + minStrings);  
	         
	       List<String> groupedByLength = list5.stream()
	           .collect(Collectors.groupingBy(String::length))
	           .entrySet().stream().min(Entry.comparingByKey())
	           .map(Entry::getValue).orElse(new ArrayList());
	       System.out.print("groupedByLength-> "+groupedByLength);
	        
	        //OR
	        /*
	         * 
	         *     Map<Integer, List<String>> groupedByLength = list5.stream()
                .collect(Collectors.groupingBy(String::length)); 
				System.out.println("groupedByLength--> "+groupedByLength);
				
        		int minLength = groupedByLength.keySet().stream().min(Integer::compareTo).orElse(-1); // Default value if the list is empty
				System.out.println("minLength -> "+minLength);
				
        		List<String> minStrings = groupedByLength.getOrDefault(minLength, new ArrayList<>()); 
	        	System.out.println("Minimum Strings: " + minStrings); 
	         */
 
	     //find n number of fibonasci series
	       int n = 10; 
	       Stream.iterate(new int[] {0,1},a -> new int[] {a[1], a[0] + a[1]}).limit(n).map(a -> a[0]).forEach(System.out::println);
	       
	       
	       
	        
	       
	       
		
	}

}