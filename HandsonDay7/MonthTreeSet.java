/* Write a Java program to create an TreeSet, add all the months of a year and print the same.
*/


import java.util.Iterator;
import java.util.TreeSet;

public class MonthTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> month=new TreeSet();
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
