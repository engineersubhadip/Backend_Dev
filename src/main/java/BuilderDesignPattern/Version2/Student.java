package BuilderDesignPattern.Version2;

import javax.management.RuntimeErrorException;

public class Student {

	private int age;
	private String name;
	private int psp;

	private Student(Builder b) {
		// other validations
		this.age = b.getAge();
		this.name = b.getName();
		this.psp = b.getPsp();
	}

	public static Builder getBuilder() { // Since this method is Static, it can only access STATIC attributes/methods
											// inside of it.
											// Therefore, the Builder Class is made STATIC.
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

	public static class Builder {

		private int age;
		private String name;
		private int psp;

		public Student build() { // build student object. So before creating student object, do all the
									// validations and then create the object
			if (this.age < 18 || this.age > 120) {
				throw new RuntimeException("Age cannot be less than 18 or greater than 120");
			}
			if (this.name == null || this.name.length() == 0) {
				throw new RuntimeException("Please enter valid Name");
			}
			if (this.psp < 0 || this.psp > 100) {
				throw new RuntimeException("Please enter valid PSP");
			}
			return new Student(this);
		}

		public int getAge() {
			return age;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public String getName() {
			return name;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public int getPsp() {
			return psp;
		}

		public Builder setPsp(int psp) {
			this.psp = psp;
			return this;
		}
	}

}
