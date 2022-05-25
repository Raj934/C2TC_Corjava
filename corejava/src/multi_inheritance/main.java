package multi_inheritance;

class bird
{
	void fly()
	{
 	System.out.println("i am Bird");
		
	}
}

class parrot extends bird
{
	void whatColourIam()
	{
		System.out.println("i am green");
		
	}
}

class singingparrot extends parrot
{
	void whatCanIsing()
	{
		System.out.println("i can sing opera");
		
	}
}




public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singingparrot a1=new singingparrot();
		a1.whatCanIsing();
		a1.whatColourIam();
		a1.fly();
	}

}
