/*Write a program to check if a given integer number is odd or even. */


import java.util.Scanner;
class Handson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		if (no%2 == 0) {
			System.out.println("Even Number");
		}  else {
			System.out.println("Odd Number");
		}

	}

}
