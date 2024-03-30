package com.multithreading;

public class WaitNotifyNotifyall_1 extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("this is Object 1st run method : ");
			
		}
		notify();
	}
	
}
