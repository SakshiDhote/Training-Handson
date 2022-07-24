/*Write a program to print the sum of all the digits of a given number.
Example1)
I/P:1234
O/P:10*/

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, d = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		while (no > 0) {
			d = no % 10;
			sum = sum + d;
			no = no / 10;

		}
		System.out.println("Sum= " + sum);

	}

}
