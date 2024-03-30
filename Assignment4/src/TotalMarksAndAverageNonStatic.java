//Write the Java Program to calculate total of five subject marks and average of it.
//by using Non static method
public class TotalMarksAndAverageNonStatic 
{
	public int  totalMarks()
	{
		int a=60;
		int b=70;
		int c=80;
		int d=90; 
		int e=90;
		int total=a+b+c+d+e;
		return (total);
	}
	
	public static void main (String args [])
	{
		TotalMarksAndAverageNonStatic totalmarksandaveragenonstatic=new TotalMarksAndAverageNonStatic();
		int c=totalmarksandaveragenonstatic.totalMarks(); //By Industrial way calling static method
		
		System.out.println("Avreage marks of five subjects is : "+(c/5));
		
	}

}