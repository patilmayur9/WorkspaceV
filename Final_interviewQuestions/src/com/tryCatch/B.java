package com.tryCatch;

public class B extends ChildAndParentMethodThrowsDiffException
{
	public String method() throws RuntimeException
	{
		return "a";
		
	 }
	public static void main(String[] args) 
	{
		B b =new B();
		System.out.println(b.method());
	}

}
