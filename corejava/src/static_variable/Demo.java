package static_variable;

public class Demo 
{
	
	static int age;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Demo ob=new Demo();
		Demo ob1=new Demo();
		ob.age=30;
		ob1.age=40;
		System.out.println("value of age ="+ob.age);
		System.out.println("value of age ="+ob1.age);
		

	}

}
