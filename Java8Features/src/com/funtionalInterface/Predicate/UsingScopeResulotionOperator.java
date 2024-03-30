package com.funtionalInterface.Predicate;

import java.util.function.Predicate;

public class UsingScopeResulotionOperator
{
	public static void main(String[] args) {

		/*Predicate <Integer> p1 = (i) -> (i>10);
		System.out.println(p1.test(20));*/
		
		//instead of above approach, if you are having the same impl in exisitng method, use ::
		//instead of lambda exp
		
		Predicate <Integer> p2 = Test13::m1;
		System.out.println(p2.test(5));
		
		Predicate<Integer> p3=Test13::m2;
		System.out.println(p3.test(10));
		
		//Test13 test13 = new Test13();
		Predicate <Integer> p = Test13::m2;
		System.out.println(p.test(5));
		
		Test14 test = Employee :: new;
		Employee e =test.getEmp("Vijay");
		System.out.println(e.s);
	}

}
