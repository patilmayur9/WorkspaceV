package com.collection.comparable;

public class Employee implements Comparable<Employee>
{
	int id;
	String name;
	int sallary;
	 public Employee(int id, String name, int sallary) 
	 {
		 this.id=id;
		 this.name=name;
		 this.sallary=sallary;
		// TODO Auto-generated constructor stub
	}
	 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sallary=" + sallary + "]";
	}
	/*
	@Override
	public int compareTo(Employee arg0) {
		 return name.compareTo(arg0.name);//data is sorted using name in natural sorting assending order 
	}
	*/
	/*
	@Override
	public int compareTo(Employee arg0) {
		 return - name.compareTo(arg0.name);//data is sorted using name in  sorting decending order 
	}
	*/
	/*
	@Override
	public int compareTo(Employee o)
	{
		if(sallary > o.sallary) //it will output as a assending order  
		{
			return 1;
		}
		else if(sallary == o.sallary)
		{
			return 0;			
		}
		else if(sallary < o.sallary)
		{
			return -1;
		}return 0;
		
		// TODO Auto-generated method stub
		 
	}
	*/

	@Override
	public int compareTo(Employee o)
	{
		 
		if(sallary > o.sallary) //it will output as a decending order  
		{
			 
			return -1;//hear simply change the sign plus to minus
		}
		else if(sallary == o.sallary)
		{
			return 0;			
		}
		else //if(sallary < o.sallary)
		{
			return 1;//hear simply change the sign minus to  plus
		}
		
		//return 0;
		
		// TODO Auto-generated method stub
		 
	}
}
