package Company_System;

public class Employee {
	String name;
	int employeeID;
	
	Employee(String name, int employeeID)
	{
		this.name = name;
		this.employeeID = employeeID;
	}
	
	Employee(Employee E)
	{
		this.name = E.name;
		this.employeeID = E.employeeID;
	}
	
	void displayEmployee()
	{
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee ID : "+this.employeeID);
		System.out.println("-------------------------------");
	}
}
