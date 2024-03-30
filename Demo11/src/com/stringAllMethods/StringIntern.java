package com.stringAllMethods;

public class StringIntern 
{
	 
		  public static void main(String[] args)
		  {

		    String str1 = new String("xyz");
		    String str2 = new String("xyz");

		    // str1 and str2 doesn't share the same memory pool
		    System.out.println(str1 == str2); // false it checks the if two refrance are exact pointing to same memory location
		    System.out.println(str1.equals(str2));//ture//it checks the content is equal or not

		    // using the intern() method
		    // now both str1 and str2 share the same memory pool
		    str1 = str1.intern();//for scp area String str1=str.intern();
		    str2 = str2.intern();//for String constant pool String str2=str.intern();//both str11 and str22 are pointing to the xyz String object

		    System.out.println(str1 == str2); // true
		    System.out.println(str1.equals(str2));//true    
		    
		  }
		 

}
