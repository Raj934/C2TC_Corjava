package interfac_e;


interface myinterface 
{
 public void method1();
 public void method2();
 
}
class interfac_e implements myinterface
{
	public void method1() {
		System.out.println("method1");
	}
	public void method2()
	{
		System.out.println("methos2");
	}
	private static void main(String[] arg) {
		// TODO Auto-generated method stub

		interfac_e ob=new interfac_e();
		ob.method1();
		ob.method2();
	}
}