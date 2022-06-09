package throw_s;
import java.io.IOException;
import java.io.*;

public class throw_s {

	private String fname ,lname;
	void accept()throws IOException
	{
		InputStreamReader sr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(sr);
		System.out.println("enter your first name");
		fname=br.readLine();
		System.out.println("enter your last name");
		lname=br.readLine();
		
	}
	void display()
	{
		System.out.println("full name:"+fname+" "+lname);
	}
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		throw_s o= new throw_s();
		o.accept();
		o.display();

	}

}
