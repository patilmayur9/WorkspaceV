package com.comparable;

public class Employee implements Comparable<Employee> {

	Integer id;
	String name;
	
//	@Override
//	public int compareTo(Employee arg0) {
////		return  -name.compareTo(arg0.name);	//sort using descending order alphabetically	 
//	    return  name.compareTo(arg0.name);	//sort using ascending  order alphabetically
//	}
	 
	@Override
	public int compareTo(Employee o) {
		 
		return id.compareTo(o.id);// sort id using ascending order 1,2,3,4,5...
//		return -id.compareTo(o.id);// sort id using descending order 5,4,3,2,1..
	} 
	public Employee(int id, String name) {
	 
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	
}
