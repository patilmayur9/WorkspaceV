package com.StreamApi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8FeaturesByKishor {

	public static void main(String[] args) {
		// source of below examples is ->  https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15); 
		 
//		 myList.add(24);  we can not add when list is created like above 
		 System.out.println("Orininal list myList-> "+myList);
		 
		 //Given a list of integers, sort all the values present in it using Stream functions?
		 System.out.println("list is sorted using .sorted() default sort asce -> ");
		 myList.stream() .sorted().forEach(System.out::println); 
		 
		 // Given a list of integers, sort all the values present in it in descending order using Stream functions?
		 System.out.println("list is sorted using .sorted(Collections.reverseOrder()) desc sorting -> ");
		 myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		  
		 
		 myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		// myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
		 
		 ////3. How to find duplicate elements in a given integers list in java using Stream functions?
	     System.out.println("list duplicate element using Set interface");
         Set<Integer> set = new HashSet();
         
         myList.stream()
               .filter(n -> !set.add(n))
               .forEach(System.out::println);// set have duplicate value then set simply return false
         // other wiese it return true    
//         public boolean add(E e) { 
//         return map.put(e, PRESENT)==null;
//     }
         
         
         System.out.println("__________");
         
         //Given the list of integers, find the first element of the list using Stream functions?
         System.out.println("list first element");
         myList.stream()
         .findFirst()
         .ifPresent(System.out::println);
         
         //Given a list of integers, find the maximum value element present in it using Stream functions?
         System.out.println("list maximum value");
         int max =  myList.stream()
                 .max(Integer::compare)
                 .get();
         myList.stream().max(Integer::compare).ifPresent(System.out::println);
         // we can write code like below also for max element
         myList.stream().max(Integer::compare).ifPresent(System.out::println);// if present is used to if output is present just print it 
                
         
         //. Given a list of integers, find the total number of elements present in the list using Stream functions?
         long count =  myList.stream()
                 .count();
         		System.out.println(count);
         	 
         		
         //Given a String, find the first non-repeated character in it using Stream functions?
         	    String input = "Java articles are Awesome";
         	    
         	    Character result = input.chars() // Stream of String       
         	            .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
         	            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
         	            .entrySet()
         	            .stream()
         	            .filter(entry -> entry.getValue() == 1L)
         	            .map(entry -> entry.getKey())
         	            .findFirst()
         	            .get();
         	   System.out.println("first non-repeated character in given string is-> " +result);  
         	    
         	 // Given a String, find the first repeated character in it using Stream functions?
//         	   String input = "Java Articles are Awesome";

               Character resultt = input.chars() // Stream of intStream       
                                       .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert Character to object and then to lowercase         
                                       .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                       .entrySet()
                                       .stream()
                                       .filter(entry -> entry.getValue() > 1L)
                                       .map(entry -> entry.getKey())
                                       .findFirst()
                                       .get();
               System.out.println(" Given a String, find the first repeated character-> "+resultt); 
                
               System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
               String input1 = "abcdefghijklmnopqrstuvwxyz";
               String input2 = "ABCDEFGIJKLMANOPQRSTUVWXYZ";
             input1.chars().forEach(System.out::println);
             input2.chars().forEach(System.out::println);
             System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		
///////// Stream API Practice////////////
		
		//1. How many male and female Emps are there in the organization?
		//2. Print the name of all departments in the organization?
		//3.What is the average age of male and female Emps?
		//4.Get the details of highest paid Emp in the organization?
		//5.Get the names of all Emps who have joined after 2015?
		//6.Count the number of Emps in each department?
		//7.What is the average salary of each department?
		
		
		
		///////////////END//////////////////
		
		
		// TODO Auto-generated method stub
		//Decamticone cn = new Decamticone();
		List<Emp> EmpList = new ArrayList<>();
		EmpList.add(new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 90000.0));
		EmpList.add(new Emp(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		EmpList.add(new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		EmpList.add(new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		EmpList.add(new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		EmpList.add(new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		EmpList.add(new Emp(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		EmpList.add(new Emp(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		EmpList.add(new Emp(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		EmpList.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		EmpList.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		EmpList.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		EmpList.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		EmpList.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		EmpList.add(new Emp(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		EmpList.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		EmpList.add(new Emp(277, "Anuj Chettiar", 31, "abc", "Product Development", 2012, 35700.0));
		  
		//find second heighest salary of employee
		Optional<Emp> empobject = EmpList.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).skip(1).findFirst();
		System.out.println("Second heighest salary of employee-> "+empobject);
		EmpList.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).limit(3).forEach(System.out::println);
		EmpList.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).limit(1).findFirst();
//		 for (Emp emp : EmpList) {
//			System.out.println("emp data called "+emp.getDepartment());
//		}
		List<Integer> lll = EmpList.stream().map(Emp :: getId).collect(Collectors.toList());//collect employee id's
		System.out.println("all employes ids are-> "+lll);
		
 
		long countt = EmpList.stream().filter(a -> a.salary >= 25000).count();
		System.out.println("salaray greter than 25000 emp count is "+countt);
		
		//long ll = EmpList.stream().map(Emp :: getSalary).filter(a -> a >= 10000).collect(Collectors.counting());
		long ll = EmpList.stream().filter(a -> a.salary >= 10000).collect(Collectors.counting());//collect count of Employee who have salary greater than 10K 
		System.out.println("salaray greter than 10000 emp count is "+ll);
		
	List<Emp> list=EmpList.stream().filter(e -> e.getAge() >= 25).collect(Collectors.toList());
	list.stream().forEach(l -> System.out.println("sorted data--->"+l.getName()+"- "+"Age--"+l.getAge()));
	//list.stream().forEach(l -> System.out.println(l));
	
	
	Map<String, Long> noOfMaleAndFemaleEmps=EmpList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));//groupingBy() returns the map object String and long key values
	System.out.println("noOfMaleAndFemaleEmps-> "+noOfMaleAndFemaleEmps);
	
	
	Map<String, Long> maleFemaleEmpCount =	EmpList.stream().collect(Collectors.groupingBy(Emp :: getGender, Collectors.counting()));  
	System.out.println("maleFemaleEmpCount-> "+maleFemaleEmpCount);
	
	System.out.println("Male Count-> "+EmpList.stream().filter(e->e.gender.equals("Male")).count());
	System.out.println("FeMale Count-> "+EmpList.stream().filter(e->e.gender.equals("Female")).count());
	
	System.out.println("department count "+EmpList.stream().map(Emp::getDepartment).collect(Collectors.counting()));
	System.out.println(" HR department count "+EmpList.stream().map(Emp::getDepartment).filter(a -> "hr".equalsIgnoreCase(a)).count());
	System.out.println("department count "+EmpList.stream().map(Emp::getDepartment).count());
	System.out.println("total department count Distinct -> "+EmpList.stream().map(Emp :: getDepartment).distinct().count());
//	System.out.println("total department count Distinct -> "+EmpList.stream().collect(Collectors.groupingBy(Emp :: getDepartment, Collectors.summingInt(Emp::getDepartment))));
    EmpList.stream().map(Emp::getDepartment).distinct().forEach(System.out::println);
	
	
	//System.out.println(EmpList.stream().collect(Collectors.groupingBy(Emp::getDepartment),Collectors.counting()));
	//System.out.println(EmpList.stream().forEach(e->System.out.println(e.getDepartment()));
		
	//Map<String ,Long> mapOFemp =	EmpList.stream().collect(Collectors.groupingBy(Emp::getName,Collectors.counting()));
	// What is the average age of male and female Emps?
    Map<String, Double> db = EmpList.stream().collect(Collectors.groupingBy(Emp::getGender ,Collectors.averagingDouble(Emp::getAge)));
		
		System.out.println("Avrage age:-"+db);
		
		//Get the details of highest paid Emp in the organization?
//		EmpList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary))).ifPresent(System.out::print);
		Optional<Emp> emp=EmpList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)));
		System.out.println(emp.get().getName());
		System.out.println(emp.get().getSalary());
		System.out.println(emp.get().getGender());
		System.out.println(emp.get().getDepartment());

Optional<Emp> minsalaryemp = EmpList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Emp :: getSalary))); 
System.out.println("minsalaryemp-> "+minsalaryemp);

		//Get the names of all Emps who have joined after 2015?
		EmpList.stream().filter(e->e.getYearOfJoining()>2015).map(Emp::getName).forEach(System.out::println);
		
		//Get the details of mimimum paid Emp in the organization?
		System.out.println(EmpList.stream().min(Comparator.comparingDouble(Emp::getSalary)));
		
	System.out.println(EmpList.stream().map(e->e.getAge()).collect(Collectors.toList()));
	
	 // making the arraylist object of List of Integer
    List<List<Integer>> number = new ArrayList<>();
    number.add(Arrays.asList(1, 2));
    number.add(Arrays.asList(3, 5));
    number.add(Arrays.asList(5, 6));
    number.add(Arrays.asList(7, 8));
    System.out.println("before flat map -> "+number); //before flat map -> [[1, 2], [3, 4], [5, 6], [7, 8]]
    number.stream().flatMap(lis->lis.stream().distinct()).forEach(System.out::print);//12345678
    System.out.println("+++++++++++++++++++++++++");
    List<String> a = Arrays.asList(  "Hello ","G", "E", "E", "K", "S!"); 
     a.parallelStream().forEach(System.out::println); //
     System.out.println("+++++++++++++++++++++++++");
		
	
	
//		 Person p2 = getPerson();
//		 if(p2!=null) {
//			 System.out.println(p2.getB()); 
//		 }
//		Optional<Person> p1 = Optional.ofNullable(getPerson());
//		System.out.println(p1.get().getB());
//	}
//	static Person getPerson(){
//		Person  p =   new Person();
//		p.setA(5);
//		p.setB("kv");
//		return p;
//		}
//	

	}
	
	//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
	public boolean containsDuplicate(int[] nums) {
	    List<Integer> list = Arrays.stream(nums)
	                               .boxed()//used to convert non primitive data types auto-boxing
	                               .collect(Collectors.toList());
	    Set<Integer> set = new HashSet<>(list);
	     if(set.size() == list.size()) {
	       return false;
	   } 
	      return true;
	      
	      /*
	       * 
	      Input: nums = [1,2,3,1]
	      Output: true

	      Input: nums = [1,2,3,4]
	      Output: false
	       * 
	       * 	
	       */
	  }
	

	 
}

