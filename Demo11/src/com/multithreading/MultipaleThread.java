package com.multithreading;

public class MultipaleThread extends Thread
{
	public static void main(String[] args)
	{
		MultipaleThread multipalethread=new MultipaleThread();
		MultipaleThread multipalethread1=new MultipaleThread();
		multipalethread.start();
		multipalethread1.start();
		
		System.out.println("in main"); 
		System.out.println(multipalethread.getName());
		System.out.println(".....");
		System.out.println(multipalethread.getClass());
		System.out.println(".....");
		System.out.println(multipalethread.getClass().getName());
		System.out.println(".....");
		System.out.println(multipalethread.getId());
		System.out.println(multipalethread.getPriority());
		System.out.println(multipalethread.getState());
		
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			//hear also we can write this line System.out.println(i);//it prints the number taking 5oo miliseconds pause slowly
			try
			{
				//System.out.println(i);//it prints the number taking 5oo miliseconds pause slowly
				Thread.sleep(500);//it will be sleep 500 mili seconds
				
			}
			catch(Exception e)
			{
				
				System.out.println(e);
			}
			
		}
	}
}
