package com.cg.programs;

import java.lang.*;


class tab
{
	 void print_table(int n)
	{
		 synchronized(this) {
			 
		
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
		}}
	}
	
}

class Thread4 extends Thread
{
	tab t;
	Thread4(tab t){
		this.t=t;
	}
	public void run() {
		t.print_table(2);	
	}
	
}

class Thread3 extends Thread
{
	tab t;
	Thread3(tab t){
		this.t=t;
	}
	public void run() {
		t.print_table(10);	
	}
	
}



public class synchronization_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tab ob=new tab();
		Thread4 t1 = new Thread4(ob);
		Thread3 t2 = new Thread3(ob);
		t1.start();
		t2.start();
	}

}
