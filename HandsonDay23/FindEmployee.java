
package com.java;

import javax.persistence.*;

@Entity

@Table(name = "employeeinfo")

class EmployeeEntity {

	@Id

	private int empno;

	private String empname;

	private String designation;
	private double sal;

	public EmployeeEntity(int empno, String empname, String designation, double sal) {

		super();

		this.empno = empno;

		this.empname = empname;

		this.designation = designation;
		this.sal = sal;
	}

	public EmployeeEntity() {

		super();

	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}

public class FindEmployee {

	public static void main(String args[])

	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee_details");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		System.out.println("inserting");

		EmployeeEntity e1 = new EmployeeEntity();

		e1.setEmpno(107);

		e1.setEmpname("sakshi");

		e1.setDesignation("dev");

		e1.setSal(50000);

		EmployeeEntity e2 = new EmployeeEntity();

		e2.setEmpno(108);

		e2.setEmpname("sahil");

		e2.setDesignation("dev");

		e2.setSal(50000);

		em.persist(e1);

		em.persist(e2);

		em.getTransaction().commit();

		System.out.println("Inserted Successfully");

		System.out.println("Find Employee");

		EmployeeEntity s = em.find(EmployeeEntity.class, 105);

		System.out.println("Employee id = " + s.getEmpno());

		System.out.println("Employee Name = " + s.getEmpname());

		System.out.println("Designation = " + s.getDesignation());

		System.out.println("Salary = " + s.getSal());

//		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");
//
//		    EntityManager em=emf.createEntityManager();

		System.out.println("Update");

		em.getTransaction().begin();
		Query q = em.createQuery("update EmployeeEntity set sal=10000 where empno=108");

		int i = q.executeUpdate();

		System.out.println(i);

		em.getTransaction().commit();
		System.out.println("Updated Successfully");

//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");
//
//	    EntityManager em=emf.createEntityManager();

		System.out.println("deleting");
		em.getTransaction().begin();
		Query q1 = em.createQuery("delete EmployeeEntity where empno=108");

		int i1 = q.executeUpdate();

		System.out.println(i1);
		em.getTransaction().commit();
		System.out.println("deleted succssfully");

	}

}
