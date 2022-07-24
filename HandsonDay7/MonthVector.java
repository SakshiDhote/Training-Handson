/*Write a Java program to create an Vector, add all the months of a year and print the same.
*/

import java.util.Iterator;
import java.util.Vector;

public class MonthVector {

	public static void main(String[] args) {
		Vector month = new Vector();
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
