package com.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJava8 
{
	public static void main(String[] args) {
	 	
  		ArrayList<Integer> al=new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(29);
		System.out.println("ArrayList elements are : "+al);
		 
		
		//filter even number only in given list
		List<Integer> al1 =al.stream().filter(a -> a%2 == 0).collect(Collectors.toList());
	
		System.out.println("->"+al.stream().filter(a->a%2==0).collect(Collectors.toList()));
		System.out.println("->"+al.stream().filter(a->a%2==0).count());
		
		//filter even number only in given list
		System.out.println(al.stream().filter(a->a%2==1).collect(Collectors.toList()));
		System.out.println(al.stream().filter(a->a%2==1).count());
		
		//add 10 in each element in list
		System.out.println(al.stream().map(a->a+10).collect(Collectors.toList()));
		
		//find odd number and its count
		System.out.println("Odd count "+al.stream().filter(a->a%2==1).count());
		
		//find even number and its count
		System.out.println("Even count "+al.stream().filter(a->a%2==0).count());
		
		int min = al.stream().min((a,b) -> a.compareTo(b)).get();
		System.out.println("minimum number is -> "+min);
		
		//min natural sorting
		System.out.println("Min number in list "+al.stream().min((a,b)->a.compareTo(b)).get());
		 
		//Max number in list
		System.out.println("Max number in list "+ al.stream().max((a,b)->(a.compareTo(b))).get());
		
		//min natural sorting with minus sign it shows opposite result
		System.out.println("Min number in list with - sign "+al.stream().min((a,b) -> -a.compareTo(b)).get());
		
				//Max number in list with minus sign it shows opposite result
				System.out.println("Max number in list  with - sign "+ al.stream().max((a,b) -> (-a.compareTo(b))).get());
		/*		  
		//I want to filter even numbers only from List
		List<Integer> list = al.stream().filter(i -> (i%2==0)).collect(Collectors .toList());
		System.out.println(list);
		
		// I want to filter odd numbers only from list
		List<Integer>list1 = al.stream().filter(j->(j%2!=0)).collect(Collectors.toList());
		System.out.println(list1);
		
		//i want to add 10 in each element in list 
		List<Integer> list2 = al.stream() .map(s -> (s + 10)) .collect(Collectors .toList());
		System.out.println(list2);
		
		//i want to substract 2 in each element in list
		List<Integer>list3 = al.stream().map(m->(m-2)).collect(Collectors.toList());
		System.out.println("substraction 2 in each element  "+list3);
		
		//add 3 in each element and find the odd numbers
		List<Integer>list4 = al.stream().map(m -> (m+3)).filter(m->(m%2!=0)).collect(Collectors.toList());
		System.out.println(al+" "+list4);
		
		//take even number and also take count of even number
		Long cnt=al.stream().filter(s->(s%2==0)).count();
		System.out.println("count is of even number is "+cnt);
		
		//take value greater than 10
		List list5 =al.stream().filter(s->(s>10)).collect(Collectors.toList());
		System.out.println("Greter than 10 value  is "+ list5);
		*/
		 //min natural sorting 
//		Integer str=al.stream().min((s1,s2)->s1.compareTo(s2)).get();
//		 System.out.println("min number is "+str);
//		 
//		 //min -natural sorting
//		 Integer str1=al.stream().min((s1,s2)->(-s1.compareTo(s2))).get();
//		 System.out.println("min -s1.compareTo(s2)  : "+str1);
//		 
//		 //max.
//		Integer str2= al.stream().max((s1,s2)->(s1.compareTo(s2))).get();
//		System.out.println("max number  is "+str2);
//		
//		//max -natural sorting
//		Integer str3= al.stream().max((s1,s2)->(-s1.compareTo(s2))).get();
//		System.out.println("max -s1.compareTo(s2) is "+str3);
		
		 
		
		
	  
		  
		List<String> list5 = new ArrayList<String>();
		list5.add("Vijay");
		list5.add("Ajay");
		list5.add("Sanjay");
		list5.add("abc");
		System.out.println("The original ArrayList is  " +list5);
		
		//I want only those string whose length is greater then equal to 4
		Long cnt=list5.stream().filter(s-> (s.length()>=4)).count();
		System.out.println("string length is greter >= Four  "+cnt);
		
		//i want to only those string whose length is less than 6 and sort by Ascending
		List<String>list1=list5.stream().filter(s->(s.length()<6)).sorted().collect(Collectors.toList());
		System.out.println("i want to only those string whose length is less than 6  "+list1);
		
		//sort element in asending order if you put - then sort descending order  ((s1,s2)->(-s1.compareTo(s2)))
		 List<String> list2=list5.stream().sorted((s1,s2)->(s1.compareTo(s2))).collect(Collectors.toList());
		 System.out.println("assending order elements are "+list2);
		 
		 /*
		  *  //sort element is descending order
		 List<String>list3=list5.stream().sorted((s1,s2)->(-s1.compareTo(s2))).collect(Collectors.toList());
		 System.out.println("Decending order is "+list3);
		 
		 //sort element using defalut sorting ascending
		List<String> list4= list5.stream().sorted().collect(Collectors.toList());
		 System.out.println(list4);
		 
		 //min natural sorting 
		 String str=list5.stream().min((s1,s2)->s1.compareTo(s2)).get();
		 System.out.println("min String is "+str);
		 
		 //min -natural sorting
		 String str1=list5.stream().min((s1,s2)->(-s1.compareTo(s2))).get();
		 System.out.println("min -s1.compareTo(s2)  : "+str1);
		 
		 //max.
		String str2= list5.stream().max((s1,s2)->(s1.compareTo(s2))).get();
		System.out.println("max String is "+str2);
		
		//max -natural sorting
		String str3= list5.stream().max((s1,s2)->(-s1.compareTo(s2))).get();
		System.out.println("max -s1.compareTo(s2) is "+str3);
		
		 */
		
		 //Sort the list3 in alphabetical order
				List<String> list3 = new ArrayList<String>();
				list3.add("Vijay");
				list3.add("Ajay");
				list3.add("Sanjay");
				list3.add("abc");
				List<String > list4 =list3.stream().sorted().collect(Collectors.toList());
				System.out.println(list4);
				list3.stream().sorted((a,b) -> -a.compareTo(b)).collect(Collectors.toList());
				
				//Sort in rev alpha order
				 List <String> list51=list3.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
				System.out.println(list51); 
				
				
				
				int n = 10; // Change this to the desired number of Fibonacci numbers

			    System.out.println("Fibonacci Series (first " + n + " numbers):");
			    fibonacciSeries(n).forEach(System.out::println);	
	}

			private static Stream<Integer> fibonacciSeries(int n) {
				Stream.iterate(new int[] {0,1}, a -> new int[] {a[1], a[0] + a[1]}).limit(n).map(fib -> fib[0]).forEach(System.out::println);
				
				return Stream.iterate(new int[]{0, 1}, fib -> new int[] {fib[1], fib[0] + fib[1]})
						.limit(n)
						.map(fib -> fib[0]); //you can print here also .foreach(a -> System.out.println("a-> "+a));
				
				
			}
}
