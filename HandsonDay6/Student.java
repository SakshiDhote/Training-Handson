/* Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String nameA = sc.nextLine();
		String subA1 = sc.nextLine();
		String subA2 = sc.nextLine();
		String subA3 = sc.nextLine();
		int avgA=0;
		
		try {
			int a1 = Integer.parseInt(subA1);
			int a2 = Integer.parseInt(subA2);
			int a3 = Integer.parseInt(subA3);
			
			avgA=(a1+a2+a3)/3;
			System.out.println(avgA);
		}catch(NumberFormatException e){
			System.out.println("java.lang.NumberFormatException");
		}
		String nameB = sc.nextLine();
		String subB1 = sc.nextLine();
		String subB2 = sc.nextLine();
		String subB3 = sc.nextLine();
		int avgB=0;
		try {
			int b1 = Integer.parseInt(subB1);
			int b2 = Integer.parseInt(subB2);
			int b3 = Integer.parseInt(subB3);
			avgB=(b1+b2+b3)/3;
			System.out.println(avgB);
		}catch(NumberFormatException e){
			System.out.println("java.lang.NumberFormatException");
		}
		

	}

}
