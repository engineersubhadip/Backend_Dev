package Threads3.Future;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(10);

		ArrayList<Future<String>> promises = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			Greetings greet1 = new Greetings();
			Future<String> fut = es.submit(greet1);
			promises.add(fut);
		}

		for (Future<String> currGreet : promises) {
			String result = currGreet.get(); // A potential blocking statement
			System.out.println(result);
		}

		es.shutdown();
		/*
		 * Single Task :-
		 * 
		 * ExecutorService es = Executors.newFixedThreadPool(1);
		 * 
		 * Greetings greet = new Greetings();
		 * 
		 * Future<String> fut = es.submit(greet);
		 * 
		 * System.out.println("I am doing unrelated task");
		 * 
		 * System.out.println(fut.get()); // A potential blocking statement
		 * 
		 * System.out.println("I am to be executed next");
		 * 
		 * es.shutdown();
		 */
	}

}
