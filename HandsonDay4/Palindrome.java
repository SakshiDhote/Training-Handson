/* Write a Program to check whether a given String is Palindrome or not. */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		String rstr = "";

		int l = str.length();

		for (int i = (l - 1); i >= 0; --i) {
			rstr = rstr + str.charAt(i);
		}

		if (str.toLowerCase().equals(rstr.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}

	}

}
