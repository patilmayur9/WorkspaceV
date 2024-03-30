package com.singleton;

import java.io.Serializable;
 

public class SingletoneClass implements  Cloneable,Serializable
{
	private static SingletoneClass singletoneClass=null;
	private SingletoneClass() {
		// TODO Auto-generated constructor stub
	}

	public static SingletoneClass getSingletoneClass() {
		synchronized (SingletoneClass.class) {
			
			if(singletoneClass==null)
			{
				singletoneClass=new SingletoneClass();
				return singletoneClass;
			}
			else
			{
				return singletoneClass;	
			}
		
		}
			
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return singletoneClass;
	}
	
	protected Object readResolve()
	{
		return singletoneClass;
		
	}
}
