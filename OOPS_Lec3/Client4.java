package OOPS_Lec3;

public class Client4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj1 = new B();
		obj1.x = 20;
		System.out.println("The value of Y is from object ref: "+ obj1.y);
		System.out.println("The value of Y is from class name: "+ B.y);
		obj1.getSum();

	}

}
