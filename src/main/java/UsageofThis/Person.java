package UsageofThis;

public class Person {

	public String name;
	public int age;

	public Person(String name, int age) {
		System.out.println("Inside Constructor : " + this.getClass().getName());
		System.out.println("Inside Constructor " + this);
		this.name = name;
		this.age = age;
	}

	public Person speak() {
		System.out.println("Inside Speak " + this);
		return this;
	}

	public void run() {
		System.out.println("Inside Run " + this);
	}
}
