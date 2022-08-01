import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AbcSchool {

	
		public static void main(String[] args) throws Exception

		 {
			Scanner sc = new Scanner(System.in);
		 Class.forName("com.mysql.cj.jdbc.Driver");

		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");

		 
		 String query = "insert into student values(?,?,?,?,?)";
		 PreparedStatement st = con.prepareStatement(query);
		 
		 System.out.print("Enter rollno: ");
			int roll = sc.nextInt();
		 st.setInt(1, roll);
		 
		 System.out.print("Enter Name: ");
			String name = sc.nextLine();	
			
		 st.setString(2,name);
		 sc.nextLine();
		 System.out.print("Enter Standard: ");
			String standard = sc.nextLine();	
		 st.setString(3,standard);
		 
		 System.out.print("Enter DOB: ");
			String dob = sc.nextLine();	
		 st.setString(4,dob);
		 
		 System.out.print("Enter Fees: ");
			int fees = sc.nextInt();	
		 st.setInt(5,fees);
		 
		 
		 int i = st.executeUpdate();
		 if(i>0) {
			 System.out.println("Success");
		 }
		 
	}

}
