package com.collection;

import java.util.ArrayList;

public class Employee 
{
	int id;
	String name;
	String city;
	public Employee(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	} 
	
	/* public Employee() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Employee> getEmployeeDetails()
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "rajan", "kolhpur"));
		list.add(new Employee(2, "sourabh", "sangli"));
		
		return list;
	}
*/
	 
	

}
