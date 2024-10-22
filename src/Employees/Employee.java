package Employees;

public class Employee {

		private String name;
	    private String jobTitle;
	    private double salary;

	    public Employee(String name, String jobTitle, double salary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	    }


	    public void raiseSalary(double percentage) {
	        if (percentage > 0) {
	            double raise = salary * (percentage / 100);
	            salary += raise;
	            System.out.println("Salary raised by " + percentage + "%. New salary: " + salary);
	        } else {
	            System.out.println("Invalid percentage. It should be positive.");
	        }
	    }
	    
	    
	    public void EmployeeDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Job Title: " + jobTitle);
	        System.out.println("Salary: " + salary);
	    }
	    
}
