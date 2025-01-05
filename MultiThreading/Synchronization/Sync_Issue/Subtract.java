package MultiThreading.Synchronization.Sync_Issue;

import java.util.concurrent.Callable;

public class Subtract implements Callable<Void> {

	private Count count;
//	private int count;

	public Subtract(Count count) {
		this.count = count;
	}

	@Override
	public Void call() throws Exception {

		for (int i = 1; i <= 10000; i++) {
			this.count.value -= i;
		}

		return null;
	}

}
