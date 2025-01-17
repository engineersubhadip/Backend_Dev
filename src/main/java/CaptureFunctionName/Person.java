package CaptureFunctionName;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void speak() {
		String methodName = CustomMethodCapture.methodName();
		System.out.println("Method Name " + methodName);
	}
}
