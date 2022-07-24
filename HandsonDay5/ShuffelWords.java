/*  Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod */


import java.util.Scanner;

public class ShuffelWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String []str =s.split(",") ;
		String str1=str[0];
		String str2=str[1];
		StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length() || i < str2.length(); i++) {
            if (i < str1.length())
                result.append(str1.charAt(i));

            if (i < str2.length())
                result.append(str2.charAt(i));
	}
        System.out.println(result.toString());
	}
        

}
