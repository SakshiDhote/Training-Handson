import java.util.Scanner;

public class AsciValue {
	public static void main(String[] args)

	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print((char) arr[i] + " ");

		}

	}

}
