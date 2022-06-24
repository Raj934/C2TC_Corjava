package com.cg.programs;
import java.lang.*;
public class therad_implements implements Runnable {

	public void run()
	{
		System.out.println("new thread running");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		therad_implements hello=new therad_implements();
		Thread t= new Thread (hello);
		t.setName("mythread");
		t.start();
	}

}
