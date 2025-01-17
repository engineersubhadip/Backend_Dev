package Sorting_ArrayList_Comparable;
import java.util.*;

public class Client {
	
	static void displayEmployees(ArrayList<Person> persons)
	{
		for (Person person : persons)
		{
			System.out.println(person);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons = new ArrayList<>();
		
		persons.add(new Person("A",22,1472));
		persons.add(new Person("B",38,8832));
		persons.add(new Person("D",19,7423));
		persons.add(new Person("E",37,4652));
		persons.add(new Person("C",29,6438));
		
		System.out.println("Before Sorting ......");
		System.out.println();
		
		displayEmployees(persons);
		System.out.println();
		Collections.sort(persons);
		System.out.println();
		System.out.println("After Sorting .......");
		System.out.println();
		
		displayEmployees(persons);
		
	}

}
