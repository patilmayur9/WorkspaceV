package com.raviSirProgram;

import java.util.Scanner;

 

public class Palindrome {
	public static void main(String[] args) 
	{
		/*Palindrome palindromenumber=new Palindrome();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		
		int a=scanner.nextInt();
		if(palindromenumber.palindromeNumber(a)==a)
		{
			System.out.println("The given number is Plindrome : " + a);
		}
		else
		{
			System.out.println("The given number is Not Plindrome : " + a);
		}
		
		
	}
	
	int palindromeNumber(int num)
	{
		int reverse=0;
		while(num!=0)
		{
			reverse = reverse*10+(num%10);
			//reverse= reverse+num%10;
			
			num=num/10;
		}
		return reverse;
	}
*/
		 int a=203;
		  int rev=0;
		  int temp=a;//store a value to the temp variable
		  
		  while(a>0)
		  {
		     rev= (rev*10)+a%10;
		     a=a/10;//because hear we can change the a value so store the a value in to temp
		  }
		   if(rev==temp)
		   {
		     System.out.println("Palindraom");
		   }else
		   {
		     System.out.println(" Not Palindraom");
		   }
	}
}
		
//		System.out.println("start");
//		int a=121;
//		
//		 
//		 int result=0;
//		 while(a!=0)
//		 {
//			 result=result*10;
//			 result= result+a%10;
//			 a=a/10;
//		 }
//		if(result==a)
//			System.out.println("Number is Palindrome");
//		
//		
//		
////		int reverse=0;
////		while(num!=0)
////		{
////			reverse = reverse*10;
//			reverse= reverse+num%10;
//			
//			num=num/10;
//		}
//		return reverse;

