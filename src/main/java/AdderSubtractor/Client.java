package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Count c = new Count();

		Adder task1 = new Adder(c);
		Subtractor task2 = new Subtractor(c);

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<Void> val1 = es.submit(task1);
		Future<Void> val2 = es.submit(task2);

		val1.get();
		val2.get();

		System.out.println("Updated value of Count : " + c.value);
		es.shutdown();
	}

}
