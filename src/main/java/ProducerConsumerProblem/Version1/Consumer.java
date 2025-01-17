package ProducerConsumerProblem.Version1;

import java.util.ArrayList;

public class Consumer implements Runnable {

	private ArrayList<String> slots;
	private int maxCap;
	private String name;

	public Consumer(ArrayList<String> slots, int maxCap, String name) {
		this.slots = slots;
		this.maxCap = maxCap;
		this.name = name;
	}

	@Override
	public void run() {
		if (slots.size() > 0) {
			this.slots.removeLast();
		}
	}

}
