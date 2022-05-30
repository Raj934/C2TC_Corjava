package static_blocks;

public class A {

	static int a;
    static	int b;
	static            
	{
	 a=200;
	 b=200;
		System.out.println("hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcom");
		System.out.println("the value of a="+a);
		System.out.println("the value of b="+b);

	}

}
