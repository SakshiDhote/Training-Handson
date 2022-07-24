/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.*/

import java.util.Scanner;

public class Box {
	int width;
	int height;
	int depth;

	Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	int volume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Width");
		int w = sc.nextInt();

		System.out.println("Enter Height");
		int h = sc.nextInt();

		System.out.println("Enter Depth");
		int d = sc.nextInt();

		Box ob = new Box(w, h, d);
		System.out.println("Volume:- " + ob.volume());
	}

}
