package AdderSubtractorSynchronized;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

	private Count count;

	public Adder(Count count) {
		this.count = count;
	}

	public Void call() {

		for (int i = 1; i <= 10000; i++) {
			synchronized (count) { // input will be the shared object that we want to lock
				this.count.value += i;
			}
		}
		return null;
	}
}
