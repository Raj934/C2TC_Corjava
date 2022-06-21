package HashSet;
import java.util.*;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	LinkedHashSet<String> set =new LinkedHashSet<String>();  
		HashSet<String> set =new HashSet<String>();
			set.add("java");
			set.add("jvm");
			set.add(null);
			set.add(null);
			set.add("jdk");
			System.out.println(set);
			
			Iterator<String> it=set.iterator();
			while(it.hasNext())
				
			{
				System.out.println(it.next());
		
			}
			set.remove("jvm");
			System.out.println(set);
			System.out.println("the size of set is="+set.size());	
			System.out.println("Is the set is Empty?  ---"+set.isEmpty());
			System.out.println("Does the string 'java' prisent in the set? ---"+set.contains("java"));
			System.out.println(set.toArray());


			
		}
}

	