package com.raviSirProgram;

public class SwapNumberWithoutThirdVariable 
{
public static void main(String[] args) {
	int a=3;
	int b=10;
//	System.out.println(a+" "+b);
//	 a=a^b;
//	 System.out.println(a +" "+b);
//     b=a^b;
//	 System.out.println(a +" "+b);
//     a=a^b;
//	 System.out.println(a +" "+b);
	 
	 a=a+b;//3+10=13
	 b=a-b;//13-10=3
	 a=a-b;
	 System.out.println(a+" "+b);
	 
}
}
