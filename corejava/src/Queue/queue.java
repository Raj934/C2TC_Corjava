package Queue;
import java.util.*;
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q= new PriorityQueue<String>();
		q.add("raj");
		q.add("kumar");
		//q.add(null);   //null is not allowed in Queue 
		System.out.println(q);
		q.clear();
		System.out.println(q);
	//	System.out.println(q.remove());  //it returns Exception that there is no element in Queue
		System.out.println(q.poll());    // it returns Null when the queue is empty
		
		q.add("hello");
		q.add("hi");
		
		System.out.println(q.element()); //it Returns the head of this queue
		System.out.println(q.peek());   //it Returns the head of this queue
		System.out.println(q.remove());
		System.out.println(q);
	}

}
