/* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America". */

import java.util.Scanner;

public class RemoveXChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		int n=str.length();
		if(str.startsWith("x")&& str.endsWith("x")) {
			System.out.println(str.subSequence(1, n-1));
		}else if(str.startsWith("x")) {
			System.out.println(str.substring(1));
		}else if(str.endsWith("x")) {
			System.out.println(str.substring(0,n-1));
		}
		else {
			System.out.println(str);
		}
	}

}
