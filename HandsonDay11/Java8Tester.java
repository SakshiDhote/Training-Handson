/* 1)Write a program in Java to demonstrate Java 8 Functional Interface Predicate feature. The class will print all numbers , even numberrs and number greater than 3 of the numbers in the array list
Step1: create Java main class Java8 Tester
Step2: create a method eval which will take 2 parameters (list of numbers from 1 to 9 and predicate condition)
Step3: call the eval method from main method to print all the even numbers by passing appropriate parameters
Step4: call the eval method from main method to print all the numbers greater than 3 by passing appropriate parameters
Sample output
Print all numbers:
1
2
3
4
5
6
7
8
9
Print even numbers:
2
4
6
8
Print numbers greater than 3:
4
5
6
7
8
9
*/

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Java8Tester {
	/*
	 * public void eval (int number, Predicate<Integer> predicate) {
	 * 
	 * }
	 */
	private static List<Integer> eval(List<Integer> values, Predicate<Integer> predicate) {
		return values.stream().filter(predicate).collect(Collectors.toList());
	}

	public static void main(String[] args) {

//		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		List<Integer> all = eval(list, n -> true);
		System.out.println("All Numbers form 1 to 9");
		Iterator it = all.iterator();
		while (it.hasNext()) {
			Object x = it.next();
			System.out.println(x);
		}

		List<Integer> evenValues = eval(list, n -> n % 2 == 0);
		System.out.println("Even Numbers form 1 to 9");
		Iterator it1 = evenValues.iterator();
		while (it1.hasNext()) {
			Object x = it1.next();
			System.out.println(x);
		}

		List<Integer> greaterThanSix = eval(list, n -> n > 3);
		System.out.println("Numbers greater than 6 form 1 to 9");
		Iterator it2 = greaterThanSix.iterator();
		while (it2.hasNext()) {
			Object x = it2.next();
			System.out.println(x);
		}

	}

}
