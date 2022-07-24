import java.util.Scanner;

public class FindNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		int ele;
		System.out.print("Enter the element to find:");
		ele = sc.nextInt();
		boolean flag = false;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == ele) {
				temp = i;
				flag = true;
			}

		}
		if (!flag) {
			System.out.println(-1);
		} else {
			System.out.println(temp);
		}

	}

}
