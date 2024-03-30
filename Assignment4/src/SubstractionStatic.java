//write the java program to design method for substraction of two numbers which returns int result and print that result into main method.
//by using  static method
public class SubstractionStatic 
{
	public static int  substraction()
	{
		int a=103;
		int b=3;
		return (a-b);
	}
	
	public static void main (String args [])
	{
		int a=SubstractionStatic.substraction(); //By Industrial way calling static method
		
		System.out.println("Substraction of two variables is : "+a);
		
	}

}
