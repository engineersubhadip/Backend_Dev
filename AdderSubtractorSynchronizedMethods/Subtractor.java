package AdderSubtractorSynchronizedMethods;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
	private Count count;

	public Subtractor(Count count) {
		this.count = count;
	}

	public Void call() {
		count.decrementValue(35);
		return null;
	}
}
