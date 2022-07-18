package com.cg.programs;


 class A
{
	int i;
	boolean flag=false;
	synchronized void deliver(int i)
	{
		if(flag)
			try
		{
				wait();
				
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		this.i =i;
		flag=true;
		System.out.println("Data Delivered:"+i);
		notify();
	}
	synchronized int recived()
	{
		if(flag)
			try
		{
				wait();
				
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		
		System.out.println("Data recived:"+i);
		flag=false;
	
		notify();
		return i;
	}
}

class Thread6 extends Thread
{
	A ob;
	Thread6(A ob)
	{
		this.ob=ob;
	}
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			ob.deliver(j);
		}
	}
}
class Thread5 extends Thread
{
	A ob;
	Thread5(A ob)
	{
		this.ob=ob;
	}
	public void run()
	{
		for(int k=0;k<=5;k++)
		{
			ob.recived();
		}
	}
}
public class Inter_thread_communication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A ob=new A();
		Thread6 t1=new Thread6(ob);
		
		Thread5 t2=new Thread5(ob);
		t1.start();
		t2.start();
	}

}
