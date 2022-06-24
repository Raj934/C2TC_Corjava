package com.cg.programs;

public class yiel_d implements Runnable{
	public void run()
	{
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yiel_d a=new yiel_d();
		Thread t=new Thread(a,"chlid1");
		yiel_d b=new yiel_d();
		Thread t1=new Thread(b,"chlid2");
		t.start();
		t1.start();
		
	}

}
