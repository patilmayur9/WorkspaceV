import java.io.Serializable;

public class SingletoneClass  implements Cloneable, Serializable{

	 
	 
		private static SingletoneClass singletoneClassObject =null;
		
		private SingletoneClass()
		{
			
		}

		public static SingletoneClass getSingletoneClassObject()
		{
			 synchronized (SingletoneClass.class ) {
				
			}
			{
				if(singletoneClassObject==null)
				{
					singletoneClassObject = new SingletoneClass();
					return singletoneClassObject ;
				}
				else
				{
					return singletoneClassObject ;
				}				
			}	
		}
		
		public Object readResolve()
		{	
			return singletoneClassObject;	
		}
		
		public SingletoneClass clone()
		{	
			return singletoneClassObject;	
		}		

	}