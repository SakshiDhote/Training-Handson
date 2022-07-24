
public class Employee extends Person {

	double annualSalary;
	int yearOfJoining;
	String nationalInsuranceNo;
	
	public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo) {
		this.name=name;
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}


	public int getYearOfJoining() {
		return yearOfJoining;
	}


	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}


	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}


}
