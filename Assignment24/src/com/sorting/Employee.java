package com.sorting;

public class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String city;
	

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Employee name)
	{
		//compareTo(name);
		// TODO Auto-generated method stub
		return this.name.compareTo(name.name);
	}
	
	
	

}
