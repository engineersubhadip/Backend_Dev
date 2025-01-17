package AdderSubtractorSynchronized;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
	private Count count;

	public Subtractor(Count count) {
		this.count = count;
	}

	@Override
	public Void call() throws Exception {
		for (int i = 1; i <= 10000; i++) {
			synchronized (count) { // input will be the shared object that we want to lock
				this.count.value -= i;
			}
		}
		return null;
	}

}
