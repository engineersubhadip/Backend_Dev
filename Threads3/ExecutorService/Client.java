package Threads3.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {

		System.out.println("Entering into the Main Thread located at : " + Thread.currentThread().getName());

		/*
		 * This is very performant Code -> As the number of Threads increases, more
		 * context switch happens leading to less optimal and slower execution of the
		 * task for (int i = 1; i <= 100; i++) { NumberPrinter np = new
		 * NumberPrinter(i); // Creating task Thread t = new Thread(np); // Creating
		 * Thread and assigning task to that thread t.start(); }
		 */

//		Remedy of the above problem is ExecutorService/Thread Pool

		ExecutorService es = Executors.newFixedThreadPool(10);

		for (int i = 1; i <= 100; i++) {
			NumberPrinter np = new NumberPrinter(i);
			es.submit(np);
		}

		System.out.println("Exiting from the Main Thread located at : " + Thread.currentThread().getName());

		es.shutdown();
	}

}
