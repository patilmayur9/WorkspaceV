package com.finalyblock;


import java.util.Scanner;

public class FinallyBlock 
{
	public static void main(String[] args)
	{
		System.out.println("Main Method Execution Starts hear : ");
		String str="mayur";
	
		 
		System.out.println("Execution of main method ends hear : ");
		FinallyBlock finallyblock=new FinallyBlock();
		main(str);
		System.out.println (" main method oveloded ");
	}

	public static void main( String str)
	{
		int a
		 ,num;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any 1st Number : ");
			a=sc.nextInt();
			System.out.println("Enter any 2nd Number  : ");
			num=sc.nextInt();
			try
			{
				int c= a/num;
				System.out.println(c);
				//System.exit(0);//rest of the code not be executed of same method as well as calling methods also
			} 
			catch(Exception e)
			{
				
				e.printStackTrace();
			}
			finally
			{
				System.out.println("finallly Block executed : ");
			}
			System.out.println("Execution of main method ends hear : ");
	}
}
