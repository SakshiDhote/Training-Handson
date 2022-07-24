/*Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee that will inherit the Person class.
The other data members of the Employee class are annual salary (double), the year the employee started to work,
and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have the necessary constructors and getter/setter methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
*/


import java.util.Scanner;

class Person {
	String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}


public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name:");
		String name = sc.nextLine();		
		System.out.println("Enter Annual Salary");
		double annualSalary=sc.nextDouble();
		System.out.println("Enter year of Joining:");
		int yearOfJoining=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Insurance Number:");
		String nationalInsuranceNo=sc.nextLine();
		
		
		Employee ob = new Employee(name,annualSalary,yearOfJoining,nationalInsuranceNo);
		System.out.println();
		System.out.println("-:Employee Details:- ");
		System.out.println("Person Name : "+ob.name);
		System.out.println("Employee Annual Salary : "+ob.annualSalary);
		System.out.println("Employee Year of Joining : "+ob.yearOfJoining);
		System.out.println("Employee National Insurance Number : "+ob.nationalInsuranceNo);

	}

}
