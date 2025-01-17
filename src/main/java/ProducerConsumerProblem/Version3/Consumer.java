package ProducerConsumerProblem.Version3;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

	private CopyOnWriteArrayList<Shirts> store;
	private int maxCap;
	private Semaphore consumerSemaphore;
	private Semaphore producerSemaphore;

	public Consumer(CopyOnWriteArrayList<Shirts> store, int maxCap, Semaphore consumerSemaphore,
			Semaphore producerSemaphore) {
		this.store = store;
		this.maxCap = maxCap;
		this.consumerSemaphore = consumerSemaphore;
		this.producerSemaphore = producerSemaphore;
	}

	@Override
	public void run() {

		try {
			this.consumerSemaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (this.store) {
			this.store.remove(0);
			System.out.println("Removed from Store. Current Stock Size " + this.store.size());
		}

		this.producerSemaphore.release();
	}

}
