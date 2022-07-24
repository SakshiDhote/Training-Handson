/* Write a program to print * in Floyds format (using for and while loop)
*

* *

* * *
Example1)
I/P: 3
O/P :

*

* *

* * * */

import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any row");
		int no = sc.nextInt();
		System.out.println("Using For Loop");
		
		for(int i=1;i<=no;i++) {
		System.out.println();
		for(int j=1;j<=i;j++) {
			System.out.print("*"+" ");
		}
	}
		
		System.out.println();
		System.out.println("Using While Loop");
		int x=1;
		int y=1;
		while(x<=no) {
			System.out.println();
			while(y<=x) {
				System.out.print("*"+" ");
				y++;
			}
			y=0;
			x++;
		}

	}

}
