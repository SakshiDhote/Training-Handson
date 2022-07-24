/* Write a program to check if a given number is prime or not.*/

import java.util.Scanner;
public class CheckPrimeNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		boolean a=false;
		for(int i =2;i<=no/2;++i) {
			if(no%i==0) {
				a=true;
				break;
			}
		}
		if(!a) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}

	}

}

