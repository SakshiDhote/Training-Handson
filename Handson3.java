/* Initialize two character variables in a program and display the characters in alphabetical order.
Example1) if the first character is 's' and second character is 'e' then the output should be e,s
Example2) if the first character is 'a' and second character is 'e', then the output should be a,e */

import java.util.Scanner;
class Handson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st character");
		char char1 = sc.next().charAt(0);
		System.out.println("Enter 2nd character");
		char char2 = sc.next().charAt(0);
	
		if (char1>char2) {
			System.out.println(char2 + "," + char1 );
		}
		else {
			System.out.println(char1 + "," + char2 );
		}

	}

}
