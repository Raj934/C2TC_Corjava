package com.cg.programs;
import java.lang.*;


class table
{
	synchronized void print_table(int n)
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
	
}

class Thread1 extends Thread
{
	table t;
	Thread1(table t){
		this.t=t;
	}
	public void run() {
		t.print_table(2);	
	}
	
}

class Thread2 extends Thread
{
	table t;
	Thread2(table t){
		this.t=t;
	}
	public void run() {
		t.print_table(10);	
	}
	
}
public class syncronization_Method  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table ob=new table();
		Thread1 t1 = new Thread1(ob);
		Thread2 t2 = new Thread2(ob);
		t1.start();
		t2.start();

	}

}
