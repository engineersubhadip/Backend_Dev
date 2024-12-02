package Threads2.Demo1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am firing up from " + Thread.currentThread().getName());

		for (int i = 1; i <= 100; i++) {
			NumberPrinter np = new NumberPrinter(i); // Task Created
			Thread t = new Thread(np); // Thread t[i], is assigned to task np[i]
			t.start();
		}

		System.out.println("I am tearing down " + Thread.currentThread().getName());
	}

}
