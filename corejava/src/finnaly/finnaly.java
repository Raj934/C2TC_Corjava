package finnaly;

public class finnaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int d=100/0;
			System.out.println(d);
		}
catch(Exception e)
		{
	System.out.println("can't divide integer by 0");
		}
		finally {
			System.out.println("the try catch is finished");
		}
	}

}
