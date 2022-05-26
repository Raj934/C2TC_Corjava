package OVER_LOADING;

public class simple_cal {
	 void prnsqr(int i)
	{
		System.out.println("square of the integer "+i+" is "+i*i);
		
	}
	void prnsqr(char c)
	{
		System.out.println(c+ " is a character");
		
	}
	
	
	void prnsqr(float f)
	{
		System.out.println("square of the decimal "+f+" is "+f*f);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simple_cal a= new simple_cal();
	    a.prnsqr('a');
		a.prnsqr(2.2f);
		a.prnsqr(5);
		
	

	}

}
