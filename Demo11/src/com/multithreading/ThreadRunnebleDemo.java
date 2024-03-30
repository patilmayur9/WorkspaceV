package com.multithreading;

public class ThreadRunnebleDemo implements Runnable 
{
	public static void main(String[] args) 
	{
		ThreadRunnebleDemo threadrunnebledemo=new ThreadRunnebleDemo();
		Thread thread=new Thread(threadrunnebledemo);
		thread.start();//hear we can use the thread.run() also
	 
	}

	/*public void run()//self created method 
	{
		
	}*/
	@Override
	public void run()// TODO Auto-generated method stub
	{
		for(int i=0;i<10;i++)
		System.out.println("run method 2");
	}
}
