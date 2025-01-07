package AdderSubtractorSynchronizedMethods;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Count count = new Count(0);

		Adder task1 = new Adder(count);
		Subtractor task2 = new Subtractor(count);

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<Void> ans1 = es.submit(task1);
		Future<Void> ans2 = es.submit(task2);

		ans1.get();
		ans2.get();

		System.out.println("Updated Value after Thread operation : " + count.value);
		es.shutdown();
	}

}
