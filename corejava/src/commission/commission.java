package commission;

import java.util.*;

public class commission {
	String name;
	String address;
	long phone;
	float sales_amount;
	float commission;
	float commisison_per;
	
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name");
		System.out.println("");
		name = s.nextLine();
		
		System.out.println("Enter the address");
		address = s.nextLine();
		
		System.out.println("Enter the phone number");
		phone = s.nextLong();
		
		System.out.println("Enter the sales amount");
		sales_amount = s.nextFloat();
	}
	
	void compute()
	{
         Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the commisison %");
		commisison_per = s.nextInt();
		
		if(sales_amount >=10000)
		{
			commission= (commisison_per/100)*sales_amount;
			System.out.println("The commission "+ commission);
		}
		else if(sales_amount <=5000&& sales_amount >=3000)
			
		{
			commission= (commisison_per/100)*sales_amount;
			System.out.println("The commission "+ commission);
		}
		else if (sales_amount<  3000 )
		{
			commission= (commisison_per/100)*sales_amount;
			System.out.println("The commission "+ commission);
			
		}
		
		
	}
	
	void display()
	{
		
		System.out.println("NAME \t ADDRESS \t PHONE NUMBER\t SALES AMOUNT\t COMMISSION AMOUNT");
		System.out.println(name+"\t"+address+" \t"+phone+ "\t"+" \t"+sales_amount+ "\t" +" \t"+commission+ "\t");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		commission cm = new commission();
		cm.input();
		cm.compute();
		cm.display();
		

	}

}