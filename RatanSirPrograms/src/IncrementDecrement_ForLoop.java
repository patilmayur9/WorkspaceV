///Write the Java Program to calculate total of five subject marks and average of it.
//by using Non static method
public class IncrementDecrement_ForLoop 
{
	 
	public static void main(String args[])
	{
		int i=0;
		for(i=0;i<10 /* hear we can add true false also so we get unreachable code*/;System.out.println("incremented value of i for each ittration is"+i))
		{
			System .out .println("in the for loop block"+i);
			i++;
			
		}
		//if hear increment the i then for loop goes to infinite loop
		//while example
		do
		{ 
			System.out.println("durga");
		} 
		while (false);
		
		System.out.println("durgasoft");

	}
}