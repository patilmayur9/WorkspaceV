package com.wrapperClassesTypeConversion;

public class AutoTypeconversion
{
	public static void main (String args[])	
	{
		AutoTypeconversion t=new AutoTypeconversion();
		t.m1(10,'A'); 
		t.m1(10,20); 
		t.m1( (byte) 10 ,(short) 20); 
		t.m1('a','b');  
		t.m1(10.0f); 
		t.m1((short)10);		
		t.m1('a'); 	
		t.m1((byte) 10); 	
	}
	public void m1(int a, long b)
	{
		System.out.println("int a is  "+  a + " int b is " + b );		
	}
	public void m1(float b)
	{
		System.out.println("float b is " + b);
	}

}
/*
  byte -> short ->
 
				int -> long -> float ->  double
		char ->
		
*/