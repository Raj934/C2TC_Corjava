package constructor;


public class constructor {
	
	constructor()
	{
		System.out.println("Default constructor");
	}
	
	constructor(int i,int j)
	{
		System.out.println("Constructor with the two parameters");
	}
	
	constructor(int a, int b, int c)
	{
		System.out.println("Constructor with the three parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor e = new constructor();
		constructor ob = new constructor(1,2);
		constructor obj = new constructor(3,4,5);

	}

}