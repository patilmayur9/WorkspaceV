import java.lang.System;
public class classPath {
	public static void main(String args[])
	{
		String a= System.getProperty("java.class.path");
		String arr[]=a.split("\\\\");
		for(String ar :arr)
		{
			System.out.println(ar);
		}
		System.out.println("Classpath is"+a);
	}

}
