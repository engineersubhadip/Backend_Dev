package Practice;

public class Client2 {

	public static void main(String[] args) {
		Sparrow sp = new Sparrow();
		sp.eat();
		sp.fly();

		Penguin pg = new Penguin();
		pg.eat();
//		pg.fly(); -> Will throw error

	}

}
