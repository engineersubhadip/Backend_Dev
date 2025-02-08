package BuilderDesignPattern.Version1;

import javax.naming.directory.InvalidAttributeValueException;

public class Student {

	private int age;
	private String name;
	private int psp;
	private String email;

	public Student(Builder builder) throws InvalidAttributeValueException {
		if (builder.name == null || builder.name.length() == 0) {
			throw new InvalidAttributeValueException();
		}
		this.name = builder.name;
		if (builder.name == null || builder.name.length() == 0) {
			throw new InvalidAttributeValueException();
		}
		if (builder.age < 0 || builder.age > 120) {
			throw new InvalidAttributeValueException();
		}
		this.age = builder.age;
		if (builder.psp < 0 || builder.psp > 100) {
			throw new InvalidAttributeValueException();
		}
		this.psp = builder.psp;
		if (builder.email == null || builder.email.contains("@") == false) {
			throw new InvalidAttributeValueException();
		}
		this.email = builder.email;
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
