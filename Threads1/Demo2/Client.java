package Threads1.Demo2;

public class Client {

	public static void main(String[] args) {

		System.out.println("Inside Client at thread :- " + Thread.currentThread().getName());

		Download d = new Download();

//		We are basically running the Download Class on a seperate Thread

		Thread t = new Thread(d);

		t.start();

		System.out.println("I am still inside Client -> " + Thread.currentThread().getName()); // Still inside Main
																								// Thread
	}

}
