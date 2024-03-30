//Write the Java Program to calculate total of five subject marks and average of it.
//by using static method
public class TotalMarksAndAverageStatic
{ 
	public static int  totalMarksOfStudent()
	{
		int a=50;
		int b=50;
		int c=50;
		int d=50;
		int e=50;
		int total=a+b+c+d+e;
		return (total);
	}
	
	public static void main (String args [])
	{
		int a=TotalMarksAndAverageStatic.totalMarksOfStudent(); //By Industrial way calling static method
		
		System.out.println("Avreage marks of five subjects is : "+(a/5));
		
	}

}