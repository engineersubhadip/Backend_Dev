package Inheritance2;

public class Client {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.Brake();
		obj.Gear();
		obj.fun();
		
		obj.getColour();

	}
}
// Concept :-

/*
 class A {
 int i = 10;
 }
 
 class B extends A{
 int i = 20;
 }
 
 class Client {
 main() {
 
 A a = new B(); -> The object of Class B should refer to the properties of Class A
 
 B b = new B(); -> The object of Class B should refer to the properties of Class B
 
 a.i -> 10
 b.i -> 20
 }
 }
 */
