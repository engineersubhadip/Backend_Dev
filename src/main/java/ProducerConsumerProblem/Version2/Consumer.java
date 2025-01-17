package ProducerConsumerProblem.Version2;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {

	private ArrayList<Shirts> store;
	private int maxCap;
	private Lock lock;

	public Consumer(ArrayList<Shirts> store, int maxCap, Lock lock) {
		this.store = store;
		this.maxCap = maxCap;
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.lock();
		if (this.store.size() > 0) {
			this.store.removeLast();
			System.out.println("Removed from Store. Current Stock Size " + this.store.size());
		}
		lock.unlock();
	}

}
