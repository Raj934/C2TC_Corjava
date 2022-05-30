package final_variable;

public class demo {

	final int a=200;
	
	void a()
	{
		//a=250; //The final field demo.a cannot be assigned
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo ob=new demo();
		ob.a();

	}

}
