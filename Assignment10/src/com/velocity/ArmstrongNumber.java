/*Write java program to check whether number is Armstrong or not.(A positive number 
 * is called armstrong number if it is equal to the sum of cubes of its digits for
 *  example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.*/
package com.velocity;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main (String args[])
	{
		ArmstrongNumber armstrongnumber=new ArmstrongNumber();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int i =scanner.nextInt();
		int j=armstrongnumber.findArmstrongNumber(i);
		if(i==j)
		{
			System.out.print("Given number is Armstrong Number : " +j);
		}
		else
		{
			System.out.println("The given number is Not a Armstrong Number : "+j);
		}
	}
	int findArmstrongNumber(int i)
	{
		int temp=0;
		int total=0;
		while(i!=0)
		{
			
			temp =i%10;
			 
					
			total +=(temp*temp*temp);
			 

			i=i/10;
		
		}
		return total;
		
	 
		  
	}
}
