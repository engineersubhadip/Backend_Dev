package AdderSubtractorSynchronizedMethods;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
	private Count count;

	public Adder(Count count) {
		this.count = count;
	}

	@Override
	public Void call() throws Exception {
		count.incrementValue(25);
		return null;
	}

}
