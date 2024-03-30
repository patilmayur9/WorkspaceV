//write the java program to design method for multiplication of two numbers which returns int result and print that result into main method.
//by using  static method

public class MultiplicationStatic 
{
 
	public static int  multiplication()
	{
		int a=10;
		int b=100;
		return (a*b);
	}
	
	public static void main (String args [])
	{
		int a = MultiplicationStatic.multiplication(); //By Industrial way calling static method
		
		System.out.println("Multiplication of two variables is : "+a);
		
	}

}