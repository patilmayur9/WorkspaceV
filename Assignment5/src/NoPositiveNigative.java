//1.write a program to check the number is positive or negative.
//10/02/2022

public class NoPositiveNigative 
{
	public static void main (String args[])
	{
		int no=-1;
		NoPositiveNigative nopositivenigative=new NoPositiveNigative();
		nopositivenigative.positiveNigative(no);
		//System.out.println("The given no is ");
		
	}
	 public void positiveNigative(int a)
	 {
		 if(a>0)
			 System.out.println("The given no is Positive : "+a);
		 else		 
		 	 System.out.println("The given no is Negative : "+a);
		 
	 }

}
