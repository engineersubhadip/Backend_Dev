package AdderSubtractorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Count count = new Count();
		Lock lock = new ReentrantLock();

		Adder task1 = new Adder(count, lock);
		Subtractor task2 = new Subtractor(count, lock);

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<Void> ans1 = es.submit(task1);
		Future<Void> ans2 = es.submit(task2);

		ans1.get();
		ans2.get();

		System.out.println("Updated value inside Count object " + count.value);
		es.shutdown();
	}

}
