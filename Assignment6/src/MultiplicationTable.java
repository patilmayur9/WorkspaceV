// Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
// 5*1=5.......5*10=50)
public class MultiplicationTable 
{
	public static void main(String args[])
	{
		int a=5;
		int i;
		System.out.println("Multiplication table of "+a+" is as follows.");
		
		for(i=1;i<=10;i++)
		{
			System.out.println("5 * "+i+" = "+(5*i));
			
		}
		
	}

}
