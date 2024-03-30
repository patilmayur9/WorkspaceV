//write the java program to design method for addition of two numbers which returns int result and print that result into main method.
//by using  static method
public class AdditionStatic 
{
	public static int  addition()
	{
		int a=20;
		int b=10;
		return (a+b);
	}
	
	public static void main (String args [])
	{
		int a=AdditionStatic.addition();//By Industrial way calling static method
		
		//AdditionStatic additionstatic=new AdditionStatic();// static method calling by using object of class
		//int a=additionstatic.addition();                  //
		
		//int c=addition();//direct calling static method 
		
		System.out.println("Addition of two variables is : "+a);
		
	}

}
