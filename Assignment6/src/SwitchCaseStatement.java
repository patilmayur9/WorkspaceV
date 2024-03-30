//11/02/2022
//Write a program to print month of year. Case 1 January case 2 February case n....use switch case
public class SwitchCaseStatement
{
	public static void main(String args [])
	{
		int a=6;
		switch(a)
		{
		case 1:
			System.out.println ("This month is javuary");
			break;
		case 2:
			System.out.println ("This month is february");
			break;
		case 3:
			System.out.println ("This month is march");
			break;
		case 4:
			System.out.println ("This month is april");
			break;
		case 5:
			System.out.println ("This month is may");
			break;
		case 6:
			System.out.println ("This month is june");
			break;
		case 7:
			System.out.println ("This month is july");
			break;
		case 8:
			System.out.println ("This month is august");
			break;
		case 9:
			System.out.println ("This month is september");
			break;
		case 10:
			System.out.println ("This month is october");
			break;
		case 11:
			System.out.println ("This month is november");
			break;
		case 12:
			System.out.println ("This month is december");
			break;
			
		default:
			System.out.println("undefined case ch :" + a);
		}
		
	}
}
