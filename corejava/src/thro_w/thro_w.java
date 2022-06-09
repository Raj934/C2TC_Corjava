package thro_w;

public class thro_w {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//ArithmeticException a=new ArithmeticException("hellow from throw"); 
		throw new	ArithmeticException("hellow form throw");
		}
		catch(ArithmeticException a)
		{
			System.out.println("ArithmeticException caught:\n"+a);
			System.out.println(a.getMessage());
		}
	}

}
