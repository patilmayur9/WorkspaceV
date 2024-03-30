package com.velocity;
import java.util.Scanner;
public class ReverceNum 
{
	public static void main(String args[])
	{
	 Scanner scanner=new Scanner(System.in);
		
	System.out.println("Enter any number : ");
	
	int num1=scanner.nextInt();
	
	ReverceNum revercenum=new ReverceNum();
	
    int result=revercenum.getReverceNum(num1); // 123//321;
    
    System.out.println("Reverse no of given no is  : "+result);
	}
	
	int getReverceNum(int num)//123  
	{
		int reverse = 0; //0 //3 //32 //320  //321
		while(num !=0)  // 123!=0 == ture //12 !=0 == true //1!=0 == ture // 0!=0 ==false
			
		{                                      
			 
			reverse = reverse * 10;//0 * 10=0 //3*10=30  //32 *10 =320 //321     //for storing result of the multiple iterations 
			
			reverse = reverse + num % 10; //0+ 123%10=3 //30 + 12 %10 =30 + 2= 32 //320+1%10 =320+1=321
			
			num = num / 10; //123/10=12  //12/10=1  // 1/10 = 0             //for calculating the qutient ex (17/2=8)
			
		}
		return reverse;		
	}
}


		
		/* for printing on same method in single line without println() method
		while(num>0)
		{
			/*if(num%10 !=0)
			{		 
				System.out.print(num%10);				 
			} 			
			System.out.print(num%10);
			num=num/10;			
			*/  
	









 