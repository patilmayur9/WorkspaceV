package com.classCastException;

public class C extends B{
	int i=30;
	int k=30;
	public static void main(String[] args) {
		
		/*//using this we can call all i variables common in all A,B,C classes so there is no use of inheritance
		A a=new A();	
		System.out.println(a.i);
		System.out.println(a.h);
		System.out.println("............................");
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.j);
		*/
		
		
		 /*//class Cast Exception
		 A a=new A();
	 	B b=(B)a;//this gives class cast runtime exception //A can not be cast to class B becoz A is parent and B is child
		C c=(C) a;//A can not be cast to class C because C is child and A is parent
		System.out.println(c.h); 
		*/
		 
		C c=new C();
		System.out.println(c.i);
		System.out.println(c.k);
		System.out.println(".................");
		B b=(B)c;//hear c is casted to class B because B is parent of Class C
		System.out.println(b.i);
		//System.out.println(b.k);//we can not call the variables of child class in class cast or dynamic dispatch
		System.out.println("b.i   "+b.i);
		System.out.println("b.j  "+b.j);
		System.out.println("b.h->a class  "+b.h);
		System.out.println("b.h->a class  "+b.i);//this method take Class b value override
		System.out.println("b.h->a class  "+b.str);
		
		System.out.println(".................");
		A a=(A)b;//Same hear
		A a1=(A)c;
		System.out.println(a.i);
		System.out.println(a.h);
		System.out.println(a1.i);
		System.out.println(a1.h);
		
	}

}
