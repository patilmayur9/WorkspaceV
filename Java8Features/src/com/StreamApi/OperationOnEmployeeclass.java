package com.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperationOnEmployeeclass {
	public static void main(String[] args) {
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("chintu", 23000));
		al.add(new Employee("pappu", 2000));
		al.add(new Employee("bablu", 10000));
		al.add(new Employee("golu", 17000));
		al.add(new Employee("gotu", 50000));
		al.add(new Employee("motu", 100));
		
		System.out.println("original list element -> "+al);
		//Provide the list of employee if they got the increment of 30%
	List<Employee>	aa = al.stream().map(e -> {e.setSalary(e.getSalary() * 0.3); return e;}).collect(Collectors.toList());
		
		List<Employee>list=al.stream().map( e -> {
													e.setSalary( e.getSalary() *  0.3);//e.getSalary() * 30 / 100 this can be also used
													return e;
									 			  }).collect(Collectors.toList());
		System.out.println("list got 30% hick -> "+list);
	//	List<Employee>list121=al.stream().map(e->{e.setSalary(e.getSalary()*0.3); return e;}).collect( Collectors.toList());		
		//System.out.println(list121);
		//Sort the employee list based on name in asc order
		List<Employee>list10 = al.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
		System.out.println(list10);
		
		//sor the employee list based on Decending order
		List<Employee> list11 = al.stream().sorted((a,b) -> -a.getName().compareTo(b.getName())).collect(Collectors.toList());
		System.out.println(list11);
		
		//Provide the list of employee if they got the increment of 30%
		List<Employee>list12=al.stream().map(m-> { m.setSalary(m.getSalary() *  (130/100) ); return m;}).collect(Collectors.toList());
		System.out.println(list12);	
		
		
		//Sort the employee list based on name in asc order
		List<Employee>list1 =al.stream().sorted( (a,b) -> a.getName().compareTo(b.getName()) ).collect(Collectors.toList());
		System.out.println("employee name ascending order "+list1);
		
		//sort the employee list based on Descending order
		List<Employee> list2 = al.stream().sorted((a,b)-> -a.getName().compareTo(b.getName())).collect(Collectors.toList());
		 System.out.println(list2);
//		 not working good  dont no
//		//Sort the employee list based on salary in desc order
//		 List<Employee> list3 = al.stream().sorted((a,b) ->  (int)(a.getSalary() - b.getSalary())).collect(Collectors.toList());
//		  System.out.println( list3);
		  
		//Sort the employee list based on salary in desc order
			List<Employee> list5 =al.stream().sorted((x,y)-> (int)(y.getSalary() - x.getSalary())).collect(Collectors.toList());
			System.out.println(list5);
			
			
			//Provide the list of employee if they got the increment of 30%, get highest salary
			Employee ee =al.stream().map(e -> {e.setSalary(e.getSalary()*1.3); return e;}).max((x,y)-> (int)(x.getSalary() - y.getSalary())).get();
			System.out.println(ee);
			
			//Provide the list of employee if they got the increment of 30%, get lowest salary
			Employee eeee =al.stream().map(e -> {e.setSalary(e.getSalary()*1.3); return e;}).max((x,y)-> (int)(x.getSalary() + y.getSalary())).get();
			System.out.println(eeee);
			
	}

}
