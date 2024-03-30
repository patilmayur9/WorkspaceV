//write the java program to design method for addition of two numbers which returns int result and print that result into main method.
//by using non static method
public class AdditionNonStatic 
{
	public static void main (String args [])
	{
		
		AdditionNonStatic additionnonstatic=new AdditionNonStatic();
		int a=30;
		int b=30;
		
		int c=additionnonstatic.addition1(a,b);
		
		System.out.println("Additon of two numbers is : "+c);
	}
	
	int addition1(int x, int y)
	{
		//int a=25;
		//int b=25; 
		return (x+y);
	}
}
