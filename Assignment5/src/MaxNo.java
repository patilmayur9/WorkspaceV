//write a program to find out maximum number among three number(if else if ladder statement)
public class MaxNo 
{
	public static void main (String args [])
	{
		int a=1;
		int b=1;
		int c=6;
		MaxNo maxno=new MaxNo();
		maxno.maximumNumber(a,b,c);	
		
	}
	void maximumNumber(int a,int b,int c)
	{
		 
		if(a>b && a>c)
		{
			System.out.println("a is gretest no out of Three no: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is gretest no out of Three no: "+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("c is gretest no out of Three no: "+c);
		}
		else
		{
			System.out.println("All no are Equal: "+a+" "+b+" "+c);
		}
		  		
	}
	

}
