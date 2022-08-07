


/* Write a program in Java to demonstrate Java 8 Lambda Initialization using Callable
Step1: create Java main class LambdaInitialization
Step2: Scan 2 inputs to pass it to Callable Interface call method
Step3: Using lambda expression implement the call method
Sample Input1
Enter the first animal to be stored in callable array
Lion
Enter the second animal to be stored in callable array
Tiger
Sample output1
Lion
Tiger
Sample Input2
Enter the first animal to be stored in callable array
Dog
Enter the second animal to be stored in callable array
Cat
Sample Output2
Dog
Cat */

import java.util.Scanner;

interface Callable {
	public String call(String str1, String str2);
}

public class LambdaInitialization {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first animal to be stored in callable array");

		String name1 = sc.nextLine();
		System.out.println("Enter the second animal to be stored in callable array");

		String name2 = sc.nextLine();

		Callable c = (a, b) -> {
			return (name1 + "\n" + name2);
		};
		System.out.println(c.call(name1, name2));

	}

}
