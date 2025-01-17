package ProducerConsumerProblem.Version2;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {
	private ArrayList<Shirts> store;
	private int maxCap;
	private Shirts shirt;
	private Lock lock;

	public Producer(ArrayList<Shirts> store, int maxCap, Shirts shirt, Lock lock) {
		this.store = store;
		this.maxCap = maxCap;
		this.shirt = shirt;
		this.lock = lock;
	}

	@Override
	public void run() {
//		while (true) {
		lock.lock();
		if (this.store.size() < maxCap) {
			this.store.add(this.shirt);
			System.out.println("Added to the Store. Current Stock Size " + this.store.size());
		}
		lock.unlock();
//		}
	}
}
