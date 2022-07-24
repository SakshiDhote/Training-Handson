/* Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *
Example1)
i/p:ab*cd
o/p:ad
*/

import java.util.Scanner;

public class RemoveAstrik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		String str2="";
		int len=str.length();
		
		for (int i = 0; i < len; i++) 
		  {
		    if (i == 0 && str.charAt(i) != '*')
		    	str2 += str.charAt(i);
		    if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
		    	str2 += str.charAt(i);
		    if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
		    	str2 = str2.substring(0,str2.length()-1);
		  }
		System.out.println(str2);
	}

}
