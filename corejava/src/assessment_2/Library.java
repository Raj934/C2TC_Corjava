package assessment_2;
import java.util.*;
import java.io.*;
public class Library {
   
   int Acc_num;
   String  Author;
   String Title;
   Scanner ob1 = new Scanner(System.in);
   
    public void input()  throws  Exception
	{
    	 InputStreamReader r=new InputStreamReader(System.in);
    		BufferedReader br=new BufferedReader(r);
    	System.out.println("enter the Author of the book");
		Author= br.readLine();
	    
		System.out.println("enter the accession number of the book");
		 Acc_num = ob1.nextInt();
		 
		 System.out.println("enter the title of the book");
		 Title= br.readLine();
										
	}
  
       	

	

    void compute() 
    {
    	System.out.println("enter number of days late:");
    	int d=ob1.nextInt();
    	int fine =5*d;
    	
    	System.out.println("fine charged=Rs."+fine);
    }
	public void display()  
	{
		
		
		System.out.println("Accession Number"+"\t"+"Title"+"\t"+"Author");
		System.out.println(Acc_num +"\t"+"\t"+"\t"+Title+"\t"+Author);

	}
		

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
   
		
		
		Library ob2 = new Library();
		ob2.input();
		ob2.display();
		ob2.compute();

		
	}

}
