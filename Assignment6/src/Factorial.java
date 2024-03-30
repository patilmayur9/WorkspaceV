/*Design method int 
factorial(int no)  which returns int value to that method. print the results into main method 
(Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)*/

public class Factorial
{
	public static void main(String args[])
	{
		int temp =1;
		int fact=5;
		int i=fact;
		for(;i>=1;)
		{
			temp *=i;
			i--;
		}
	
		System.out.println("Factorial of given no "+fact+" is : "+temp);
	}		
}


