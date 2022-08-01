/* Write a java program that connects to oracle database, queries the inbuilt table “emp” and

displays the first two columns (empno using column index and ename using column name ) of all the rows. */

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpnoEmpname {

	public static void main(String[] args) throws Exception

	{

		ResultSet rs;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

		Statement st = con.createStatement();
		String query = "select empno,ename from emp;";

		rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("empno: " + rs.getInt(1) + ", ename: " + rs.getString("ename"));
		}

	}

}
