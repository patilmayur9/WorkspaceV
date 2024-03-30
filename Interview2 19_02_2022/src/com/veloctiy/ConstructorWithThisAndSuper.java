package com.veloctiy;

public class ConstructorWithThisAndSuper 
{ private int a=10;
	private long sh;
	
	public int give()
	{
		return a;
	}
	public void save(byte sh)
	{
		this.sh=sh;
		System.out.println(sh);
	}
	 
	
//	ConstructorWithThisAndSuper()
//	{
//		System.out.println("parent  0 argument constructor called  :");
//	}
}
class child 
{
	/* by default compiler generated code 
	child()
	{
		super();
	}
	*/
	public static void main(String[] args) 
	{
		System.out.println("the geeter method is  :"+new ConstructorWithThisAndSuper().give()); ;;;;;
		new ConstructorWithThisAndSuper().save((byte) 10);
		
	}
}
