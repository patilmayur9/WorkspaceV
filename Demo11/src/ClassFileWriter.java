import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ClassFileWriter 
{
	public static void main(String[] args) throws IOException 
	{
//		try 											
//		{
//			FileWriter fiw=new FileWriter("C:\\Users\\Admin\\Desktop\\abc1.txt");//C:\Users\Admin\Desktop
//			System.out.println("file Crated successfully : ");
//			
//			fiw.write("my name is mayur patil");
//			System.out.println("content added in file : ");
//			fiw.close();
//		} 
//		catch (IOException e)
//		{		 
//			e.printStackTrace();
//		}
//		System.out.println("file writing is done ");
//		
//		try {
//			FileReader fr=new FileReader("C:\\Users\\Admin\\Desktop\\New folder\\demo.java.txt");
//			Scanner sc=new Scanner(fr);
//			
//			while(sc.hasNext())
//			{
//				System.out.println(sc.nextLine());
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	// File read and write 5 NOV 2023
		FileWriter fw =  new FileWriter("C:\\Users\\Admin\\Desktop\\fileWriter15Nov.txt");
		fw.write("My name is mayur and im writing this below address in this file \n Address AP Gondikuppi \n Tal Nippani \n Dist Belgaum \n State Karnataka \n pin 591237");
		fw.flush();
		System.out.println("File wrting is done");
		
		//read file
		 FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\fileWriter15Nov.txt");
		 Scanner sc =  new Scanner(fr);
		 while(sc.hasNext()) {
			 System.out.println(sc.nextLine());
		 }
		 System.out.println("File read completed");
	}

}
