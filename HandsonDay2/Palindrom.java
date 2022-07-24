/*Write a Java program to find if the given number is palindrome or not
Example1)
I/P: 110011
O/P: 110011 is a palindrome
Example2)
I/P: 1234
O/P: 1234 is not a palindrome */

import java.util.Scanner;
import java.util.Scanner;
public class Palindrom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int no = sc.nextInt();
		int temp=no;
		int r=0;
		while(no>0) {
			int re=no%10;
			r=r*10+re;
			no=no/10;
			
		}
		System.out.println(r);
		if(r==temp) {
			System.out.println(no+" is Palindrom");
		}else {
			System.out.println(no+" is Not Palindrom");
		}

	}

}
