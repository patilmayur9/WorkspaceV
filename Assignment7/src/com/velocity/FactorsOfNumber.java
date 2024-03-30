//Design method to print factors of given number
//( Enter no = 6 then factors should be displayed like 1,2,3,6.
package com.velocity;
import java.util.Scanner;

public class FactorsOfNumber
{
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter any Number: " );
		
		int i=scanner.nextInt();
		
		//System.out.println("You Entered Number is : " +i);
		
		FactorsOfNumber factorsofnumber=new FactorsOfNumber();
		 factorsofnumber.factor1(i);	
//		System.out.println("....%..."+23%10);
//		System.out.println("..../..."+23/10);
	}	
	
	
	void factor1(int i) //9
	{
		int temp=1;//10
		 
		while(temp<=i) // 10<=9    
		{
			if((i%temp)==0) //9%9 ==0  
			{	 
				System.out.println(" factors of given no is: " +temp); 
			} 
			temp++;
		}
		
	}
}





























/*System.out.println("in a factor : "+i);
		 int temp=1;
		int a=i;
		System.out.println("in a factor :> "+a);
		 
			while(temp>=i)
			{	 
				if(a/temp==0)
				System.out.println("Factors of given no are : "+i);
				temp++;
			}*/
