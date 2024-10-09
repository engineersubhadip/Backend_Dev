package Company_System;

public class Department {
	String departmentName;
	Employee manager;
	
	Department(String departmentName, Employee manager)
	{
		this.departmentName = departmentName;
		this.manager = new Employee(manager);
	}
	
	Department(Department D)
	{
		this.departmentName = D.departmentName;
		this.manager = new Employee(D.manager);
	}
	
	void displayDepartment()
	{
		System.out.println("Department Name : "+this.departmentName);
		System.out.println("----------------------------------------");
		this.manager.displayEmployee();
	}
}
