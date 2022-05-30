package final_class;

final class a
{
	int c=10;
}

public class demo //extends a  //The type demo cannot subclass the final class a
{

	final int a=200;
	
	void a()
	{
		// a=250; //The final field demo.a cannot be assigned
		System.out.println(a);
		// System.out.println(c);  //c cannot be resolved to a variable
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo ob=new demo();
		ob.a();

	}

}
