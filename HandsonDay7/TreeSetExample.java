/* Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not. */

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ob=new TreeSet();
		ob.add("Sakshi");
		ob.add("Ashita");
		ob.add("Sahil");
		ob.add("Divya");
		
		
		System.out.println("Displaying Element Using Iterator");
		Iterator<String> it=ob.iterator();
	     while(it.hasNext())
	     {
	       System.out.println(it.next());
	     }
	     System.out.println();
	     System.out.println("Searching an element");
	     Iterator<String> it1 = ob.iterator();
			String str = "Sam";
			boolean r = false;
			
			while (it1.hasNext()) {
				if (it1.next().equals(str)) {
					r = true;
					break;
				}
			}
			
			if (r) System.out.println(str + " exists");
			else System.out.println(str + " doesn't exist");
			
			System.out.println();
			System.out.println("Displaying Elements in reverse order");
			Iterator<String> it2 = ob.descendingIterator();
			while(it2.hasNext())
		     {
		       System.out.println(it2.next());
		     }
			
	     
	}

}
