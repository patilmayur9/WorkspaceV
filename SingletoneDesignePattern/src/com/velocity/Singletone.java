package com.velocity;

import java.io.Serializable;

public class Singletone implements Cloneable,Serializable {
	private static Singletone singletoneObject=null;
	
	private Singletone()//Private Constructor
	{
	
	}
	 
	public static Singletone getSingletone()
	{
		synchronized (Singletone.class) {//class level lock only one thread can accessa at time  
			
		
		if(singletoneObject==null)
		{
			singletoneObject=new Singletone();		//first time class object will be created
			 // return singletoneObject;//hear we can also have this statement other wise use below common statement to return 
		}
		return singletoneObject;//first time object will return only
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return singletoneObject;//for .clone() method it will return globale variable
		}
	
	protected Object readResolve() {
		return singletoneObject;//this will return globale variable at the time of deserilization
		}
	

}
