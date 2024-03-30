package com.multithreading;

public class ThreadJoinDemoMainClass
{
	public static void main(String[] args)
	{
		ThreadJoinDemo threadjoindemo=new ThreadJoinDemo();
		threadjoindemo.start();
		try
		{
			//threadjoindemo.join();//hear we stop the main thread execution to complete the other thread execution like ThreadJoinDemo class thread
		} 
		catch (/*Interrupted*/Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//main thread logic
		for(int i=0;i<5;i++)
		{
			System.out.println("this is main Thread ");
			try 
			{
				threadjoindemo.join();//hear only ones print the main thread logic and then go to other thread after completion of the other thread main thread will be executed
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
