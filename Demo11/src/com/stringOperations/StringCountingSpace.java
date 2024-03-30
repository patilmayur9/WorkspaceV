package com.stringOperations;

public class StringCountingSpace 
{
		public static void main(String[] args) 
		{
			int count=0;
			char ch;
			String string="VelocityVelocity";
			
//			System.out.println(string.length());//8
//			System.out.println(string.charAt(4));//c
//			System.out.println(string .equals("Velocity"));//true it matches the object
//			
			String s1=new String ("Mayur");
			String s2=new String ("mayur");
			String s3=new String("Mayur");
			s2=s1;
			System.out.println(s1==s2);
			System.out.println(s2.equals(s1));   
			
			/*//for calculating of space 
			 * String str="my name is anthony gonsavis";
			for(int i=0;i<str.length();i++)
			{ 
				ch=str.charAt(i);
				if(ch==' ')//total space count
				count ++;
				
			}
			System.out.println("totoal space present in String : "+count);//0
*/		}
}
