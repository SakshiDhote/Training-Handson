/* Write a program to reverse a given number and print
Example1)
I/P: 1234
O/P:4321
Example2)
I/P:1004
O/P:4001 */

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int no = sc.nextInt();
		int r=0;
		while(no>0) {
			int re=no%10;
			r=r*10+re;
			no=no/10;
			
		}
		System.out.println(r);

	}

}
