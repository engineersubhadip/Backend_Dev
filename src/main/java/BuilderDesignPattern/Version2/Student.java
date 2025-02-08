package BuilderDesignPattern.Version2;

import javax.naming.directory.InvalidAttributeValueException;

public class Student {

	private int age;
	private String name;
	private int psp;
	private String email;

	public Student(Builder builder) throws InvalidAttributeValueException {

		if (builder.name == null || builder.name.length() == 0) {
			throw new InvalidAttributeValueException("Name cannot be null or empty");
		}
		this.name = builder.name;
		if (builder.age < 0 || builder.age > 120) {
			throw new InvalidAttributeValueException("Age should be between 1 and 120");
		}
		this.age = builder.age;
		if (builder.psp < 0 || builder.psp > 100) {
			throw new InvalidAttributeValueException("PSP should be between 1 and 100");
		}
		this.psp = builder.psp;
		if (builder.email == null || builder.email.contains("@") == false) {
			throw new InvalidAttributeValueException("Email cannot be null or it should contain @");
		}
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
