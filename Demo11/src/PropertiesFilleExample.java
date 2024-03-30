import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;//hear we import the properties package contain properties class

public class PropertiesFilleExample 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
			FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\prop.mayur");//hear we use any type of file extention but same file with same extention must create at decribed loaction
			//FileReader fr=new FileReader("C:\\Users\\Admin\\prop.mayur");
			Properties p=new Properties();
			p.load(fis);//load the file
			
			String username=p.getProperty("username");
			String password=p.getProperty("password");
			String id = p.getProperty("id");
			
			System.out.println("user name is : "+username);
			System.out.println("password name is : "+password);
			System.out.println("id is : "+id);
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
