package Sorting_ArrayList_Comparable;

public class Person implements Comparable<Person>{
	String name;
	int age;
	int empId;
	
	Person(String name, int age, int empId)
	{
		this.name = name;
		this.age = age;
		this.empId = empId;
	}
	
	public int compareTo(Person O)
	{
		return this.empId - O.empId;
	}
	
	
	public String toString() {
		return "Name : "+this.name+" Age : "+this.age+" EmployeeID : "+this.empId;
	}

}
