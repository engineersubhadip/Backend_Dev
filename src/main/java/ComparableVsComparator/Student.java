package ComparableVsComparator;

public class Student implements Comparable<Student> {
	
	int id;
	int age;
	String name;
	
	public Student (int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Student student) {
		if (this.id < student.id) {
			return -1;
		} else if (student.id < this.id) {
			return 1;
		} else {
			return 0;
		}
	}
}
