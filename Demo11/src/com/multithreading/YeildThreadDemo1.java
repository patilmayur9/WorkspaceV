package com.multithreading;

import java.util.concurrent.SynchronousQueue;

public class  YeildThreadDemo1 extends Thread
{
	public  void run()
	{
		for (int i=0;i<=5;i++)
		{
			System.out.println("this is yiledThreadDemo1 class : ");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)  
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
