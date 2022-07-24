/* Initialize a character variable in a program and
print 'Alphabhet' if the initialized value is an alphabhet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the initialized value is anything else.
 */

import java.util.Scanner;
class Handson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		char char1 = sc.next().charAt(0);
		if(Character.isAlphabetic(char1)) {
			System.out.println("Alphabet");
		}else if(Character.isDigit(char1)) {
			System.out.println("Digit");
		}else {
			System.out.println("Special Character");
		}

	}

}
