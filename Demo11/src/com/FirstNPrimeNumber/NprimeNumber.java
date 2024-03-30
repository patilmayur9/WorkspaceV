package com.FirstNPrimeNumber;

import java.util.Scanner;

public class NprimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int n=sc.nextInt();//5
		//System.out.println(n);
		 int count=0;
		 System.out.print(1+" ");
		 
		  for(int i=1;i<=n;i++)
			 {
			  count=0;
				 for(int j=1;j<=n;j++)
				 {					 
					 if(i%1==0 && i%j==0)
					 {
						 count ++;  
					 }
				 }
				 if (count==2)
				 {
					 System.out.print(i+" ");
				 }
			 }		  
	}

}
