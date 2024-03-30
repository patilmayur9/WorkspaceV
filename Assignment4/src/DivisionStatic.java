
//write the java program to design method for Division of two numbers which returns int result and print that result into main method.
//by using  static method
public class DivisionStatic 
{
	public static int  division()
	{
		int a=100;
		int b=25;
		return (a/b);
	}
	
	public static void main (String args [])
	{
		int a = DivisionStatic.division(); //By Industrial way calling static method
		
		System.out.println("Division of two variables is : "+a);
		
	}

}