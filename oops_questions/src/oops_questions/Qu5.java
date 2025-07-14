package oops_questions;
 class Person{
	private String name;
	public Person(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
 }
 
class Employee extends Person {
	 private double annualSalary;
	 private int yearStarted;
	 private String nationalInsuranceNumber;
	 public Employee(String name, double annualSalary, int yearStarted, String InsuranceNumber) {
		 super(name);
		 this.annualSalary=annualSalary;
		 this.yearStarted=yearStarted;
		 this.nationalInsuranceNumber=nationalInsuranceNumber; 
		
	}
	 public double getAnnualSalary() {
		 return annualSalary;
		 
	 }

	    public void setAnnualSalary(double annualSalary) {
	        this.annualSalary = annualSalary;
	    }

	    public int getYearStarted() {
	        return yearStarted;
	    }

	    public void setYearStarted(int yearStarted) {
	        this.yearStarted = yearStarted;
	    }

	    public String getNationalInsuranceNumber() {
	        return nationalInsuranceNumber;
	    }

	    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
	        this.nationalInsuranceNumber = nationalInsuranceNumber;
	    }
	    public class TestEmployee {
	        public static void main(String[] args) {
	            Employee employee = new Employee("Name", 0.0, 0, "ID");
	            System.out.println("Employee Name: " + employee.getName());
	            System.out.println("Annual Salary: " + employee.getAnnualSalary());
	            System.out.println("Year Started: " + employee.getYearStarted());
	            System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
	            employee.setAnnualSalary(0.0);
	            System.out.println("Updated Annual Salary: " + employee.getAnnualSalary());
	        }
	    }
} 
