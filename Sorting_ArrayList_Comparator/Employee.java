package Sorting_ArrayList_Comparator;

public class Employee {
	String name;
	int age;
	int empID;
	
	Employee(String name, int age, int empID)
	{
		this.name = name;
		this.age = age;
		this.empID = empID;
	}
	
	public String toString() {
		return "Name : "+this.name+" Age : "+this.age+" EmpID : "+this.empID;
	}
}
