package poly;

public class polymorphism 
{
	void add (int a,int b)
	{
		System.out.println("addition of 2 num is="+(a+b));
		
	}
	void add (int x,int y,int z)
	{
		System.out.println("addition of 3 num is ="+(x+y+z));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		polymorphism a1 =new polymorphism();
		a1.add(2, 3);
		a1.add(1, 5, 6);
	}

}
