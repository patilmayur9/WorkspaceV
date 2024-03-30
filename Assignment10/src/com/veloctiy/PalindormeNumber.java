package com.veloctiy;
import java.util.Scanner;

public class PalindormeNumber 
{
	 
		public static void main(String args[])
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter any number : ");
			int num=scanner.nextInt();//121
			int temp=0;
			int reverse=0;
			while(num!=0)
			{
				reverse=10*reverse;

				reverse=reverse+num%10;
				
				num=num/10;
			}
			
			if(reverse==num)
			{
				System.out.println("The given number is palindrome number : ");
			}
			else
			{
				System.out.println("The given number is not palindrome number : ");
			}


		}
		
	

}
