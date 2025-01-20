package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
		/*
		 * Now in the Future if other types of ordering comes into picture.
		 * Lets say we want to order the Student object via their age.
		 * We should not touch their natural ordering.
		 * Now we should implement the Comparator Interface.
		 */
		
		Collections.sort(studentList, new Comparator<Student>() {
			public int compare (Student s1, Student s2) {
				if (s1.age < s2.age) {
					return -1;
				} else if (s2.age < s1.age) {
					return 1;
				} else {
					return 0;
				}
				
//				return s1.name.compareTo(s2.name); // this is also valid for String comparison
			}
		});
		
		System.out.println("********** Changed the natural ordering of Student Object ***********");
		
		for (int j=0; j<studentList.size(); j++) {
			System.out.println("id "+studentList.get(j).id+" name "+studentList.get(j).name);
		}
	}

}
