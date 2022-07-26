/*Design a class that can be used by a health care professional to keep track of a patient�s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI is weight (in kg) � height*height(in metres).
Create an object of the Patient class and check the results.*/

import java.util.Scanner;

public class Patient {
	String patientName;
	double height;
	double width;

	Patient(String patientName, double height, double width) {
		this.patientName = patientName;
		this.height = height;
		this.width = width;
	}

	double computeBMI() {
		return (width / (height * height));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Weight");
		double w = sc.nextDouble();
		System.out.println("Enter height");
		double h = sc.nextDouble();
		Patient ob = new Patient(name, h, w);
		System.out.println("BMI: " + ob.computeBMI());

	}

}
