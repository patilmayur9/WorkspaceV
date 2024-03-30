package com.veloctiy;
import java.util.Scanner;

public class PrimeNumber 
{
		public static void main (String args[])
		{
			PrimeNumber primenumber=new PrimeNumber();
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter the number : ");
			int num=scanner.nextInt();	
			
			int count=0;
					
					for(int i =num ; i>0 ;  i--)
					{
						if(num%i==0)
						{
							count++;
						}
					}
					
					if(count>2)
					{
						System.out.println("The given no is a Not prime : "+num);
					}
					else
					{
						System.out.println("The given no is a prime number : "+num);
					}
			
		}
}
