/* Initialize a character variable with an alphabhet in a program.
If the character value is in lowercase, the output should be displayed in uppercase in the following format.
Example1)
i/p:a
o/p:a->A
If the character value is in uppercase, the output should be displayed in lowercase in the following format.
Example2)
i/p:A
o/p:A->a */

import java.util.Scanner;
public class Handson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		char c=sc.next().charAt(0);
		if(Character.isLowerCase(c)) {
			System.out.println(c+"->"+Character.toUpperCase(c));
		}else if(Character.isUpperCase(c))
			System.out.println(c+"->"+Character.toLowerCase(c));
			
	}

}
