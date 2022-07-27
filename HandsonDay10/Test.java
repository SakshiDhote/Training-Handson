

/*  Create an application for employee management with the following classes:
a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender
v)float salary
vi) void GetEmployeeDetails() -> prints employee details
b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e) -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId) ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId) -> returns the payslip of the employee with the given empId
Provide implementation for all the methods and test your program
*/

import java.util.ArrayList;
import java.util.Iterator;


class Employee {
	int empId;
	String empName;
	String empEmail;
	char empGender;
	float empSalary;

	public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
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
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empGender="
				+ empGender + ", empSalary=" + empSalary + "]";
	}

}

class EmployeeDB {
	ArrayList<Employee> list = new ArrayList<>();

	public boolean addEmployee(Employee e) {
		return list.add(e);
	}

	public boolean deleteEmployee(int empId) {
		boolean Removed = false;
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.empId == empId) {
				Removed = true;
				it.remove();
			}
		}
		return Removed;
	}

	public String showPaySlip(int empId) {
		Iterator<Employee> it = list.iterator();
		String s = "";
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.empId == empId) {
				s += e.empSalary;
				return s;
			}
		}
		return s;
	}

	public void ArrayListMethod() {

		Iterator<Employee> it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
		

	}
	
	

}

public class Test {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Sakshi", "sakshi@gmail.com", 'f', 25000);
		Employee emp2 = new Employee(2, "Sahil", "sahil@gmail.com", 'm', 35000);
		Employee emp3 = new Employee(3, "Manthan", "manthan@gmail.com", 'm', 25000);
		Employee emp4 = new Employee(4, "Mayank", "mayank@gmail.com", 'm', 55000);
		System.out.println(emp4.GetEmployeeDetails());
		
		EmployeeDB empdb = new EmployeeDB();
		empdb.addEmployee(emp1);
		empdb.addEmployee(emp2);
		empdb.addEmployee(emp3);
		empdb.addEmployee(emp4);

		
		System.out.println("After Adding Employee");
		empdb.ArrayListMethod();
		System.out.println("Pay Slip "+empdb.showPaySlip(2));
		System.out.println("After Deleting Employee");
		System.out.println(empdb.deleteEmployee(1));
		empdb.ArrayListMethod();
		
		
		
		

	}

}
