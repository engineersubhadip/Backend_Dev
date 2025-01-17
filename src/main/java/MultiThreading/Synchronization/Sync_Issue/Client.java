package MultiThreading.Synchronization.Sync_Issue;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Count count = new Count();
//		int count = 0;
		System.out.println("Old Value of Count " + count.value);

		Add task1 = new Add(count);
		Subtract task2 = new Subtract(count);

		ExecutorService es = Executors.newCachedThreadPool();

		Future<Void> one = es.submit(task1);
		Future<Void> two = es.submit(task1);

		one.get();
		two.get();

		System.out.println("Updated Value of Count " + count.value);
	}

}
