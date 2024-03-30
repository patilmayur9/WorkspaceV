/*1) reverse string 
2) print 10th prime number
3) factorial
4) palindrome
5) addition of digits of five digit number
6) greatest number among three numbers
7) Armstrong no
8) Fibonacci
9) Print length of the given string
10)Reverse number
11)find 3 digit largest number
12) Prime number
13) Even Odd number*/
import java.util.Scanner;

public class AdditionOfDigit
{
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any number : ");
//		int length,a=sc.nextInt();
//		
//		int addition=0;
//		while(a!=0)
//		{
//			addition =addition+(a%10);
//			
//			a=a/10;
//		}
//		
//		System.out.println(addition);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number : ");
//		int a=sc.nextInt();
//		int addition=0;
//		while(a>0)
//		{
//		  addition = addition + a%10; //baki kiti rahte te kadat % signe remainder
//		  System.out.println(a+" a%10 "+a%10);
//		  a = a/10;// ani / signe baghakar kitin gelay te kadat  qutiont
//		  System.out.println(a+" a/10 "+a/10);
//		}
//		System.out.println("Addition of given number is "+addition);

		
		
//		System.out.println("Enter any number ");
//		Scanner sc= new Scanner(System.in);
//		int a = sc.nextInt();//18975
//		int temp = 0;
//		
//		while(a>0) {
//			temp =  temp + a%10;
//			a = a/10;
//			
//		}
//		
//		System.out.println("addition of given number is "+ temp);
		
		
		// addition of digits 05 nov 2023
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter any Number ");
		int num =  sc.nextInt();
		
		int result = 0;
		while(num > 0) {
			result =  result + num % 10;
			num = num / 10;
		}
		System.out.println("sum of digit is " +result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
