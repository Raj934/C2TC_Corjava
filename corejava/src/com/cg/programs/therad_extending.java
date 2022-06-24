package com.cg.programs;

public class therad_extending extends Thread{

	public void run()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new therad_extending();
		t.start();
	}

}
