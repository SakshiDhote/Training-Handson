/* Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and
returns the country if exist else return null.
NOTE: You can test the methods using a main method. */

import java.util.HashSet;
import java.util.Iterator;
class Country{
	HashSet<String> H1=new HashSet();
	public HashSet<String> saveCountryNames(String CountryName){
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName){
		
		Iterator<String> it = H1.iterator();
		while (it.hasNext())
		{
			if(it.next().equals(CountryName)) {
				return CountryName;
			}
				
			
		}
		return null;
	}
}
public class HashSetCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c=new Country();
		c.saveCountryNames("India");
		c.saveCountryNames("USA");
		c.saveCountryNames("China");
		c.saveCountryNames("UK");
		
		System.out.println(c.getCountry("India"));
		System.out.println(c.getCountry("Japan"));	

	}

}
