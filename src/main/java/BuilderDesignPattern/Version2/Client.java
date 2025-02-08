package BuilderDesignPattern.Version2;

import javax.naming.directory.InvalidAttributeValueException;

public class Client {

	public static void main(String[] args) throws InvalidAttributeValueException {
		Builder b = new Builder();
		b.age = 23;
		b.email = "a123.com";
		b.name = "";
		b.psp = -123;
		
		Student st = new Student(b);
		System.out.println(st.getEmail());
	}

}
