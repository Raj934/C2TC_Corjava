package throw_s;
import java.io.IOException;
public class throws1 {

	static void display () throws IOException
	{
		System.out.println("hellow java");
		throw new IOException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws1 ob = new throws1();
		try
		{
			ob.display();
		}
		catch(IOException e)
		{
			System.out.println("caught an exceptionb:\n"+e);
		}

	}

}
