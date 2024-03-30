package com.velocity.filehHndling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//import org.omg.CORBA.ExceptionList;

public class FindOwelsNumbersInFile
{
	public static void main (String args[])
	{
		
		FileInputStream fs=null;
		
		try 
		{
			 fs=new FileInputStream("C:\\Users\\Admin\\Desktop\\file.txt");
			 System.out.println("File is readed Successfully");
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File not found in Given file location ");
			e.printStackTrace();
		}
		 
		Scanner scanner=new Scanner(fs);
		char ch;
		int num=0,count=0;
		String temp="",temp1="";
		
		while(scanner.hasNextLine())
		{	
			String str=scanner.nextLine();
			 
			 for (int i=0;i<str.length();i++)
			 {
				 ch= str.charAt(i);
				 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				 {
					  count++;	
					  temp=ch+temp;
				 }
				 else if(ch>=48 && ch<=57)
				 {
					 num++;
					 temp1+=ch;
				 }
			  }	 
		}
		
		System.out.println("Total Vowels present in the file.text file is : " +count+" And the vowels are : "+temp);
		System.out.println("Total Numbers present in the file.text file is : "+num+" And the numbers are : " +temp1);
		System.out.println("file reading completed : ");
		
	}
	

}


/*try this code is for Writing the file
{
	FileWriter fw=new FileWriter("C:\\Users\\Admin\\abc.txt");
	fw.write("hi veloctiy");
	fw.write("this is mayur patil ");
	fw.close();
	System.out.println("file writing is completed");
}
catch (IOException e)
{
	e.printStackTrace();
}
*/
