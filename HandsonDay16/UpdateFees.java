import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 Modification of Student record
When there is a change in the fee to be paid by a student, the respective row should be appropriately updated.
Pass the rollno from the command prompt along with the new fee amount and this amount should be reflected in the table
 for that particular student.
 */


public class UpdateFees {

	public static void main(String[] args) throws Exception

	 {

	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");

	 String query="update student set fees=? where rollno=?";

	 PreparedStatement ps=con.prepareStatement(query);

	 ps.setDouble(1, 15000);

	 ps.setInt(2, 1);

	 int i=ps.executeUpdate();

	  if(i>0)

	  {

	  System.out.println("success");

	  }

	 }

}
