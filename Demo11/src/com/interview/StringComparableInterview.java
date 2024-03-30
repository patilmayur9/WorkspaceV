package com.interview;

public class StringComparableInterview implements Comparable<StringComparableInterview>
{	
	int id;
	String name;
	String sallary;
	
	
	public StringComparableInterview(int id, String name, String sallary) {
		super();
		this.id = id;
		this.name = name;
		this.sallary = sallary;
	}


	@Override
	public String toString() {
		return "StringComparableInterview [id=" + id + ", name=" + name + ", sallary=" + sallary + "]";
	}


	@Override
	public int compareTo(StringComparableInterview o) 
	{
		return name.compareTo(o.name);	 
	}

	
	
	
	

}
