package hierarchial_inheritance;



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

class crow extends bird
{
	void whatColourIam()
	{
		System.out.println("i am black");
		
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parrot par=new parrot();
		crow cro=new crow();
		
		par.whatColourIam();
		par.fly();
		
		cro.whatColourIam();
		cro.fly();
		
	}

}
