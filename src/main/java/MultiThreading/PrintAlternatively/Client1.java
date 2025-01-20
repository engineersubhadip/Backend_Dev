package MultiThreading.PrintAlternatively;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize shared data and semaphores
        Initializer initial = new Initializer(12, 13);
        Semaphore evenSema = new Semaphore(1); // Start with even semaphore unlocked
        Semaphore oddSema = new Semaphore(0);  // Start with odd semaphore locked

        // Create tasks for printing even and odd numbers
        printEven task1 = new printEven(initial, evenSema, oddSema);
        printOdd task2 = new printOdd(initial, evenSema, oddSema);

        // Create an executor service with 2 threads
        ExecutorService es = Executors.newFixedThreadPool(2);

        // Submit tasks to the executor service
        Future<Void> ans1 = es.submit(task1);
        Future<Void> ans2 = es.submit(task2);

        try {
            // Wait for tasks to complete
            ans1.get();
            ans2.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shut down the executor service
            es.shutdownNow();
        }

        System.out.println("Execution completed.");
	}

}
