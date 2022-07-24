/* Write a program to receive a color code from the user (an Alphabhet).
The program should then print the color name, based on the color code given.
The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
If color code provided by the user is not valid then print "Invalid Code". */

import java.util.Scanner;
public class Handson7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code of color");
		char code=sc.next().charAt(0);
		if(code=='R') {
			System.out.println("Color is Red");
		}else if(code=='B') {
			System.out.println("Color is Blue");
		}else if(code=='G') {
			System.out.println("Color is Green");
		}else if(code=='O') {
			System.out.println("Color is Orange");
		}else if(code=='Y') {
			System.out.println("Color is Yellow");
		}else if(code=='W') {
			System.out.println("Color is White");
		}else {
			System.out.println("Invalid Code");
		}

	}

}
