package com.constructor;

public class ConstructorDemo
{
//	 public ConstructorDemo(int a)
//	 {
//		 System.out.println("constructor 1 argument");
//	 }
//
//	 public ConstructorDemo() 
//	 {
//		 this(10);
//		 System.out.println("zero argument constructor call :");
//		// TODO Auto-generated constructor stub
//	}
	 
	 
	 public ConstructorDemo()
	 {
		 this("java");
		 System.out.println("constructor 0 argument");
	 }

	 public ConstructorDemo(String str) 
	 {
		  
		 System.out.println("String constructor call :"+str);
		// TODO Auto-generated constructor stub
	}
	 public static void main (String args[])
	 {
		// ConstructorDemo demo=new ConstructorDemo();//1st way calling the constructor
		// new ConstructorDemo();//2nd way to calling constructor
		 Constructor2 Constructor2=new Constructor2();
	 }
}
