package com.veloctiy;
/* 
 * methods of object classes
 1. Public final Class getClass()-

public class ThisKeyword {
public static void main(String[] args) {
ThisKeyword example = new ThisKeyword();
System.out.println(example.getClass());//class com.veloctiy.ThisKeyword
System.out.println(example.getClass());//class com.veloctiy.ThisKeyword
System.out.println(example.getClass().getName());//com.veloctiy.ThisKeyword
System.out.println(example.getClass().getSimpleName());//ThisKeyword
}
}
output 
class com.veloctiy.ThisKeyword
class com.veloctiy.ThisKeyword
com.veloctiy.ThisKeyword
ThisKeyword
 
 */
 
/*
2. Public int hashCode()

public class ThisKeyword 
{
public static void main(String[] args)
{
	ThisKeyword example = new ThisKeyword();
	ThisKeyword example1 = new ThisKeyword();
System.out.println(example.getClass().getName());//com.veloctiy.ThisKeyword//it is by default return class name with packege name also
System.out.println(example.getClass().getSimpleName());//com.veloctiy.ThisKeyword
System.out.println("hash code is 1 : "+example.hashCode());//2018699554//ThisKeyword//getsimpleName() method returns the class constructor is nothing but class name
System.out.println("hash code is 2 : "+example1.hashCode());//1311053135
}
}  
output

 */

/*
 // 3) Public Boolean equals (Object obj)
class test1   
{

}
class test   extends test1
{
	

}
 
public class ThisKeyword extends test   {
int empId;
String empName;
public static void main(String[] args) {
ThisKeyword emp1 = new ThisKeyword();
emp1.empId = 1;
emp1.empName = "Ashok";
ThisKeyword emp2 = new ThisKeyword();
emp2.empId = 2;
emp2.empName = "Sachin";
System.out.println(emp1.equals(emp2));//false


test1 T=new ThisKeyword();
test1 T1=new ThisKeyword();
System.out.println(T1.equals(T1));//ture

}
}
//output is 
//false
 //true
 */


 /*
// 4) protected Object clone() throws CloneNotSupportedException-
   public class Example implements Cloneable
{
	  int x;
	public static void main(String[] args) throws CloneNotSupportedException
	{
	Example example1 = new Example();
	
	example1.x = 50;
	example1.x=10;
	Object example2 = example1.clone();
	example1.x=9;
	System.out.println("the latest x value is "+example1.x);
	System.out.println("First Object data is>>" + example1.x);
	
	
	System.out.println("Second Object data is>>" + example2);
	System.out.println("  ....."+example1.x);
	
	}
}

*/
/*
 * 5 protected Object clone() throws CloneNotSupportedException	      	
public class Example 
{
	int x;
	@Override

	public String toString() 
	{
	
		return "x"; //"Example [x=" + x + "]";
	}
		public static void main(String[] args) throws CloneNotSupportedException 
		{
			Example example1 = new Example();
			example1.x = 50;
			Example example2 = new Example();
			System.out.println("First Object data is>>" + example2);
			System.out.println("second Object data is>>" + example2);
		}
}
*/
 
//	Note- Final method cannot be overridden.
//	Example-3
//	class X
//{
//	  void test()
//	{
//		System.out.println(“This is x class-test method”);
//	}
//	class Y extends X 
//	{
//		 void m1 (){
//			System.out.println(“This is y class-test method”);
//	}
//		 static void main(String args[]) 
//		 {
//			 X x = new Y();
//			 x.test();
//		}
//}
 
//class Parent
//{
////	Parent()
////	{
////		
////	}
//	int x = 20;
//}
//class Child extends Parent
//{
////	Child()
////	{
////		System.out.println("callign parent class constructor"+super.Parent());
////	}
//	int x = 25;
//	void test() 
//	{
//		int x = 30;//you can access this x then we assign sop statement direct x variable
//		Child c = new Child();
//		//In Scenario 1
//		System.out.println("By creating objects=" + c.x);
//		//In Scenario 2
//		System.out.println("By using this keyword=" +this.x);
//	}
//}
//public class ThisKeyword 
//{
//	public static void main(String[] args)
//	{
//		Child c= new Child();
//		c.test();
//	}
//}
//
// 
