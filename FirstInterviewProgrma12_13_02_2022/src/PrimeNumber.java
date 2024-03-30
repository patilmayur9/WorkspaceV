/*
1) Reverse number
2) Prime number
3) Even Odd number
4)addition
5) Multiplication 
6) hello msg print
7)factorial
8)greater no
9)Palindrome Number
10)print no divisible by 2 from 1to 10
11) check given integer is positive or negative.
12)Prime number 
*/
import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String argsp[])
	{
		System.out.println("Enter the range for prime no : ");
		Scanner scanner=new Scanner(System.in);
	 
		int i=scanner.nextInt();
		
		
		
		System.out.println("Your Entered range is : "+i);
		
		PrimeNumber primenumber=new PrimeNumber();
		primenumber.print1(i);
		System.out.println("Your Entered range is : "+i);
				
	}
	void  print1(int i)
	{ 
		
		int a=0;
		int temp=1;
		for(a=i;temp<=i;temp++)
		{
			
			
		}
		
		
		

		 
//		while(a>=i)
//		{
//			if((i%1)!=0)
//			{
//				if(i)
//				System.out.println(""+i);
//			}
//			else
//			{
//				System.out.println("The non prime numbers are" +i);
//			}
//			
//			a++;
//		}
		 
	}
	
	 
}
