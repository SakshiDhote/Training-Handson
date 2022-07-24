/* Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
If input is "hi" and "hello", then output will be "hihellohi". */

import java.util.Scanner;

public class ShortLongShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String");
		String str2 = sc.nextLine();
		if(str1.length()==0 || str2.length()==0) {
			System.out.println(str1+str2);
		}else if(str1.length()>str2.length()) {
			System.out.println(str2+str1+str2);
		}else if(str1.length()<str2.length()) {
			System.out.println(str1+str2+str1);
		}else {
			System.out.println("String length should be different");
		}

	}

}
