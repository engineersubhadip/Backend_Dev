package ProducerConsumerProblem.Version2;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {

	private ArrayList<String> slots;
	private int maxCap;
	private String name;
	private Lock lock;

	public Consumer(ArrayList<String> slots, int maxCap, String name, Lock lock) {
		this.slots = slots;
		this.maxCap = maxCap;
		this.name = name;
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.lock();
		if (this.slots.size() > 0) {
			this.slots.removeLast();
		}
		lock.unlock();
	}

}
