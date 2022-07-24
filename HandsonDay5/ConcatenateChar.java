/* Given two strings a and b, return a new string, following the rules given below.
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
Example1)
i/p:abcXY123XYijk,XY
o/p:c13i
Example2)
i/p:XY123XY,XY
o/p:13
Example3)
i/p:XY1XY,XY
o/p:11 */

import java.util.Scanner;

public class ConcatenateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String []str =s.split(",") ;
		String str1=str[0];
		String str2=str[1];
		String newstr="";
		System.out.println(str1);
		System.out.println(str2);
		for(int i=0;i<=str1.length()-str2.length();i++) {
			String temp=str1.substring(i, str2.length()+i);
			if(temp.equals(str2)) {
				if(i>0 && i<str1.length()-1) {
					newstr+=str1.charAt(i-1);
					
				}
				if(i>=0 && str2.length()+i<str1.length()) {
					newstr+=str1.charAt(str2.length()+i);
				}
			}
		}
		System.out.println(newstr);
	}

}
