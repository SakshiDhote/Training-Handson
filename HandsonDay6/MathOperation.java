/* Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.
Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled. */

import java.util.InputMismatchException;

public class MathOperation {

	public static void main(String[] args) {
		int[] array = new int[5];
		try
		{
			
			int sum = 0;
			for(int i=0; i<array.length; i++)
			{
				int a =Integer.parseInt(args[i]);
				array[i]=a;
				sum += array[i];
			}
			int avg = sum / 5;
			System.out.println("Sum of array is: " + sum + " and average is :" + avg);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
	}

}
