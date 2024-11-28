package Interface3;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fly f = new SlowFlight();
		f.flightAlgo();

		f = new FastFlight();
		f.flightAlgo();

		System.out.println("--------------");

		Sparrow sp = new Sparrow();

		sp.setSocket(new SlowFlight());

		sp.fly();

		sp.setSocket(new FastFlight());

		sp.fly();
	}

}
