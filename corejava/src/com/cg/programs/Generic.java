package com.cg.programs;

class Generic_Class<T>
{
	 Generic_Class()
	{
	System.out.println("The generic class is decleard now ,you can use it well");	
	}
	 
	 public void MethodGeneric(T obj)
	 {
		 System.out.println("the type of the boject that this class now contain is "+obj.getClass().getSimpleName());
	 }
}

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generic_Class<Integer> tab=new Generic_Class<Integer>();
		Integer a=6;
		tab.MethodGeneric(a);
		
		Generic_Class<String> tab1=new Generic_Class<String>();
		String b="hello world";
		tab1.MethodGeneric(b);
		
	}

}
