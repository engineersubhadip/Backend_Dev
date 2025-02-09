package CopyConstructor;

public class Client {

	public static void main(String[] args) {
		
		Product p1 = new Product("Hitachi",12);
		
		Product p2 = new Product(p1);
		
		System.out.println("Product1: "+p1);
		System.out.println("Product2: "+p2);
	}

}
