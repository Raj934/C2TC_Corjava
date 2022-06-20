package stack;
import java.util.*;
public class stac_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack<String> stack=new Stack<String>();
	stack.add("hello");
	stack.add("hi");
	stack.add("gm");
	stack.add("bye");
	stack.add("good");
	stack.add("bad");
	System.out.println("Element of the stack is="+stack);
	
	Iterator<String> it= stack.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next()+"  ");
	}
	System.out.println();
	stack.pop();
	System.out.println(stack);
	System.out.println(stack.empty());
	System.out.println(stack.peek());



	}

}
