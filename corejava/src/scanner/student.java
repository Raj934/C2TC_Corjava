package scanner;
import java.util.*;
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Scanner a1= new Scanner(System.in);
    System.out.println("enter a name");
    char c= a1.nextLine().charAt(3);
    
    
    System.out.println("enter student name");
    String n =a1.nextLine();
    
    
   
    
    System.out.println("enter student id");
    int i =a1.nextInt();
    
    System.out.println("enter student marks 1");
    float a =a1.nextFloat();
    
    System.out.println("enter student marks 2");
    float b =a1.nextFloat();
    System.out.println("c="+c);
    System.out.println("name="+n+"\nID="+i+"\nmarks 1="+a+"\nmarks 2="+b+"\ntotal marks ="+(a+b));
    
	}

}