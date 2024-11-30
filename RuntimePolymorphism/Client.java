package RuntimePolymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new B();
		A obj3 = new C();
		A obj4 = new A();

		List<A> arr = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj4));

		for (A currObj : arr) {
			currObj.doSomething();
		}
	}

}
