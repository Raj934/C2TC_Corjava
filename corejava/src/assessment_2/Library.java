package assessment_2;
import java.util.*;
import java.io.*;
public class Library {
   
   int Acc_num;
   String  Author;
   String Title;
   int d;
   Scanner ob1 = new Scanner(System.in);
   
    public void input()  
	{
    	Scanner ob1 = new Scanner(System.in);
    	
    	System.out.println("enter the Author of the book");
		Author= ob1.nextLine();
	    
	
		 
		 System.out.println("enter the title of the book");
		 Title= ob1.nextLine();

         System.out.println("enter the accession number of the book");
		 Acc_num = ob1.nextInt();
			
		 System.out.println("enter number of days late:");
				
		 d=ob1.nextInt();
	}
  
       	

	

    void compute() 
    {
    	
		int fine =5*d;
    	
    	System.out.println("fine charged=Rs."+fine);
    }
	public void display()  
	{
		
		
		System.out.println("Accession Number"+"\t"+"Title"+"\t"+"Author");
		System.out.println(Acc_num +"\t"+"\t"+"\t"+Title+"\t"+Author);

	}
		

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   
		
		
		Library ob2 = new Library();
		ob2.input();
		ob2.compute();
		ob2.display();

		
	}

}



