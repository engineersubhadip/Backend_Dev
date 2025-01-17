package MultiThreading.ExecutorsAndCallables.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService es = Executors.newFixedThreadPool(10);

		for (int i = 1; i <= 100; i++) {
			PrintNumber task = new PrintNumber(i);
			es.submit(task);
		}

		es.close();
	}

}
