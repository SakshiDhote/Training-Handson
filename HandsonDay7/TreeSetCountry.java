/* Develop a java class with a instance variable H1 (TreeSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a HashSet (H1) and return the added TreeSet(H1).
Develop a method getCountry(String CountryName) which iterates through the TreeSet and
returns the country if exist else return null.
NOTE: You can test the methods using a main method. */

import java.util.TreeSet;
import java.util.Iterator;

class Country1 {
	TreeSet<String> H1 = new TreeSet();

	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}

	public String getCountry(String CountryName) {

		Iterator<String> it = H1.iterator();
		while (it.hasNext()) {
			if (it.next().equals(CountryName)) {
				return CountryName;
			}

		}
		return null;
	}
}

public class TreeSetCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country1 c = new Country1();
		c.saveCountryNames("India");
		c.saveCountryNames("USA");
		c.saveCountryNames("China");
		c.saveCountryNames("UK");

		System.out.println(c.getCountry("India"));
		System.out.println(c.getCountry("Japan"));

	}

}
