package Employees;
public class Main {

	public static void main(String[] args) {
		System.out.println("{{__  basha El balad  __}}\n");
		
		Employee Emp_1 = new Employee("khaled gamal", "backend Developer", 50000);
		Emp_1.EmployeeDetails();
		Emp_1.raiseSalary(10);
		
	    System.out.println("\nEmployee information after salary increase");
	    Emp_1.EmployeeDetails();

	}

}
