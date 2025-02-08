package BuilderDesignPattern.Version2;

import BuilderDesignPattern.Version2.Student.Builder;

public class Client {

	public static void main(String[] args) {
//		Builder b = Student.getBuilder();
//		b.setAge(28);
//		
//		Student s = new Student(b);
//		System.out.println(s.getAge());
		
		Student s = Student.getBuilder().setAge(12).build();
		System.out.println(s);
		System.out.println(s.getAge());
		
	}

}
