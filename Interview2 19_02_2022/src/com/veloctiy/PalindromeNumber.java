
package com.veloctiy;
import java.util.Scanner;

public class PalindromeNumber
{
	public static void main(String args[])
	{
		PalindromeNumber palindromenumber=new PalindromeNumber();
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
			reverse = reverse*10;
			reverse= reverse+num%10;
			
			num=num/10;
		}
		return reverse;
	}

}
