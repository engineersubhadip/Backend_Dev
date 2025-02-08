package BuilderDesignPattern.Version2;

import javax.naming.directory.InvalidAttributeValueException;

public class Builder {
	
	int age;
	String name;
	int psp;
	String email;
	
	public Student getBuild() throws InvalidAttributeValueException { // We have moved the validations from Student Constructor to getBuild() -> To maintain better SRP.
		if (name == null || name.length() == 0) {
			throw new InvalidAttributeValueException("Name cannot be null or empty");
		}
		if (age < 0 || age > 120) {
			throw new InvalidAttributeValueException("Age should be between 1 and 120");
		}
		if (psp < 0 || psp > 100) {
			throw new InvalidAttributeValueException("PSP should be between 1 and 100");
		}
		if (email == null || email.contains("@") == false) {
			throw new InvalidAttributeValueException("Email cannot be null or it should contain @");
		}
		return new Student(new Builder());
	}
}
