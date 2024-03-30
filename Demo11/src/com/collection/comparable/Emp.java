package com.collection.comparable;

public class Emp implements Comparable<Emp>
{
	int id;
	String name;
	public Emp(int id, String name)
	{
		this.id=id;
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Emp obj1) 
	{
		if(id > obj1.id  ) return -1; 		
		else if(id == obj1.id) return 0; 		
		else return 1;
		
		
		/*if(id > obj1.id  ) return -1;//change the positions 4 > 2		
		else if(id == obj1.id) return 0;//no change		
		else return 1;//else if(id < obj1.id) //no change
		//output decending order 4, 3, 2, 1...
		4  abhijit
		3  yogesh
		2  suraj
		1  mayur*/
		
		/*if(id > obj1.id  ) return 1;//change the positions 4 > 2		
		else if(id == obj1.id) return 0;//no change		
		else return -1;//else if(id < obj1.id) //no change
		//output assending order 1, 2, 3, 4......
		1  mayur
		2  suraj
		3  yogesh
		4  abhijit*/
		 
		/*return name.compareTo( obj1.name);
		//output
		4  abhijit
		1  mayur
		2  suraj
		3  yogesh*/
		 
	/*	return -name.compareTo( obj1.name);
		//output
		3  yogesh
		2  suraj
		1  mayur
		4  abhijit*/
	}

}
