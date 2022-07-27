
/*  Create an application for employee management with the following classes:
a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender
v)float salary
vi) void GetEmployeeDetails() -> prints employee details
b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)Vector;
ii) boolean addEmployee(Employee e) -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId) ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId) -> returns the payslip of the employee with the given empId
Provide implementation for all the methods and test your program
*/


import java.util.Iterator;
import java.util.Vector;


class Employee2 {
	int empId;
	String empName;
	String empEmail;
	char empGender;
	float empSalary;

	public Employee2(int empId, String empName, String empEmail, char empGender, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public char getEmpGender() {
		return empGender;
	}

	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String GetEmployeeDetails() {
		return "EmpId=" + empId + ", EmpName=" + empName + ", EmpEmail=" + empEmail + ",EmpGender=" + empGender
				+ ", EmpSalary=" + empSalary;
	}

	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empGender="
				+ empGender + ", empSalary=" + empSalary + "]";
	}

}

class EmployeeDB2 {
	Vector<Employee2> list = new Vector<>();

	public boolean addEmployee(Employee2 e) {
		return list.add(e);
	}

	public boolean deleteEmployee(int empId) {
		boolean Removed = false;
		Iterator<Employee2> it = list.iterator();
		while (it.hasNext()) {
			Employee2 e = it.next();
			if (e.empId == empId) {
				Removed = true;
				it.remove();
			}
		}
		return Removed;
	}

	public String showPaySlip(int empId) {
		Iterator<Employee2> it = list.iterator();
		String s = "";
		while (it.hasNext()) {
			Employee2 e = it.next();
			if (e.empId == empId) {
				s += e.empSalary;
				return s;
			}
		}
		return s;
	}

	public void vectorMethod() {

		Iterator<Employee2> it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
	}

}
public class TestVector {

	
	public static void main(String[] args) {

		Employee2 emp1 = new Employee2(1, "Sakshi", "sakshi@gmail.com", 'f', 25000);
		Employee2 emp2 = new Employee2(2, "Sahil", "sahil@gmail.com", 'm', 35000);
		Employee2 emp3 = new Employee2(3, "Manthan", "manthan@gmail.com", 'm', 25000);
		Employee2 emp4 = new Employee2(4, "Mayank", "mayank@gmail.com", 'm', 55000);
		System.out.println(emp4.GetEmployeeDetails());

		EmployeeDB2 empdb = new EmployeeDB2();
		empdb.addEmployee(emp1);
		empdb.addEmployee(emp2);
		empdb.addEmployee(emp3);
		empdb.addEmployee(emp4);

		System.out.println("After Adding Employee");
		empdb.vectorMethod();
		System.out.println("Pay Slip "+empdb.showPaySlip(2));
		System.out.println("After Deleting Employee");
		System.out.println(empdb.deleteEmployee(1));
		empdb.vectorMethod();

	}
	
}
