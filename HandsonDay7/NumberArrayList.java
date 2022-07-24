/* Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class NumberArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> list = new ArrayList();
	
			list.add(15);
			list.add(1.2F);
			list.add(3.1415D);
		
		Iterator it = list.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
