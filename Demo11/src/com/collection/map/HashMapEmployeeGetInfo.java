package com.collection.map;

import java.util.HashMap;

public class HashMapEmployeeGetInfo 
{
	public static void main(String[] args) {
		HashMap<Employee, String> hashMap= new
		HashMap<Employee,String>();
		Employee employee= new Employee();
		
		//employee as object in map as key and name as value
		
		hashMap.put(employee, employee.getSalary());
		System.out.println(hashMap.get(employee));
		}

}
