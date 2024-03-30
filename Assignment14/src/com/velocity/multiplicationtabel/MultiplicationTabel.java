package com.velocity.multiplicationtabel;

import java.util.Scanner;

public class MultiplicationTabel
{
	 public static void main(String[] args)  
	{
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println("Enter the Multiplication table range : ");		 
		 int range=scanner.nextInt();
		 
		 int temp=1;
		 
			 for(int i=1;i<=10;i++) 
			 { 
				 for(int j=1;j<=range;j++)
				 {
					 System.out.print("\t"+(i*j)); 
				 }
				 System.out.println();
				 System.out.println();
//				 System.out.println("___");
			 }
			 
			 //for non table formate
//			 while(temp<range)//1<=10 
//			 {
//				 for(int i=1;i<=10;i++)
//				 {
//					 System.out.println(i*temp); 
//				 }
//				 temp++;
//			 }
			 
		 

	}
}
