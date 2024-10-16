package Practice;

public class Client {

	public static void main(String[] args) {
		A obj = new A();
//		obj.value = 22.43; // not allowed
		System.out.println(obj.value);
		
		B obj1 = new B();
		System.out.println(obj1.value);
		
		A obj2 = new B();
		System.out.println(obj2.value);
	}

}
