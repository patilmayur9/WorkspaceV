package com.Functional_Interface.Function;

import java.util.function.Function;

public class FunctionFI
{
	public static void main(String[] args) {
		/*Function<String,Integer> f=(s)->s.length();//it takes input as a string and produce output as Integer
		int a = f.apply("mayurmarutiPatil");
		System.out.println("length of string is "+a);
		
		
		Function<Integer, String> fun=(s)->{////it takes input as a Integer and produce output as string
				if(s>5)
				{
					return "mayur";
				}
				else
					return "patil";
				
				};
		String s=fun.apply(5);
		System.out.println("Returen String of Function is "+s);*/
		Function<String, Integer> len = (s) -> s.length();
		int a = len.apply("Sanskruti");
		System.out.println("length of Sanskruti word is "+a);
		
		
		Function<Integer, String> checkGreaterValue = (s) -> {
			if(s>10)
				return "Given number is Greater "+s;
			else
				return "Given number is lesser "+s;
			
		};
		
		
		System.out.println("check number is greater or lesser than 10 "+checkGreaterValue.apply(256));
		Function<String,Integer> f=(s)->s.length();
		System.out.println(f.apply("jindagi"));
		
		Function<Integer, String> function = s -> {
			if(s> 10)
				return "greter value"+s;
			else
				return "lesser value"+s;
		};
		System.out.println(function.apply(7));
		
		Function<Integer, String> chintu=(s)->{
			if(s>5)
			{
				return "greater";
			}
			else
			{
				return "Less";
			}
		};
		
		System.out.println(chintu.apply(2));
		
	}

}
