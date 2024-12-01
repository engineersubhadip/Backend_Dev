package Threads1.Assignment.Question1;

public class Client {

	public static void main(String[] args) {
		System.out.println("I am the main class");

		Adder add = new Adder();

		ScalerThread st1 = new ScalerThread(add);

		st1.start();

		Subtractor sub = new Subtractor();

		ScalerThread st2 = new ScalerThread(sub);

		st2.start();
	}

}
