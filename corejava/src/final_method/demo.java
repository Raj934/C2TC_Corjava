package final_method;



 class a
{
	final void a()
	{
		
	}
}

public class demo //extends a  //The type demo cannot subclass the final class a
{

	final int a=200;
	
	void a()      /*- overrides final_method.a.a
                  - Cannot override the final  method from a*/
	               
	{
		// a=250; //The final field demo.a cannot be assigned
		System.out.println(a);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo ob=new demo();
		ob.a();

	}

}