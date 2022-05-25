package super_key;
class P_class
{
	int var= 100;
}
class C_class extends P_class
{
	int var=50;

     void display()
    {
    	 System.out.println("the var value of child:"+var);
    	 System.out.println("the var value of parent:"+super.var);  //super keyword will refer to parent class variables
    }
	
     }
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C_class c1 =new C_class();
		c1.display();
	}

}



