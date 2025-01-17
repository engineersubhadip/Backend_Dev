package Company_System;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new Employee("Subhadip",3321);
		Employee e2 = new Employee(e1);
		
		e2.name = "Shambhu";
		e2.employeeID = 53421;
		
		Department d1 = new Department("Shipping",e1);
		Department d2 = new Department(d1);
		
		d2.departmentName = "Logistics";
		d2.manager = e2;
		
		d2.displayDepartment();
		d1.displayDepartment();

	}

}
