//write the java program to design method for multiplication of two numbers which returns int result and print that result into main method.
//by using Non static method
public class MultiplicationNonStatic
{
		public int  multiplication()
		{
			int a=100;
			int b=50;
			return (a*b);
		}
	
		public static void main (String args [])
		{
			MultiplicationNonStatic multiplicationnonstatic=new MultiplicationNonStatic();
			
			int c=multiplicationnonstatic.multiplication(); //By Industrial way calling static method
		
			System.out.println("Multiplication of two variables is : "+c);
		}
	
}
