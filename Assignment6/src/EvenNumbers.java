//write a program  to print all even number from 50 to 75.
public class EvenNumbers
{
	public static void main (String args[])
	{
		int i=50;
		System.out.println("Even no between 50 to 75 are :");
		for(;i<=75;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
