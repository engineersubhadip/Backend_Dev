package ProducerConsumerProblem.Version2;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {
	private ArrayList<String> slots;
	private int maxCap;
	private String name;
	private Lock lock;

	public Producer(ArrayList<String> slots, int maxCap, String name, Lock lock) {
		this.slots = slots;
		this.maxCap = maxCap;
		this.name = name;
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.lock();
		if (this.slots.size() < maxCap) {
			this.slots.add(this.name);
		}
		lock.unlock();
	}
}
