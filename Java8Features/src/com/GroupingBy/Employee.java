package com.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String lastName;
    private Address address;

    // Constructor, getters, and setters

    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int id, String name, String lastName, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", address=" + address + "]";
	}

	 
}




class Address {
    private int id;
    private String city;
    private int zipCode;

    // Constructor, getters, and setters

    public int getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Address(int id, String city, int zipCode) {
        this.id = id;
        this.city = city;
        this.zipCode = zipCode;
    }
}


