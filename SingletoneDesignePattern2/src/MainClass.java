import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) throws   Exception {
		// SignletoneClass s=new SignletoneClass(); using new key word we can not create this class object
		
//		SignletoneClass s=SignletoneClass.getSingletoneClassObject();//this way also only one object is created
//		SignletoneClass s1=SignletoneClass.getSingletoneClassObject();
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
//		System.out.println(s.equals(s1));
		
		//using Serlization
		SignletoneClass s1=SignletoneClass.getSingletoneClassObject();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Singltone");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		
		//using Deserlization
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Singltone");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SignletoneClass o= (SignletoneClass)ois.readObject();
		
		System.out.println(s1.equals(o));
		System.out.println(s1.hashCode());
		System.out.println(o.hashCode());
	}
}
