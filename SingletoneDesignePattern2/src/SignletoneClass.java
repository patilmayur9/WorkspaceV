import java.io.Serializable;

public class SignletoneClass implements Cloneable,Serializable
{
	private static SignletoneClass singletoneClassObject=null;
	
	private SignletoneClass()
	{
		
	}
	
	public static SignletoneClass getSingletoneClassObject()
	{
		synchronized (SignletoneClass.class)//multi Threading is disabled
		{
			if(singletoneClassObject==null)
			{
				singletoneClassObject= new SignletoneClass();
				return singletoneClassObject;
			}
			else
			{
				return  singletoneClassObject;
			}
			
		}
	}
	
	public Object readResolve()//it must return a Object not a class
	{
		return singletoneClassObject;
	}
	
	public  Object clone()//it may return object or class also no matter
	
	{
		return singletoneClassObject;
	}
}
