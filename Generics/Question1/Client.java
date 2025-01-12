package Generics.Question1;

public class Client {

	public static void main(String[] args) {

		Point p1 = new Point(12, 13);
//		Lets see why are we using try-catch inside ".equals()".
//		What significance does Object obj has.

//		1. We can send in any kinds of data inside ".equals()".
//		If lets say we are sending in null,String,Double,Long -> The method should return False.
//		try-catch() block will ensure that, we are doing explicit type casting to the Point object.
//		If it fails, we will return false.

//		System.out.println(p1.equals("hello world !"));
//		System.out.println(p1.equals(22));

//		2. We are comparing 2 objects of Point Class
		Point p2 = new Point(12, 22);

//		System.out.println(p1.equals(p1));
		System.out.println(p2.equals(p1));
	}

}
