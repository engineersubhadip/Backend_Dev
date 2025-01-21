package SingletonDesignPattern;

public class SingletonDesign_V4 {
	String name;
	String city;
	int age;
	private static SingletonDesign_V4 obj;
	
	private SingletonDesign_V4(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public static SingletonDesign_V4 setObject() {
		
		if (obj == null) {
			obj = new SingletonDesign_V4("A","Mizoram",23);			
		}
		return obj;
	}
}
