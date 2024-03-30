//write the java program to design method for substraction of two numbers which returns int result and print that result into main method.
//by using  non static method

public class SubstractionNonStatic 
{
	public int  substraction()
	{
		int a=40;
		int b=25;
		return (a-b);
	}
	
	public static void main (String args [])
	{
		SubstractionNonStatic substractionnonstatic=new SubstractionNonStatic();
		
		int c=substractionnonstatic.substraction(); //By Industrial way calling static method
		
		System.out.println("Substraction of two variables is : "+c);
		
	}

}