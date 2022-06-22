package thread;

public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=Thread.currentThread();
	    System.out.println(t);
	    System.out.println("the thread is ---- "+t.getName());
	    t.setName("new problem");
	    System.out.println("the new thread is ----- "+t.getName());
	   System.out.println("the priority of thread is ---"+ t.getPriority());
	   t.setPriority(6);
	   System.out.println("new set priority is--- "+t.getPriority());
	    
	}

}
