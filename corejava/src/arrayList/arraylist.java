package arrayList;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ll= new ArrayList <String>();

		System.out.println("Add ellement in an arraylist ");
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.add("F");
		ll.add("G");

		System.out.println("the elements in an arraylist are "+ll);
		System.out.println("remove element after B");
		ll.remove(2);
		System.out.println("add element 'Z' at the index 2 ");
		ll.add(2,"Z");

		System.out.println("the elements in an arraylist are "+ll);
		
	}

}
