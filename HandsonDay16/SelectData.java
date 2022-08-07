/*Display Student details

Write the code to display details of all the students, if no roll no. is passed, while executing the main program.

If while executing the main program, the roll no. is passed, then it should display the record of that particular student.



*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SelectData {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");

		Statement st = con.createStatement();
		String query = "select * from student where rollno=1";
		ResultSet rs = st.executeQuery(query);
		
		
		
		while (rs.next()) {
			 int roll = rs.getInt(1);
			 String name=rs.getString(2);
			 String std=rs.getString(3);
			 String dob=rs.getString(4);
			 double fees=rs.getDouble(5);
			System.out.println(roll+" "+name+" "+std+" "+dob+" "+fees);
		}
		
		

	}

}
