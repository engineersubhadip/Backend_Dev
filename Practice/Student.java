package Practice;

public class Student {
	private int age;
	private String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Student(Student st) {
		this.age = st.age;
		this.name = st.name;
	}
}
