package abstraction;

abstract class machine
{
	abstract void withdraw();
}
public class atm extends machine
{
	void withdraw()
	{
		System.out.println("withdraw successfully");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		atm ob1 = new atm();
		ob1.withdraw();

	}

}
