package thro_w;

public class throw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=0;
		try
		{
			int z=x/y;
			System.out.println("result"+z);
			//ArithmeticException a=new ArithmeticException("hellow from throw"); 
			//throw a;
		throw new	ArithmeticException();
		}
		catch(ArithmeticException a)
		{
			System.out.println("ArithmeticException caught:\n"+a);
			
		}
	}

}
