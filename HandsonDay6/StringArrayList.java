/* Create an ArrayList that can store only Strings.
Create a printAll method that will print all the elements of the ArrayList using an Iterator. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArrayList {
	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Element  1");
		list.add("Element 2");
		list.add("Element 3");
		list.add("Element 4");
		list.add("Element 5");
		list.add("Element 6");
		
		printAll(list);

	}

}
