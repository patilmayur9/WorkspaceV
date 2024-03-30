//write the java program to design method for Division of two numbers which returns int result and print that result into main method.
//by using Non static method
public class DivisionNonStatic 
{ 
	public  int  division()
	{
		int a=775;
		int b=5;
		return (a/b);
	}
	
	public static void main (String args [])
	{
		DivisionNonStatic divisionnonstatic=new DivisionNonStatic();
		int c=divisionnonstatic.division(); //By Industrial way calling static method
  
		System.out.println("Division of two variables is : "+c);		
	}

}
