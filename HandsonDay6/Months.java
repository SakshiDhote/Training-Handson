/* Write a Java program to create an ArrayList, add all the months of a year and print the same. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Months {
	public static void main(String a[]) {
		List month = new ArrayList();
		month.add("January");
		month.add("Feburary");
		month.add("March");
		month.add("April");
		month.add("May");
		month.add("June");
		month.add("July");
		month.add("August");
		month.add("September");
		month.add("October");
		month.add("November");
		month.add("December");
		Iterator<String> it = month.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
