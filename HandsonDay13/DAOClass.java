import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class DAOClass {

	public boolean insert(int rollno, String name, String standard, String dob, int fee) throws Exception {
		Scanner sc = new Scanner(System.in);
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");
		 
		 String query = "insert into student values(?,?,?,?,?)";
		 PreparedStatement st = con.prepareStatement(query);
		 try {
		 st.setInt(1, rollno); 	
		
		 st.setString(2,name);
		 
		 st.setString(3,standard);
		 
		 st.setString(4,dob);
		 
		 st.setInt(5,fee);
		 return true;
		 }catch(SQLException e) {
				return false;
			}	 

	}

	public boolean modify(int rollno, int fee) throws Exception {

		Scanner sc = new Scanner(System.in);
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");
	
		 String sql = "UPDATE student SET fees = ? WHERE rollno = ?";
		 PreparedStatement st = con.prepareStatement(sql);
			
			try {
				st = con.prepareStatement(sql);
				st.setInt(1, fee);
				st.setInt(2, rollno);
				st.executeUpdate();
				
				return true;
			} catch (SQLException e) {
				return false;
			}
	}

	public  boolean delete(int rollno) throws Exception{

		Scanner sc = new Scanner(System.in);
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");
	
		 String sql = "DELETE student WHERE rollno = ?";
		 PreparedStatement st = con.prepareStatement(sql);
			
			try {
				st = con.prepareStatement(sql);
				st.setInt(1, rollno);
				st.executeUpdate();
				
				return true;
			} catch (SQLException e) {
				return false;
			}
	
	}

	public boolean display() throws Exception {
		Scanner sc = new Scanner(System.in);
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");
	
		 String sql = "SELECT * FROM student";
		 PreparedStatement st = con.prepareStatement(sql);
			
			try {
				st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();
				ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
				
				while (rs.next()) {
					StringBuilder sb = new StringBuilder();
					
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						String colName = rsmd.getColumnName(i);
						
						sb.append(rs.getObject(colName));
						if (i != rsmd.getColumnCount()) sb.append(", ");
					}
					
					System.out.println(sb);
				}
				
				return true;
			} catch (SQLException e) {
				return false;
			}
	}
}
