/* Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
Example1)
i/p:Hello,3
o/p:llollollo */

import java.util.Scanner;

public class RepetitionLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int len = str.length();
		String str2 = "";

		for (int i = 0; i < n; i++) {

			str2 += str.substring(len - n, len);

		}
		System.out.println(str2);

	}

}
