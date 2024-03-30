package com.collection.comparable;

public class EmployeeComparable implements Comparable<EmployeeComparable>
{
	int id;
	String name;
	 public EmployeeComparable(int id,String name) {
		 this.id=id;
		 this.name=name;
		 
	}

	@Override
	public int compareTo(EmployeeComparable obj1) {
		// TODO Auto-generated method stub
		return  -name.compareTo(obj1.name);//name asending or descending
		
	/*	if(id>obj1.id)//this code for id ascending or descending sorting
		{
			return -1;
		}
		else if(id==obj1.id)
		{
			return 0;
		}
		else
			return 1;*/
	}

}
