package AdderSubtractorSynchronized;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Count count = new Count();

		Adder task1 = new Adder(count);
		Subtractor task2 = new Subtractor(count);

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<Void> ans1 = es.submit(task1);
		Future<Void> ans2 = es.submit(task2);

		ans1.get();
		ans2.get();

		System.out.println("Updated value inside Count object " + count.value);
		es.shutdown();
	}
}
