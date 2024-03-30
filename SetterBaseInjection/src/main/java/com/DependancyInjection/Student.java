package com.DependancyInjection;

public class Student 
{
	private String city;
	public void setCity(String city) {
	this.city = city;
	}
	public void getMessage(String name) {
	System.out.println("Hello,"+name+","+city);
	}
}

//	String firstName;
//	String lastName;
//	
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	@Override
//	public String toString() {
//		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
//	}
//	
//	
 
	