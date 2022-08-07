/*
Deleting a Student’s record
When a student leaves the school, the record related to that student needs to be deleted from the Student table.
The student’s roll no, whose record has to be deleted, should be passed as a command line argument.
Upon deletion, the Student details must be stored in another table named StudentLog which will maintain the details
such as Rollno, StudentName, Standard and Leaving_date.
 */

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class DeleteRecord {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");

		Statement st = con.createStatement();
		String query = "select * from student where rollno=1";
		ResultSet rs = st.executeQuery(query);
		
		int roll = 0;
		String name=null;
		String std=null;
		String dob=null;
		double fees=0;
		
		while (rs.next()) {
			 roll = rs.getInt(1);
			 name=rs.getString(2);
			 std=rs.getString(3);
			 dob=rs.getString(4);
			 fees=rs.getDouble(5);
			System.out.println(roll+" "+name+" "+std+" "+dob+" "+fees);
		}
		System.out.println(roll+" "+name+" "+std+" "+dob+" "+fees);
		
		String query1 = "insert into StudentLog  values(?,?,?,?)";
		PreparedStatement st1 = con.prepareStatement(query);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		
		st1.setInt(1, roll);
		st1.setString(2, name);
		st1.setString(3, std);
		

	}


}
/*
 * String query="delete from employees where eid=?";
 * 
 * PreparedStatement ps=con.prepareStatement(query);
 * 
 * ps.setInt(1, 22);
 * 
 * 
 * int i=ps.executeUpdate();
 * 
 * if(i>0)
 * 
 * {
 * 
 * System.out.println("success");
 * 
 * }
 */
