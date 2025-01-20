
package MultiThreading.PrintAlternatively;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class Client {

	public static void main(String[] args) {
		
		Initializer initial = new Initializer(12,13);
		
		Semaphore evenSema = new Semaphore(1);
		Semaphore oddSema = new Semaphore(0);
		
		
		printEven task1 = new printEven(initial, evenSema, oddSema);
		printOdd task2 = new printOdd(initial, evenSema, oddSema);
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Void> ans1 =  es.submit(task1);
		Future<Void> ans2 =  es.submit(task2);
		
		try {
			ans1.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		try {
			ans2.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		es.shutdown();
	}

}
