package com.cg.programs;

public class join_thread implements Runnable{

	public void run()
	{
		System.out.println("child thread is running");
		for (int i=1;i<=4;i++)
		{
			System.out.println("i="+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		join_thread a=new join_thread();
		Thread t=new Thread(a,"child");
		t.start();
		try
		{
			t.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			System.out.println("main Thread is ending");
		}
		System.out.println("main Thread is ending");
	
		
		
	}

}
