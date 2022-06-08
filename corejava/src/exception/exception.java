package exception;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("one");
		System.out.println("two");
		try 
		{
		 System.out.println("before error");
		 int j=10/i;
		 System.out.println("after error");
		}
		catch(Exception e)
		{
			System.out.println("after catching exception");
			
		}
		System.out.println("three");
		System.out.println("four");

	}

}
