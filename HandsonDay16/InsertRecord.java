/*Inserting a record
ABC International School wants to computerize students details. The school maintains a database of students in Oracle.
The student table contains information related to students and is shown in the following student table structure.
Column Name Type Constraint
Rollno Number (4) Primary Key
StudentName Varchar (20) Not Null
Standard Varchar (2) Not Null
Date_Of_Birth Date
Fees Number (9,2)
 When a new student joins the school, the student record is inserted in the student table.
The valid student details are as follows:
• Rollno: Valid value is a 4-digit number
• StudentName: Valid value can contain maximum 20 letters in uppercase
• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
Write a Java program to insert some records to the table
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");

		String query = "insert into student values(?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(query);

		System.out.print("Enter rollno: ");
		int roll = sc.nextInt();
		st.setInt(1, roll);

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		st.setString(2, name);
		sc.nextLine();
		System.out.print("Enter Standard: ");
		String standard = sc.nextLine();
		st.setString(3, standard);

		System.out.print("Enter DOB: ");
		String dob = sc.nextLine();
		st.setString(4, dob);

		System.out.print("Enter Fees: ");
		int fees = sc.nextInt();
		st.setInt(5, fees);

		int i = st.executeUpdate();
		if (i > 0) {
			System.out.println("Success");
		}
	}

}
