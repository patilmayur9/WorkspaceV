package com.optionalClass;

import java.util.Optional;

import javax.swing.text.html.Option;

public class OptionalClassExample
{
	static String str;
	static String string="Ram";
	public static void main(String[] args) {
//		Optional<String> opt=Optional.ofNullable(str);
//		if(opt.isPresent())
//		{
//			System.out.println("length of stirng is "+ str.length());
//		}
//		else
//		{
//			System.out.println("Stirng is null : " +str);
//		}
		
		/*if(str!=null)//normal way handling
		{
			System.out.println("length of stirng is "+ str.length());
		}
		else
		{
			System.out.println("Stirng is null : " +str);
		}*/
		
		Optional<String> opt1=Optional.ofNullable(str);//optional class  is used for handling null pointer exceptions
		 
		if(opt1.isPresent())
		{
			System.out.println("String is.. "+str);
		}
		else
		{
			System.out.println(str);
		}
		
	}

}
