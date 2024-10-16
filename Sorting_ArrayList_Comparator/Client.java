package Sorting_ArrayList_Comparator;
import java.util.*;

class customComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.age - e2.age;
	}
}


public class Client {
	
	static void displayEmployees(ArrayList<Employee> employees)
	{
		for (Employee employee : employees)
		{
			System.out.println(employee);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		
//		List of Employees : -
		
		employees.add(new Employee("F",33,1732));
		employees.add(new Employee("G",23,8743));
		employees.add(new Employee("H",19,6342));
		employees.add(new Employee("E",27,4382));
		employees.add(new Employee("B",23,8383));
		
		System.out.println("Before Sorting ...... ");
		displayEmployees(employees);
		
		System.out.println("After Sorting ........");
		
		Collections.sort(employees, new customComparator());
		
		displayEmployees(employees);
		
	}

}
