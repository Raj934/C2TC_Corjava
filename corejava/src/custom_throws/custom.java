package custom_throws;
import java.io.*;
class invalidException extends Exception
{
	public invalidException(String s) {
		super(s);
	
	}
	}

public class custom {
	void check(int weight)throws invalidException
	{
		if(weight<50) {
			throw new invalidException("product invalid");
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
custom ob =new custom ();
try {
	ob.check(35);
}
catch(invalidException ex)
{
	System.out.println("caught the exception");
	System.out.println(ex.getMessage());
	
}
	
	}

}
