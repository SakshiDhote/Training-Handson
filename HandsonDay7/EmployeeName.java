/* Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.*/

import java.util.*;

public class EmployeeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ob=new HashSet();
		ob.add("Sakshi");
		ob.add("Suraj");
		ob.add("Sahil");
		Iterator<String> it = ob.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
