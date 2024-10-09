package OOPS_Lec4;

public class Client_Inheritance_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_Inheritance_Basics obj1 = new A_Inheritance_Basics();
		obj1.x = 22;
		obj1.fun1(); // I am from Class A
		
		B_Inheritance_Basics obj = new B_Inheritance_Basics();
		
		obj.fun1(); // I am over-riding the fun1 inherited from Class A
		
		System.out.println(obj.x); // 0
		
		obj.fun2(); // I am from Class B
		
		obj.y = 99;
		obj.x = 98; // Over-riding the value of X inherited from A.
		
		System.out.println("From Class A "+obj1.x); // 22
		System.out.println("From Class B "+obj.x); // 98
	}

}
