package com.servlet;

public class Employee
{
	int id;// 
	String username;// 
	String password;// 
	/*public Employee(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String tiktok) {
		this.username = tiktok;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	/*public String toString()
	{
		return "id"+id+", name"+username+" ,password"+password+"" ;
	}*/
}
