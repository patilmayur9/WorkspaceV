import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException; 
public class FileInputStream1 
{
	public static void main(String args[])
	{
		try
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\velocity practice programs\\addition.java");
		Scanner sc=new Scanner(fis);
		 
		while(sc.hasNextLine())//it start from 0 th line then 1st line of file and goes to last line is blank or null
		{
			System.out.println(sc.nextLine());//reads the current line of hasNextLIne() for eg. 1st line then 2nd then 3rd.....end of the file
		}
		} 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
//		 ObjectInputStream ois = new ObjectInputStream();
//		 ObjectOutputStream oos = new ObjectOutputStream();
	}

}
