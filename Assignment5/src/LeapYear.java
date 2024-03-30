//write a program  to check whether  year is leap year or not. (If else stmt).

public class LeapYear
{
	//int a;
	//static char ch;
	
	public static void main(String args[])
	{
		int a=100;
		LeapYear leapyear=new LeapYear();
		leapyear.leapYear(a);
		
		//System.out.println("the default value of a is: "+leapyear.a+" and  ch :__"+ch+"____");
	
	}

	void leapYear(int a)
	{
		if((a%4==0) && (a%100 !=0) && (a%400 == 0) )
		{
			System.out.println("The given year is leap Year : "+a);
		}
		else
		{
			System.out.println("The given year is not a leap Year : "+a);
		}
		
		
	}

}
