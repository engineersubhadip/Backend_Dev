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
		
		/*
		Product p = Product.getBuilder().setName("Hitachi").setPrice(110).build();
		System.out.println("Product Object: "+p);
		We are NOT getting error here, we are able to create product object. Even If we are missing out on the optional fields
		*/
		
		/*
		Product p = Product.getBuilder().setName("Hitachi").setPrice(98).setHashCode("123#45@zT").build();
		System.out.println("Product Object: "+p);
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getLocation());
		System.out.println(p.getHashCode());
		
		We are NOT getting error here, we are able to create Product object, even if we are missing out on the Optional Field (Location)
		*/
	}

}
