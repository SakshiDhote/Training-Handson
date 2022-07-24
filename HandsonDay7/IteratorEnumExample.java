/* Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator and enumeration to list all the elements of the Vector. */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employee {
	int empid;
	String empname;
	int salary;

	Employee(int empid, String empname,int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary=salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

	
public class IteratorEnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Employee> emp = new Vector<>();
		emp.add(new Employee(1, "Sakshi",10000));
		emp.add(new Employee(2, "Sahil",20000));
		emp.add(new Employee(3, "Divya",3000));
		emp.add(new Employee(4, "Suraj",40000));
		
		System.out.println("Using Iterator");
		Iterator<Employee> it = emp.iterator();
		while (it.hasNext()) {
			 Employee e=it.next();
			System.out.println("ID: "+e.getEmpid()+ "  Name: "+e.getEmpname()+ "  Salary: "+e.getSalary());

		}
		System.out.println();
		System.out.println("Using Enumeration ");

		Enumeration<Employee> en = emp.elements();
		while (en.hasMoreElements()) {
			Employee e=en.nextElement();
			System.out.println("ID: "+e.getEmpid()+ "  Name: "+e.getEmpname()+ "  Salary: "+e.getSalary());
		}
	}

}
