package com.StreamApi;

public class Emp {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setJoinDate(int joinDate) {
		this.yearOfJoining = joinDate;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Emp(int id, String name, int age, String gender, String department, int joinDate, double d) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = joinDate;
		this.salary = d;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department
				+ ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	

}
