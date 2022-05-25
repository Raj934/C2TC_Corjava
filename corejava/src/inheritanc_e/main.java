package inheritanc_e;

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


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parrot a1=new parrot();
		
		a1.whatColourIam();
		a1.fly();
	}

}
