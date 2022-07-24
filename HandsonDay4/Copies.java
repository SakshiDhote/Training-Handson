/* Given a string, return a new string made of 'n' copies of the first 2 chars of the original string
where 'n' is the length of the string.
Example1)
i/p:Helloss
o/p:HeHeHeHeHe */

import java.util.Scanner;

public class Copies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		int n = str.length();
		
		String str2 = "";
		
		if (n < 2) str2 = str;
		else str2 = str.substring(0, 2);
		
		String str3 = "";
		
		for (int i = 0; i < n; i++) {
			str3 += str2;
		}
		
		System.out.println(str3);
	}

}
