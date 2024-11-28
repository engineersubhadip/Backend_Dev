package SingletonDesignPattern;

import System.out.SingletonDesign_V4;

public class Client {

	public static void main(String[] args) {

		/*
		 * Not a singleton as multiple objects are getting created :-
		 * 
		 * SingletonDesign_V1 ob1 = new SingletonDesign_V1("a", "k", 23);
		 * 
		 * SingletonDesign_V1 ob2 = new SingletonDesign_V1("b", "k", 24);
		 */

		/*
		 * Not a singleton as multiple objects are getting created :-
		 * 
		 * SingletonDesign_V2 ob1 = new SingletonDesign_V2();
		 * 
		 * SingletonDesign_V2 ob2 = new SingletonDesign_V2();
		 * 
		 * System.out.println(ob1);
		 * 
		 * System.out.println(ob2);
		 * 
		 */

		/*
		 * Not a singleton as more than 1 object is getting created
		 * 
		 * SingletonDesign_V3 ob1 = SingletonDesign_V3.setObject();
		 * 
		 * // System.out.println(ob1.name); // System.out.println(ob1.city); //
		 * System.out.println(ob1.age);
		 * 
		 * SingletonDesign_V3 ob2 = SingletonDesign_V3.setObject();
		 * 
		 * System.out.println(ob1); System.out.println(ob2);
		 * 
		 * "obj" is a local variable.
		 * 
		 */

//		Version 4 :-

		SingletonDesign_V4 ob1 = SingletonDesign_V4.setObject();

		System.out.println(ob1);

		SingletonDesign_V4 ob2 = SingletonDesign_V4.setObject();

		System.out.println(ob2);
	}

}
