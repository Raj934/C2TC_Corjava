package static_method;


public class demo {

	static int n=10;
	int J=50;
	
	static void A()
	{
		System.out.println("the value of n ="+n);
		//System.out.println("the value of j ="+J); // Cannot make a static reference to the non-static field J
		//C();//Cannot make a static reference to the non-static method C() from the type demo
	}
	
	void C()
	{
		System.out.println("the value of j ="+J);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo ob=new demo();
		ob.C();
		
		//ob.A();//The static method A() from the type demo should be accessed in a static way
		demo.A();

	}

}
