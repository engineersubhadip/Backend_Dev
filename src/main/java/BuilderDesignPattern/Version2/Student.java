package BuilderDesignPattern.Version2;

import javax.naming.directory.InvalidAttributeValueException;

public class Student {

	private int age;
	private String name;
	private int psp;
	private String email;

	public Student(Builder builder) throws InvalidAttributeValueException {

		this.name = builder.name;

		this.age = builder.age;

		this.psp = builder.psp;

		this.email = builder.email;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getPsp() {
		return psp;
	}

	public String getEmail() {
		return email;
	}

}
