package ProducerConsumerProblem.Version2;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	public static void main(String[] args) {
		ArrayList<Shirts> store = new ArrayList<>();
		int maxCap = 5;
		ExecutorService es = Executors.newCachedThreadPool();

		Lock lock = new ReentrantLock();

		for (int i = 0; i < 10; i++) {
			Shirts shirt = new Shirts("shirt" + i);
			Producer p = new Producer(store, maxCap, shirt, lock);
			Consumer c = new Consumer(store, maxCap, lock);
			es.submit(p);
			es.submit(c);
		}

		es.shutdown();
	}

}
