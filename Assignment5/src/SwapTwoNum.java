//Write a program to swap the two numbers.(For ex if x=10 and y=20 initially, then after your code execution x should be 20 and y=10)
public class SwapTwoNum 
{
	public static void main(String ags[])
	{
		int a = 10;
		int b = 20;
		System .out .println("Bfore Swaping of two nos are : "+a+" "+b);
		b = a;
		a = a+a;
		/*
		 int a=10;
		 int b=20;
		 int temp=a;
		 a=b;
		 b=temp;
		 */
		System .out .println("After Swaping of two nos are : "+a+" "+b);
		
	}

}
