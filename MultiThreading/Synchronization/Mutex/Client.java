package MultiThreading.Synchronization.Mutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Count count = new Count();

		System.out.println("Old Value of Count " + count.value);

		Lock lock = new ReentrantLock();

		Add task1 = new Add(count, lock);
		Subtract task2 = new Subtract(count, lock);

		ExecutorService es = Executors.newCachedThreadPool();

		Future<Void> one = es.submit(task1);
		Future<Void> two = es.submit(task2);

		one.get();
		two.get();

		es.shutdown();

		System.out.println("Updated Value of Count " + count.value);
	}

}
