/* 
Write a program to accept gender ("Male" or "Femalle")  and age from the key board and print the percentage of interest based on the given conditions.
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.) a
 */

import java.util.Scanner;
public class Handson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender");
//		char gender=sc.next().charAt(0);
		String gender = sc.nextLine();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(gender.equals("Female")&& (age>=1&&age<=58)||gender.equalsIgnoreCase("female")) {		
			
				System.out.println("The percentage of intrest is 8.2%");
		}
		else if(gender.equals("Female")&& (age>=59&&age<=100)||gender.equalsIgnoreCase("female")) {
			System.out.println("The percentage of intrest is 9.2%");
		}
		else if(gender.equals("Male")&& (age>=1&&age<=58)||gender.equalsIgnoreCase("male")) {		
			
			System.out.println("The percentage of intrest is 8.4%");
	}
	else if(gender.equals("Male")&& (age>=59&&age<=100)||gender.equalsIgnoreCase("male")) {
		System.out.println("The percentage of intrest is 10.5%");
	}

	}

}
