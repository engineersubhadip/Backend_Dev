package CopyConstructor;

public class Product {
	
	String name;
	int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(Product p) {
		this.name = p.name;
		this.price = p.price;
	}
}
