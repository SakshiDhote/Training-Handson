/* Create a school application with a class called Person. Create name and dateOfBirth as member variables.
Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary,
and the subject that the teacher teaches.
Create a class called Student that inherits from Person class. This class will have a member variable called studentId.
Create a class called College Student that inherits from Student class. This class will have collegeName,
the year in which the student is studying (first/second/third/fourth) etc.
Create objects of each of this classes, invoke and test the methods that are available in these classes. */


import java.util.Scanner;

class Person1 {

	String name;
	String dateOfBirth;

	Person1(String name, String dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}

class Teacher extends Person1 {
	double salary;
	String subject;

	Teacher(double salary, String subject, String name, String dateOfBirth) {
		super(name, dateOfBirth);
		this.salary = salary;
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}

class Student extends Person1 {
	String studentId;

	Student(String studentId, String name, String dateOfJoining) {
		super(name, dateOfJoining);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}

class CollegeStudent extends Student {
	String collegeName;
	String year;

	CollegeStudent(String collegeName, String year, String studentId, String name, String dateOfJoining) {
		super(studentId, name, dateOfJoining);
		this.collegeName = collegeName;
		this.year = year;

	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("-: Enter person Details :-");
		System.out.println("Enter Person Name:");
		String pname = sc.nextLine();
		System.out.println("Enter Person Date of Birth:");
		String pdob = sc.nextLine();
		Person1 p = new Person1(pname, pdob);

		System.out.println("-: Enter Teacher Details :-");
		System.out.println("Enter Teacher Name:");
		String tname = sc.nextLine();
		System.out.println("Enter Teacher Date of Birth:");
		String tdob = sc.nextLine();
		System.out.println("Enter Salary:");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Subject:");
		String subject = sc.nextLine();
		Teacher t = new Teacher(salary, subject, tname, tdob);

		System.out.println("-: Enter Student Details :-");
		System.out.println("Enter Student ID:");
		String sid = sc.nextLine();
		System.out.println("Enter Student Name:");
		String sname = sc.nextLine();
		System.out.println("Enter Student Date of Birth:");
		String sdob = sc.nextLine();
		Student s = new Student(sid, sname, sdob);

		System.out.println("-: Enter College Student Details :-");
		System.out.println("Enter College Student ID:");
		String csid = sc.nextLine();
		System.out.println("Enter College Student Name:");
		String csname = sc.nextLine();
		System.out.println("Enter Student Date of Birth:");
		String csdob = sc.nextLine();
		System.out.println("Enter College name:");
		String cname = sc.nextLine();
		System.out.println("Enter Year:");
		String cyear = sc.nextLine();
		CollegeStudent cs = new CollegeStudent(cname, cyear, csid, csname, csdob);

		System.out.println("-: Person Details :-");
		System.out.println("Person Name : " + p.getName());
		System.out.println("Person Date Of Birth : " + p.getDateOfBirth());
		System.out.println();

		System.out.println("-: Teacher Details :-");
		System.out.println("Teacher Name : " + t.getName());
		System.out.println("Teacher Date Of Birth : " + t.getDateOfBirth());
		System.out.println("Teacher Salary : " + t.getSalary());
		System.out.println("Teacher Subject : " + t.getSubject());
		System.out.println();

		System.out.println("-: Student Details :-");
		System.out.println("Student ID : " + s.getStudentId());
		System.out.println("Student Name : " + s.getName());
		System.out.println("Student Date Of Birth : " + s.getDateOfBirth());
		System.out.println();

		System.out.println("-: College Student Details :-");
		System.out.println("College Student ID : " + cs.getStudentId());
		System.out.println("College Student Name : " + cs.getName());
		System.out.println("College Student Date Of Birth : " + cs.getDateOfBirth());
		System.out.println("College name : " + cs.collegeName);
		System.out.println("College Year : " + cs.year);
		System.out.println();

	}

}
