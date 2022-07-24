/* Write a program to check if a given integer number is Positive, Negative, or Zero. */


import java.util.Scanner;

class Handson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		if (no > 0) {
			System.out.println("Positive Number");
		} else if (no < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero");
		}

	}
}
