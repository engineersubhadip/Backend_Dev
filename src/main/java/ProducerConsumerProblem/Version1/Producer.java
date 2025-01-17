package ProducerConsumerProblem.Version1;

import java.util.ArrayList;

public class Producer implements Runnable {
	private ArrayList<String> slots;
	private int maxCap;
	private String name;

	public Producer(ArrayList<String> slots, int maxCap, String name) {
		this.slots = slots;
		this.maxCap = maxCap;
		this.name = name;
	}

	@Override
	public void run() {
		if (this.slots.size() < maxCap) {
			this.slots.add(this.name);
		}
	}
}
