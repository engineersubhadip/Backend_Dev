package ProducerConsumerProblem.Version3;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

	public static void main(String[] args) {
//		ArrayList<Shirts> store = new ArrayList<>(); // not a thread safe ds
//		ConcurrentSkipListSet<Shirts> store = new ConcurrentSkipListSet<>();
		CopyOnWriteArrayList<Shirts> store = new CopyOnWriteArrayList<Shirts>();

		int maxCap = 5;
		ExecutorService es = Executors.newCachedThreadPool();

		Semaphore producerSema = new Semaphore(maxCap);
		Semaphore consumerSema = new Semaphore(0);

		for (int i = 0; i < 10; i++) {
			Shirts shirt = new Shirts("shirt" + i);
			Producer p = new Producer(store, maxCap, shirt, consumerSema, producerSema);
			Consumer c = new Consumer(store, maxCap, consumerSema, producerSema);
			es.submit(p);
			es.submit(c);
		}

		es.shutdown();
	}

}
