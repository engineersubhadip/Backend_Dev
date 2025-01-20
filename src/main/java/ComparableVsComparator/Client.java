package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student (1,22,"ABC"));
		studentList.add(new Student (4,29,"XYZF"));
		studentList.add(new Student (5,31,"QST"));
		studentList.add(new Student (3,23,"DER"));
		studentList.add(new Student (6,15,"DEF"));
		studentList.add(new Student (2,24,"CFR"));
		
		/*
		Collections.sort(studentList);
		I will get an error at this point because we have not defined the natural ordering of the Student Class
		In Order to implement the natural ordering of the Student class, the student class needs to implement Comparable interface.
		*/
		
		Collections.sort(studentList); // Now this will work as the student class has implemented the Comparable interface
		
		for (int i=0; i<studentList.size(); i++) {
			System.out.println("id "+studentList.get(i).id+" name "+studentList.get(i).name);
		}
		
		/*
		 * Therefore to define natural ordering for an user defined data type we will use <<Comparable>>
		 */
	}

}
