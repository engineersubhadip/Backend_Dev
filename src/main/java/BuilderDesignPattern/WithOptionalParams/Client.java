package BuilderDesignPattern.WithOptionalParams;

public class Client {

	public static void main(String[] args) {
		
//		Mandatory Fields :- Name, Price;
//		Optional Fields :- Location, hashCode;
		
		/* {Missing out on Price}
		Product p = Product.getBuilder().setName("Hitachi").build();
		System.out.println("Product Object: "+p); -> Unable to create object
		We are getting an error here, it says please enter valid price;
		*/
		
		/* {Missing out on Name}
		Product p = Product.getBuilder().setPrice(120).build();
		System.out.println("Product Object: "+p);
		We are getting error here, it says please enter valid name;
		*/
	}

}
