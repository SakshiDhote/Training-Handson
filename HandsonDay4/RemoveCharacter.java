/* Write a java program that accepts a string and returns a new string without the first and last character of the input string.
Example1)
i/p:Suman
o/p:uma */

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		int n = str.length();
		System.out.println(str.subSequence(1, n-1));

	}

}
