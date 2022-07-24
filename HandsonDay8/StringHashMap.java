/* Create a Collection called HashMap which is capable of storing String objects.
 The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/


import java.util.*;
import java.util.Map.Entry;
public class StringHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> ob=new HashMap<>();
		ob.put("Sakshi", "Dhote");
		ob.put("Virat","Kohli");
		ob.put("Mayank", "Bhoyar");
		
		
		String k="";
		System.out.println("Check if a particular key exists or not.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any key ");
		k = sc.nextLine();
		Set<Entry<String, String>> set = ob.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			
			if (m.getKey().equals(k)) {
				System.out.println("Key " + k + " exists");
				break;
			}
			
		}
		
		System.out.println();
		String v="";
		System.out.println("Check if a particular value exists or not.");
		
		System.out.println("Enter any value ");
		v = sc.nextLine();
		Set<Entry<String, String>> set1 = ob.entrySet();
		Iterator<Entry<String, String>> it1 = set1.iterator();
		
		while (it1.hasNext()) {
			Map.Entry<String, String> m1 = it1.next();
			
			if (m1.getValue().equals(v)) {
				System.out.println("Value " + v + " exists");
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("Using Iterator to loop through the map.");
		Set<Entry<String, String>> set2 = ob.entrySet();
		Iterator<Entry<String, String>> it2 = set2.iterator();
		
		while (it2.hasNext()) {
			Map.Entry<String, String> m2 = it2.next();
			System.out.println(m2);
		}
		
	}

}
