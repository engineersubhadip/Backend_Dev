package MultiThreading.Part_2;

public class Adder implements Runnable {
	int a;
	int b;

	public Adder(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		System.out.println("The value is " + (this.a + this.b));
	}

}
