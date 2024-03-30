import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass
{
	public static void main(String args[]) throws Exception
	{
		//using new keyword
		//SingletoneClass singletoneClass=new  SingletoneClass ();//this will give eroor becouse of our counstructor is private so hear construcotr is not visible
		
		//using cloning
		SingletoneClass s=SingletoneClass.getSingletoneClassObject();
		SingletoneClass s1=(SingletoneClass) s.clone();
			
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));//another way of checking two objects are same or not

		//using deserilization
		SingletoneClass s3=SingletoneClass.getSingletoneClassObject();
		ObjectOutputStream oos= new ObjectOutputStream (new FileOutputStream("C:\\Users\\Admin\\Desktop\\xyz.txt"));
		oos.writeObject(s3);
		oos.flush();

		//Deserilization
		ObjectInputStream ois=new ObjectInputStream (new FileInputStream("C:\\Users\\Admin\\Desktop\\xyz.txt"));
		SingletoneClass  s4=(SingletoneClass)ois.readObject();
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.equals(s4));	
		
		
	}
}

 
