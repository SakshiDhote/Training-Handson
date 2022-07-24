/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.*;
import java.util.Map.Entry;

class ContactList {
	HashMap<String, Integer> contact = new HashMap<>();
	
	public void addContact(String name, Integer number) {
		contact.put(name, number);
	}
	
	public String isKeyExist(String name) {
		Set<Entry<String, Integer>> set = contact.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			
			if (me.getKey().equals(name)) {
				return name + "Key is present ";
			}
		}
		
		return name + "Key is not present ";
	}
	
	public String isValueExist(Integer number) {
		Set<Entry<String, Integer>> set = contact.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			if (me.getValue().intValue() == number) {
				
				return number + "value is present ";
			}
		}
		
		return number + " value is not present ";
	}
	
	public void allContacts() {
		Set<Entry<String, Integer>> set = contact.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}

	}
}
public class Contacts {

	public static void main(String[] args) {
		
		ContactList c = new ContactList();
		
		c.addContact("Sakshi", 957954888);
		c.addContact("Sahil", 94002284);
		c.addContact("Mayank", 7483647);
				
		System.out.println(c.isKeyExist("Sakshi"));
		System.out.println(c.isValueExist(94002284));
		
		System.out.println();
		c.allContacts();
		

	}

}

