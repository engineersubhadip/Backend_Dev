package SingletonDesignPattern;

public class SingletonDesign_V3 {
	String name;
	String city;
	int age;

	private SingletonDesign_V3(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public static SingletonDesign_V3 setObject() {
		SingletonDesign_V3 obj = new SingletonDesign_V3("abc", "ghana", 22);
		return obj;
	}
}
