//Write a program to check whether number is even or odd
public class EvenOdd
{
	public static void main(String args[])
	{
		int a=108;
		EvenOdd evenodd=new EvenOdd();
		evenodd.evenOdd(a);
	}
	void evenOdd(int a)
	{
		if (a%2==0)
		{
			System.out.println("The given no is Even : "+a);
		}
		else
		{
			System.out.println("The given no is Odd : "+a);
		}
		
	}

}
