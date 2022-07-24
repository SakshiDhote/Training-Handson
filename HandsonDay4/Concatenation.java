/* Write a java program that will concatenate 2 strings and return the result.
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar
Example2)
i/p:Mark,kate
o/p:markate */

import java.util.Scanner;

public class Concatenation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String");
		String str2 = sc.nextLine();
		str1.toLowerCase();
		str2.toLowerCase();

		if (str1.length() != 0 && str2.length() != 0
                && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			System.out.println(str1 + str2.substring(1));
		}
		else {
			System.out.println(str1 +" "+ str2);
		}
	}
}
