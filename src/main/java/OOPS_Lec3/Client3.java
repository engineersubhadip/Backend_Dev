package OOPS_Lec3;

public class Client3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1 = new A();
		
		obj1.x = 20;
		obj1.y = 30;
		
		System.out.println("Calling Non-Static Method via Object reference ....");
		obj1.func();
		
		System.out.println("Calling Static Method via Object reference ....");
		obj1.newFunc(); // error
		
		System.out.println("Calling Static Method via Class Name ....");
		A.newFunc(); // error
		
	}

}
