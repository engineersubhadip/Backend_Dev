package Company_System;

public class Company {
	String companyName;
	String location;
	Department department;
	
	Company(String companyName, String location, Department department)
	{
		this.companyName = companyName;
		this.location = location;
		this.department = new Department(department);
	}
	
	Company(Company C)
	{
		this.companyName = C.companyName;
		this.location = C.location;
		this.department = new Department(C.department);
	}
	
	void displayCompany()
	{
		System.out.println("Company Name : "+this.companyName);
		System.out.println("Location : "+this.location);
		System.out.println("-------------------------------------");
		this.department.displayDepartment();
	}
}
