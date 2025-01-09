package ProducerConsumerProblem.Version3;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

	private CopyOnWriteArrayList<Shirts> store;
	private int maxCap;
	private Shirts shirt;
	private Semaphore consumerSemaphore;
	private Semaphore producerSemaphore;

	public Producer(CopyOnWriteArrayList<Shirts> store, int maxCap, Shirts shirt, Semaphore consumerSemaphore,
			Semaphore producerSemaphore) {
		this.store = store;
		this.maxCap = maxCap;
		this.shirt = shirt;
		this.consumerSemaphore = consumerSemaphore;
		this.producerSemaphore = producerSemaphore;
	}

	@Override
	public void run() {

		try {
			this.producerSemaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this.store) {
			this.store.add(this.shirt);
			System.out.println("Added to the Store. Current Stock Size " + this.store.size());
		}
		this.consumerSemaphore.release();
	}
}
