package OOPS_Lec3_Access_Modifiers;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Client is a separate class and B is a separate class.
//		But we are able to access/modify the values of B via Client Class
		
		B obj1 = new B();
		
		int result = obj1.getX();
		
		System.out.println("The value of private data is: "+result);
		
		System.out.println("We are setting the value of private data...");
		
		obj1.setX(33);
		
		System.out.println("The updated value of private data member is "+ obj1.getX());
	}

}
