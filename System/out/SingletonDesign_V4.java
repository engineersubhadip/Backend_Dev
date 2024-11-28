package System.out;

public class SingletonDesign_V4 {
	String name;
	String city;
	int age;
	private static SingletonDesign_V4 obj = null;
	/*
	 * We have made obj as static Because we are accessing this variable inside
	 * static method "setObject"
	 */

	private SingletonDesign_V4(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public static SingletonDesign_V4 setObject() {
		if (obj == null) {
			obj = new SingletonDesign_V4("a", "b", 11);
		}
		return obj;
	}
}
